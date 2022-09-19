package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	
	

@Given("user launches url")
public void user_launches_url() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.thechildrensfurniturecompany.com/");
	
   
}
@When("user navigates to app")
public void user_navigates_to_app() {
	driver.findElement(By.id("js-login-icon")).click();
   
}
@When("user entres valid user name and passsword")
public void user_entres_valid_user_name_and_passsword() {
	driver.findElement(By.id("email_address_login")).sendKeys("");
	driver.findElement(By.id("password_login")).sendKeys("");
   
}
@When("user clicks login button")
public void user_clicks_login_button() {
	driver.findElement(By.id("register_login")).click();
   
}



	
	
	

}
