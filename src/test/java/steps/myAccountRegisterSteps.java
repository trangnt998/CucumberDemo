package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myAccountRegisterSteps {

    WebDriver driver;

    @Given("^Open the browser$")
    public void openTheBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\trang.nguyen24_onemo\\Documents\\MyPractice\\Cucumber\\Demo\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("^Enter the URL \"([^\"]*)\"$")
    public void enterTheURL(String arg0) {
        driver.navigate().to("http://practice.automationtesting.in/");

    }

    @And("^Click on My Account Menu$")
    public void clickOnMyAccountMenu() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")).click();
    }

    @And("^Enter registered email and password$")
    public void enterRegisteredEmailAndPassword() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[1]/input")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[2]/input")).sendKeys("12345678");
    }

    @And("^Click on register button$")
    public void clickOnRegisterButton() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[3]/input[3]"));
    }

    @Then("^User must successfully register to the web page$")
    public void userMustSuccessfullyRegisterToTheWebPage() {
        System.out.println("HHaha");

//        driver.close();
//        driver.quit();

    }
}
