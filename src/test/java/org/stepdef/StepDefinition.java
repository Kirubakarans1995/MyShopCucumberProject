package org.stepdef;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	Actions a;
	
	@Given("User have to enter the opencart application through chrome browser")
	public void user_have_to_enter_the_opencart_application_through_chrome_browser() {
	    
		chromeBrowser();
		launchUrl("https://awesomeqa.com/ui/");
		maxWindow();
		applyImplicitWait(10);
		
	}

	@Given("User have to click My Account Drop Down and select Register")
	public void user_have_to_click_My_Account_Drop_Down_and_select_Register() {
		
		WebElement myAccountDropDown = driver.findElement(By.xpath("//a[@title='My Account']"));
		clickMethod(myAccountDropDown);

		WebElement register = driver.findElement(By.xpath("(//a[text()='Register'])[1]"));
		clickMethod(register);

	}

	@When("User have to enter Valid Credentials and accept Privacy Policy Check Box")
	public void user_have_to_enter_Valid_Credentials_and_accept_Privacy_Policy_Check_Box() throws IOException {
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		fillTextBox(firstName, readFromExcel("Register",1 ,0 ));
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		fillTextBox(lastName, readFromExcel("Register",1 ,1 ));
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		fillTextBox(email, readFromExcel("Register",1 ,2 ));
		WebElement telephone = driver.findElement(By.xpath("//input[@name='telephone']"));
		fillTextBox(telephone, readFromExcel("Register",1 ,3 ));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		fillTextBox(password, readFromExcel("Register",1 ,4 ));
		WebElement confirmPass = driver.findElement(By.xpath("//input[@name='confirm']"));
		fillTextBox(confirmPass, readFromExcel("Register",1 ,5 ));
		WebElement checkBox = driver.findElement(By.xpath("//input[@name='agree']"));
		clickMethod(checkBox);
		
	}

	@Then("User have to click Continue button")
	public void user_have_to_click_Continue_button() throws IOException {
		
		WebElement clickContinue = driver.findElement(By.xpath("//input[@value='Continue']"));
		clickMethod(clickContinue);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\Screenshots\\RegisterSuccessful.png");
		FileUtils.copyFile(source, destination);
		
	}

	@Given("User have to enter opencart application through chrome browser")
	public void user_have_to_enter_opencart_application_through_chrome_browser() {
		
		chromeBrowser();
		launchUrl("https://awesomeqa.com/ui/");
		maxWindow();
		applyImplicitWait(10);
		
	}

	@Given("User have to click My Account Drop Down and select Login")
	public void user_have_to_click_My_Account_Drop_Down_and_select_Login() {
		
		WebElement myAccountDropDown = driver.findElement(By.xpath("//a[@title='My Account']"));
		clickMethod(myAccountDropDown);

		WebElement login = driver.findElement(By.xpath("(//a[text()='Login'])[1]"));
		clickMethod(login);
		
	}

	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String user, String pass) {
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		fillTextBox(email, user);

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		fillTextBox(password, pass);
		
	}

	@When("User have to enter Valid Email and Valid Password")
	public void user_have_to_enter_Valid_Email_and_Valid_Password() throws IOException {
						
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));		
		fillTextBox(email, readFromExcel("Login",1 ,0 ));

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));		
		fillTextBox(password, readFromExcel("Login",1 ,1 ));
		
	}

	@Then("User have to click Login button")
	public void user_have_to_click_Login_button() throws IOException {
		
		WebElement loginClick = driver.findElement(By.xpath("//input[@type='submit']"));
		clickMethod(loginClick);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\Screenshots\\LoginUsingExcelSuccessful.png");
		FileUtils.copyFile(source, destination);
		
	}

	@Given("User have to enter into the opencart application through chrome browser")
	public void user_have_to_enter_into_the_opencart_application_through_chrome_browser() {
		
		chromeBrowser();
		launchUrl("https://awesomeqa.com/ui/");
		maxWindow();
		applyImplicitWait(25);
		
	}

	@Given("User have to select the currency and select US Dollar")
	public void user_have_to_select_the_currency_and_select_US_Dollar() {
		
		WebElement currencyClick = driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']"));
		clickMethod(currencyClick);
		WebElement usd = driver.findElement(By.xpath("//button[text()='$ US Dollar']"));
		clickMethod(usd);
		
	}

	@When("User have to search an iPhone in the search field")
	public void user_have_to_search_an_iPhone_in_the_search_field() {
		
		WebElement searchField = driver.findElement(By.xpath("//input[@name='search']"));
		clickMethod(searchField);
		fillTextBox(searchField, "iPhone");

	}

	@Then("User have to click Search button")
	public void user_have_to_click_Search_button() {
		
		WebElement searchButton = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		clickMethod(searchButton);
		
	}

	@Given("User have to enable Search in Product Description check box and click Search button")
	public void user_have_to_enable_Search_in_Product_Description_check_box_and_click_Search_button() {
		
		WebElement checkBox = driver.findElement(By.xpath("(//label[@class='checkbox-inline'])[2]"));
		clickMethod(checkBox);
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
		clickMethod(searchButton);
		
	}

	@When("User have to apply Sort and select Price\\(Low>High) option")
	public void user_have_to_apply_Sort_and_select_Price_Low_High_option() {
		
		WebElement down = driver.findElement(By.xpath("//a[text()='Desktops']"));
		scrollDown(down);
		WebElement select = driver.findElement(By.xpath("//option[text()='Price (Low > High)']"));
		clickMethod(select);
		
	}

	@Then("User have to select iPhone listed below")
	public void user_have_to_select_iPhone_listed_below() {
		
		WebElement down = driver.findElement(By.xpath("//a[text()='iPod Touch']"));
		scrollDown(down);
		WebElement iPhoneClick = driver.findElement(By.xpath("//a[text()='iPhone']"));
		clickMethod(iPhoneClick);
		
	}

	@Given("User have to check the pictures of the product")
	public void user_have_to_check_the_pictures_of_the_product() {
		
		WebElement down = driver.findElement(By.xpath("//a[text()='Desktops']"));
		scrollDown(down);
		WebElement imageClick = driver.findElement(By.xpath("//img[@alt='iPhone']"));
		clickMethod(imageClick);
		WebElement clickRight = driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']"));
		a = new Actions(driver);
		a.doubleClick(clickRight).doubleClick(clickRight).click().perform();
		WebElement escapeIcon = driver.findElement(By.xpath("//button[@title='Close (Esc)']"));
		clickMethod(escapeIcon);
		
	}

	@When("User have to check the review for the product")
	public void user_have_to_check_the_review_for_the_product() {
		
		WebElement reviewClick = driver.findElement(By.xpath("//a[text()='Reviews (0)']"));
		clickMethod(reviewClick);
		
	}

	@When("User have to click Add to Cart button")
	public void user_have_to_click_Add_to_Cart_button() {
		
		WebElement btnCart = driver.findElement(By.xpath("//button[@id='button-cart']"));
		clickMethod(btnCart);
		
	}

	@Then("User have to click Shopping Cart link text")
	public void user_have_to_click_Shopping_Cart_link_text() {

		WebElement cartButton = driver.findElement(By.xpath("//a[@title='Shopping Cart']"));
		clickMethod(cartButton);

	}

	@Given("User have to click the quantity of iPhone")
	public void user_have_to_click_the_quantity_of_iPhone() {
		
		WebElement click = driver.findElement(By.xpath("//input[@type='text']"));
		clickMethod(click);
		
	}

	@When("User have to clear the existed quantity value and change to two")
	public void user_have_to_clear_the_existed_quantity_value_and_change_to_two() {

		try {
			WebElement click = driver.findElement(By.xpath("//input[@size='1']"));
			a = new Actions(driver);
			a.doubleClick(click).perform();
			clearField(click);
		} catch (Exception e) {
			System.out.println("Quantity Update Catch Block executed");
		} finally {
			System.out.println("Executed");
		}

		WebElement textBox = driver.findElement(By.xpath("//input[@value='1']"));
		fillTextBox(textBox, "2");
		
	}

	@Then("User have to click Update button")
	public void user_have_to_click_Update_button() {
		
		WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
		clickMethod(click);
		
	}

	@Given("User have to enter the Coupon Code")
	public void user_have_to_enter_the_Coupon_Code() {
		
		WebElement down = driver.findElement(By.xpath("//h2[text()='What would you like to do next?']"));
		scrollDown(down);
		WebElement click = driver.findElement(By.xpath("//a[text()='Use Coupon Code ']"));
		clickMethod(click);
		WebElement click1 = driver.findElement(By.xpath("//input[@name='coupon']"));
		clickMethod(click1);
		fillTextBox(click1, "abcdef");
		
	}

	@Given("User have to click Apply Coupon and check if Coupon is applicable or not")
	public void user_have_to_click_Apply_Coupon_and_check_if_Coupon_is_applicable_or_not() {
		
		WebElement click = driver.findElement(By.xpath("//input[@value='Apply Coupon']"));
		clickMethod(click);
		
	}

	@Given("User have to get Estimated Shipping Quote")
	public void user_have_to_get_Estimated_Shipping_Quote() {
		
		try {
			WebElement down = driver.findElement(By.xpath("//h2[text()='What would you like to do next?']"));
			scrollDown(down);
			WebElement click = driver.findElement(By.xpath("//a[text()='Estimate Shipping & Taxes ']"));
			clickMethod(click);
		} catch (Exception e) {
			System.out.println("Get Estimated Shipping Quote Catch Block executed");
		} finally {
			System.out.println("Executed");
			
		}
	}

	@When("User have to enter the Shipping details to get Estimated Shipping Quote")
	public void user_have_to_enter_the_Shipping_details_to_get_Estimated_Shipping_Quote() {

		try {
			WebElement select = driver.findElement(By.xpath("//select[@name='country_id']"));
			Select s = new Select(select);
			s.selectByVisibleText("United States");
		} catch (Exception e) {
			System.out.println("Enter Shipping Details Catch Block executed");
		} finally {
			System.out.println("Executed");
		}

		WebElement select1 = driver.findElement(By.xpath("//select[@name='zone_id']"));
		Select s1 = new Select(select1);
		s1.selectByVisibleText("Texas");
		WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
		clickMethod(postcode);
		fillTextBox(postcode, "12345");
		
	}

	@When("User have to click Get Quotes button")
	public void user_have_to_click_Get_Quotes_button() {
		
		driver.findElement(By.xpath("//button[@id='button-quote']")).click();
		
	}

	@Then("User have to click Apply Shipping button")
	public void user_have_to_click_Apply_Shipping_button() {
		
		driver.findElement(By.xpath("//label[text()='Flat Shipping Rate - $5.00']")).click();
		driver.findElement(By.xpath("//input[@value='Apply Shipping']")).click();
		
	}

	@Then("User have to click Checkout button")
	public void user_have_to_click_Checkout_button() {

		WebElement click = driver.findElement(By.xpath("//span[text()='2 item(s) - $207.00']"));
		clickMethod(click);
		WebElement click1 = driver.findElement(By.xpath("//strong[text()=' Checkout']"));
		clickMethod(click1);

	}

	@Given("User have to enter the Valid Login credentials")
	public void user_have_to_enter_the_Valid_Login_credentials() {
		
		WebElement down = driver.findElement(By.xpath("//h1[text()='Checkout']"));
		scrollDown(down);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		clickMethod(email);
		fillTextBox(email, "dominickaran95@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		clickMethod(pass);
		fillTextBox(pass, "1234567890");
		
	}

	@Given("User have to click the Login button")
	public void user_have_to_click_the_Login_button() {
		
		WebElement loginClick = driver.findElement(By.xpath("//input[@value='Login']"));
		clickMethod(loginClick);
		
	}

	@When("User have to enter Product Billing details and click Continue button")
	public void user_have_to_enter_Product_Billing_details_and_click_Continue_button() {
		
		WebElement clickContinue = driver.findElement(By.xpath("//input[@id='button-payment-address']"));
		clickMethod(clickContinue);
		
	}

	@Then("User have to click the Continue button")
	public void user_have_to_click_the_Continue_button() {
		
		WebElement clickButton = driver.findElement(By.xpath("//input[@id='button-shipping-address']"));
		clickMethod(clickButton);
		
	}

	@Given("User have to give method of Delivery to the Customer")
	public void user_have_to_give_method_of_Delivery_to_the_Customer() {
		
		WebElement click = driver.findElement(By.xpath("//textarea[@name='comment']"));
		clickMethod(click);
		
	}

	@Given("User have to enter any Comments and click Continue button")
	public void user_have_to_enter_any_Comments_and_click_Continue_button() {
		
		WebElement textFill = driver.findElement(By.xpath("//textarea[@name='comment']"));
		fillTextBox(textFill, "Please Deliver the Order ASAP");
		WebElement clickButton = driver.findElement(By.xpath("//input[@id='button-shipping-method']"));
		clickMethod(clickButton);
		
	}

	@When("User have to select Payment method")
	public void user_have_to_select_Payment_method() {
		
		WebElement click = driver.findElement(By.xpath("(//textarea[@name='comment'])[2]"));
		clickDouble(click);
		clickMethod(click);
		clearField(click);
		
	}

	@When("User have to enter any Comments, accept Terms & Conditions and click Continue button")
	public void user_have_to_enter_any_Comments_accept_Terms_Conditions_and_click_Continue_button() {
		
		WebElement textFill = driver.findElement(By.xpath("(//textarea[@name='comment'])[2]"));
		fillTextBox(textFill, "I Will Pay Via Cash On Delivery");
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		clickMethod(checkbox);
		WebElement clickContinue = driver.findElement(By.xpath("(//input[@value='Continue'])[4]"));
		clickMethod(clickContinue);
		
	}

	@Then("User have to click Confirm Order button")
	public void user_have_to_click_Confirm_Order_button() throws IOException, InterruptedException {
		
		WebElement confirmButton = driver.findElement(By.xpath("//input[@value='Confirm Order']"));
		clickMethod(confirmButton);

		Thread.sleep(2500);

		String url = pageCurrentUrl();
		System.out.println("URL: " + url);

		if (url.contains("route=checkout/success")) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(
					"C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\Screenshots\\OrderConfirmationSnap.png");
			FileUtils.copyFile(source, destination);
		}

		else {
			System.out.println("URL is Wrong");
		}

	}
	
	@Given("User have to enter into the opencart application through the chrome browser")
	public void user_have_to_enter_into_the_opencart_application_through_the_chrome_browser() {
		
		chromeBrowser();
		launchUrl("https://awesomeqa.com/ui/");
		maxWindow();
		applyImplicitWait(10);
		
	}

	@Given("User have to click the My Account Drop Down and select Login")
	public void user_have_to_click_the_My_Account_Drop_Down_and_select_Login() {
	    
		WebElement accountDropDown = driver.findElement(By.xpath("//a[@title='My Account']"));
		clickMethod(accountDropDown);

		WebElement loginButton = driver.findElement(By.xpath("(//a[text()='Login'])[1]"));
		clickMethod(loginButton);
		
	}
	
	@When("User have to enter the Valid Email and Valid Password")
	public void user_have_to_enter_the_Valid_Email_and_Valid_Password(DataTable d) {
	    
		List<String> list = d.asList();
		String email = list.get(1);
		String password = list.get(3);
		
		WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));		
		fillTextBox(emailField, email);

		WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));		
		fillTextBox(passwordField, password);
		
	}
	
	@Then("User should have to click the Login button")
	public void user_should_have_to_click_the_Login_button() throws IOException {
	    
		WebElement clickLogin = driver.findElement(By.xpath("//input[@type='submit']"));
		clickMethod(clickLogin);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject"
				+ "\\Screenshots\\LoginSuccessfulUsingDTList.png");
		FileUtils.copyFile(source, destination);
		
	}
	
	@Given("User should have to enter into the opencart application through the chrome browser")
	public void user_should_have_to_enter_into_the_opencart_application_through_the_chrome_browser() {
	   
		chromeBrowser();
		launchUrl("https://awesomeqa.com/ui/");
		maxWindow();
		applyImplicitWait(10);
		
	}

	@Given("User should have to click the My Account Drop Down and select Login")
	public void user_should_have_to_click_the_My_Account_Drop_Down_and_select_Login() {
	   
		WebElement accountDropDown = driver.findElement(By.xpath("//a[@title='My Account']"));
		clickMethod(accountDropDown);

		WebElement loginButton = driver.findElement(By.xpath("(//a[text()='Login'])[1]"));
		clickMethod(loginButton);
		
	}

	@When("User should have to enter the Valid Email and Valid Password")
	public void user_should_have_to_enter_the_Valid_Email_and_Valid_Password(DataTable d) {
	    
		List<Map<String, String>> map = d.asMaps();
		String email = map.get(1).get("email");
		String pass = map.get(0).get("password");
		
		WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));		
		fillTextBox(emailBox, email);

		WebElement passwordBox = driver.findElement(By.xpath("//input[@name='password']"));		
		fillTextBox(passwordBox, pass);
			    
	}

	@Then("User must have to click the Login button")
	public void user_must_have_to_click_the_Login_button() throws IOException {
	    
		WebElement clickLogin = driver.findElement(By.xpath("//input[@type='submit']"));
		clickMethod(clickLogin);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject"
				+ "\\Screenshots\\LoginSuccessfulUsingDTMap.png");
		FileUtils.copyFile(source, destination);
		
	}

	
	
	// @Given("User have to enter opencart application through chrome browser")
	// public void user_have_to_enter_opencart_application_through_chrome_browser()
	// {
	// chromeBrowser();
	// launchUrl("https://awesomeqa.com/ui/");
	// maxWindow();
	// applyImplicitWait(10);
	// }

}