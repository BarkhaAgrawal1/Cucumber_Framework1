package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
public static WebDriver driver;
    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.whiteboxqa.com/");

    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
driver.findElement(By.id("loginButton")).click();
driver.findElement(By.id("username")).sendKeys("Vinayreddy3337");
driver.findElement(By.id("password")).sendKeys("Whitebox3337");

    }
    @And("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        driver.findElement(By.id("login")).click();


    }
    @Then("user lands on the landing page")
    public void user_lands_on_the_landing_page() {
driver.getPageSource().contains("logout");


    }





}
