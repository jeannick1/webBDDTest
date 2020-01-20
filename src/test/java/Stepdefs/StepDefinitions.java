package Stepdefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions {
        private WebDriver driver,wait ;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();
     //   WebDriverWait wait = new WebDriverWait(driver, 15);

        @Given("login to nedbank")
        public void login_to() {
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://nedbank.co.za/content/nedbank/desktop/gt/en/personal.html");
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                System.out.println("logged in successfully");
               /// throw new cucumber.api.PendingException();
        }

        @When("clicking  on personal")
        public void clickingOnPersonal() {

            //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a/div")));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//a/div")).click();
                System.out.println("successfully clicked on personal");
               // throw new cucumber.api.PendingException();


        }

        @When("click  find now")
        public void click_find_now() {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                driver.manage().window().maximize();
                js.executeScript("window.scrollBy(0,1000)");


                //Find element by link text and store in variable "Element"
                WebElement Element = driver.findElement(By.linkText("Find now"));
                //This will scroll the page till the element is found
                js.executeScript("arguments[0].scrollIntoView();", Element);

                if (driver.findElement(By.linkText("Find now")).isDisplayed()) {
                        driver.findElement(By.linkText("Find now")).click();
                        driver.findElement(By.id("search_places")).click();
                        driver.findElement(By.id("search_places")).clear();
                }
                System.out.println("successfully clicked on find how");
               // throw new cucumber.api.PendingException();
        }

        @Then("enter pretoria in the  search bar")
        public void enter_pretoria_in_the_search_bar() {
                driver.findElement(By.id("search_places")).sendKeys("pretoria");
                System.out.println("successfully entered string in the search bar");

        }

        @Then("select pretoria urology hospital")
        public void select_pretoria_urology_hospital() {
                driver.findElement(By.xpath("//div[@id='searchPanelContainer']/div/div/div/div/div/ng4geo-autocomplete/div/ul/li[7]/a/span")).click();
                driver.findElement(By.xpath("//div[@id='searchPanelContainer']/div/div/div[2]/div[2]/button[2]")).click();
                driver.findElement(By.xpath("//div[@id='searchPanelContainer']/div/div[2]/div/div/a/div")).click();
                System.out.println("correct location selected");

        }

        @Then("click on ATM")
        public void click_on_ATM() {
                driver.findElement(By.xpath("//div[@id='main-container']/section/section/nb-branch-locator/div/div[3]/div/agm-map/div/div/div/div/div[3]/div/div[4]/div/div/div/div/div/div/div[2]/div/div/div[2]")).click();
                driver.findElement(By.xpath("//div[@id='searchPanelContainer']/div/div[2]/div/div/a/div[2]/div/div[2]/div/b")).click();

              //  throw new cucumber.api.PendingException();
        }



}
