package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myAccountRegisterSteps {

    WebDriver driver;

    @Given("^Open the browser$")
    public void openTheBrowser() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
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
    public void enterRegisteredEmailAndPassword() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[1]/input"))
                .sendKeys("ab12aca@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[2]/input"))
                .sendKeys("Aha123!1abx1*ac");

    }

    @And("^Click on register button$")
    public void clickOnRegisterButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"body\"]")).click();
        driver.findElement(By.name("register"))
        .click();
    }

    @Then("^User must successfully register to the web page$")
    public void userMustSuccessfullyRegisterToTheWebPage() {
        String expected = "ab12aca";
        String actual = "";
        if (driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]")).getText() != null) {
            actual += driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]")).getText();
            System.out.println("Tesstssss================");
        }
        System.out.println("HEHE");
            Assert.assertEquals(true,actual.contains(expected));


//        driver.close();
//        driver.quit();

    }



}
