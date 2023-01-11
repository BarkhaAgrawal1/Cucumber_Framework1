package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest1 {

        public static WebDriver driver;
        @Given("user will enter Home Page")
        public void user_will_enter_home_page() {
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://www.whiteboxqa.com/");
        }
        @When("^user will enter (.*) and (.*)$")
        public void user_will_enter_username_and_password(String username, String password) {
            driver.findElement(By.id("loginButton")).click();
            driver.findElement(By.id("username" )).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);

        }
        @And("user will click on login button")
        public void user_will_click_on_login_button() {
            driver.findElement(By.id("login")).click();

        }
        @Then("user navigate on the landing page")
        public void user_navigate_on_the_landing_page() {
            driver.getPageSource().contains("LogOut");

            driver.close();

        }


    }


