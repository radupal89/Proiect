package stepsDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class SwitchTo {

    private WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") +"/src/main/java/driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @Given("Deschidere pagina Demo")
    public void dechidere_pagina_demo() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Alerts.html");
        sleep(5000);
    }
// Testare Switch To Alerts


    @Then("Click button")
    public void click_button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@onclick='alertbox()']")).click();
        sleep(1000);
    }
    @Then("Click ok and Cancel")
    public void click_ok_and_cancel() throws InterruptedException {
        driver.findElement(By.xpath("//*[@href='#CancelTab']")).click();
        sleep(1000);
    }
    @And("Accept alert")
    public void accept_alert() throws InterruptedException {
        driver.switchTo().alert().accept();
        sleep(1000);
    }

    @And("Click the confirm box")
    public void click_the_confirm_box() throws InterruptedException {
        driver.findElement(By.xpath("//*[@onclick='confirmbox()']")).click();
        sleep(1000);
    }
    @Then("Alert with ok")
    public void alert_with_ok() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='OKTab']")).click();
        sleep(1000);
        driver.switchTo().alert().accept();
        sleep(1000);

    }
    @And("Alert with cancel")
    public void alert_with_cancel() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='CancelTab']")).click();
        sleep(1000);
    }

    @Then("Click Textbox")
    public void click_textbox() throws InterruptedException {
        driver.findElement(By.xpath("//*[@href='#Textbox']")).click();
        sleep(1000);
    }
    @And("Click prompt box button")
    public void click_prompt_box_button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();
        sleep(1000);

    }
    @And("Enter name {string}")
    public void enter_name(String Radu) throws InterruptedException {
        Alert al = driver.switchTo().alert();
        al.sendKeys("Radu");
        al.accept();
        sleep(1000);
    }


// Testare Switch To Frames


    @Given("Deschidere pagina Demo Frames")
    public void deschidere_pagina_demo_frames() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Frames.html");
        sleep(5000);

    }
    @And("Click single iframe")
    public void click_single_iframe() throws InterruptedException {
        driver.findElement(By.xpath("//*[@href='#Single']")).click();
        sleep(1000);
    }

    @Then("Introducere text {string}")
    public void introducere_text(String testare) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='singleframe']")).sendKeys("testare");
        sleep(1000);

    }






}
