package com.StepDefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Step_definition extends AbstractPageStepDefinition {
	
	  // static WebDriver driver = null;
	     WebDriver driver = getDriver();

	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
		
	}

	@When("User Enter the keyword {string}")
	public void user_enter_the_keyword(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
	}

	@When("User click on Search Button")
	public void user_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	//	driver.findElement(By.name("btnK")).click();
	}

	@Then("Search result related to {string} word should display")
	public void search_result_related_to_word_should_display(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Search related to Selenium get Displayed");
		driver.quit();
	}
	//WebOrder Login
	@Given("User navigating to Web Order website page")
	public void user_is_on_web_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		Thread.sleep(2000);

	}
	
	@When("User Enter the keyword {string} in the username field")
	public void user_enter_the_keyword_in_the_username_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	}


	@When("User Enter the keyword {string} in the password field")
	public void user_enter_the_keyword_in_the_password_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	}

	@When("User click on Login Button")
	public void user_click_on_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(2000);
		
	}


	@Then("User should see {string} is displayed")
	public void user_should_see_is_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_logout")).isDisplayed();
	   // driver.quit();
	}
	
	
	@When("User click on LogOut link from the home page")
	public void user_click_on_LogOut_link_from_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("User should be taken back to Login page")
	public void user_should_be_taken_back_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
    driver.findElement(By.id("ctl00_MainContent_login_button")).isDisplayed();
    driver.quit();
	}
	
	///////////////////////////////////////////////////////////////////////////
	@Then("User Clicks on Order link in TestComplete")
	public void user_clicks_on_order_link_in_test_complete() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.linkText("Order")).click();
	}

	@Then("User enters quantity, customer name, street, city, zip, card, card number, expire date in TestComplete")
	public void user_enters_quantity_customer_name_street_city_zip_card_card_number_expire_date_in_test_complete() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("2");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("Abc");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("xyz");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("1001");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("1234");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("22/44");
	}

	@Then("User Click on Process Button in TestComplete")
	public void user_click_on_process_button_in_test_complete() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
	}

	@Then("User should see order success message in TestComplete")
	public void user_should_see_order_success_message_in_test_complete() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/strong")).isDisplayed();
	}
	
	/////////////////////////////////////////////////////////////////////////////
    // Multiple
	@Given("User is on WebOrder Home Page")
	public void user_is_on_web_order_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String uname, String upass) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(uname);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(upass);
	}

//	@When("User click on the login button")
//	public void user_click_on_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
	//	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
//	}
	@When("User click on Login Button")
	public void user_click_on_login_button1() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}

	@Then("User should be in Home page and Logout button should display")
	public void user_should_be_in_home_page_and_logout_button_should_display() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_logout")).isDisplayed();
	}
	
	@SuppressWarnings("deprecation")
	@Then("User should get proper {string}")
	public void user_should_get_proper(String ExpResult) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		if (ExpResult.equalsIgnoreCase("Invalid Login or Password.")) {
			String ActResult = driver.findElement(By.id("ctl00_MainContent_status")).getText();
			Assert.assertEquals(ActResult, ExpResult);
			
		} else 
		{
			String ActResult = driver.findElement(By.linkText("Logout")).getText();
			Assert.assertEquals(ActResult, ExpResult);
			driver.findElement(By.linkText("Logout")).click();
		}
	}


	
	
	
}
	

