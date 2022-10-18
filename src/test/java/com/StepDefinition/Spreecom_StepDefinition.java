package com.StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Spreecom_StepDefinition {
	
	 static WebDriver driver = null;

		@Given("User navigating to Spreecom Login website page")
		public void User_navigating_to_Spreecom_Login_website_page() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.get("https://demo.spreecommerce.org/login");
		    Thread.sleep(2000);
			
		}
		
		@When("User Enter the keyword {string} in the useremail field")
		public void user_enter_the_keyword_in_the_useremail_field(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			driver.findElement(By.xpath("//input[@id='spree_user_email']")).sendKeys("Elena@spree.com");
		}
		
		@When("User Enter the keyword {string} in the userpassword field")
		public void user_enter_the_keyword_in_the_userpassword_field(String string) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
			driver.findElement(By.id("spree_user_password")).sendKeys("Elena123");
			Thread.sleep(2000);
		}
		
		
		@When("User click on Login1 Button")
		public void user_click_on_login1_button() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			driver.findElement(By.xpath("//input[@name='commit']")).click();
			Thread.sleep(2000);
			
		}
		
//		@Then("User should see {string} is displayed")
//		public void user_should_see_is_displayed(String string) {
//		    // Write code here that turns the phrase above into concrete actions
//		    //throw new io.cucumber.java.PendingException();
//			driver.findElement(By.xpath("//h3[@class='text-uppercase spree-mb-large spree-mt-large spree-header']")).isDisplayed();
//		}
		
		@When("when I click to {string} button")
		public void when_i_click_to_button(String string) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			 driver.findElement(By.linkText("Add new address")).click();
			  Thread.sleep(2000);
		}

		@Then("User enters label, firstname, lastname, address1, city, state_id, zipcode, phone")
		public void user_enters_label_firstname_lastname_address1_city_state_id_zipcode_phone() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
		}

		@Then("User click {string} button")
		public void user_click_button(String string) {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
		}
}