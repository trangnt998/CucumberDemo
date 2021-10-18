package steps;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.getScreenshot;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static com.sun.deploy.cache.Cache.copyFile;


public class myAccountRegisterSteps {

    static WebDriver driver;

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
    public void enterRegisteredEmailAndPassword() throws InterruptedException, IOException, AWTException {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[1]/input"))
                .sendKeys("ab12acaazza@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[2]/input"))
                .sendKeys("Aha123!1abx1*ac");

//        getScreenshot.getScreen("./target/cucumber-reports/image/" , "suss" );
        getScreen2();




    }

    public void getScreen2() throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with name "screenshot.png"
        //copyFile(scrFile, new File("./target/cucumber-reports/image/screenshot.png"));
        copyFile(scrFile, new File("D:\\AutoTestPractice\\CucumberDemo\\target\\cucumber-reports\\image\\screenshot2.png"));
    }



    @And("^Click on register button$")
    public void clickOnRegisterButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"body\"]")).click();
        driver.findElement(By.name("register"))
        .click();
    }

    @Then("^User must successfully register to the web page$")
    public void userMustSuccessfullyRegisterToTheWebPage() throws IOException, AWTException {
        String expected = "ab12acaazza";
        String actual = "";
        if (driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]")).getText() != null) {
            actual += driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]")).getText();
            System.out.println("Tesstssss================");
        }
        System.out.println("HEHE");
            Assert.assertEquals(true,actual.contains(expected));


        driver.close();
        driver.quit();

    }



}
