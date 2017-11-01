package website;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteCheck {

    WebDriver driver;

    @Given("^I am opening Chrome and launch the application$")
    public void i_am_opening_Chrome_and_launch_the_application() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ivyordanov\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }


    @When("^I enter the Username User(\\d+) and Password password(\\d+)$")
    public void i_enter_the_Username_User_and_Password_password(String username, String password) throws Throwable {

        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @Then("^I reset the credential$")
    public void i_reset_the_credential() throws Throwable {

        driver.findElement(By.name("btnReset")).click();
    }



}
