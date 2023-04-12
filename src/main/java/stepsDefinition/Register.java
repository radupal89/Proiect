package stepsDefinition;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class Register {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @Given("Deschidere pagina Test Demo Login")
    public void deschidere_pagina_test_demo_login() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Index.html");
        sleep(3000);


    }

    @Then("Introducere email {string}")
    public void introducere_email(String adresa) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("adresa@gmail.com");
        sleep(3000);

    }


    @And("Click buton de login")
    public void click_buton_de_login() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='enterimg']")).click();
        sleep(3000);
    }

    @Given("Deschidere pagina register")
    public void deschidere_pagina_register() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");
        sleep(3000);
    }
    @Then("Adaugare nume {string}")
    public void adaugare_nume(String radu) throws InterruptedException {
        driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys("Radu");
        sleep(3000);
    }

    @Then("Adaugare prenume {string}")
    public void adaugare_prenume(String pal) throws InterruptedException {
        driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys("Pal");
        sleep(3000);
    }

    @And("Adaugare adresa {string}")
    public void adaugare_adresa(String adresa) throws InterruptedException {
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Adresa");
        sleep(3000);
    }

    @Then("Adaugare adresa de email {string}")
    public void adaugare_adresa_de_email(String email) throws InterruptedException {
        driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("adresa@email.com");
        sleep(3000);
    }

    @And("Adaugare telefon {string}")
    public void adaugare_telefon(String telefon) throws InterruptedException {
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("0746584");
        sleep(3000);
    }

    @Then("Selectare gender {string}")
    public void selectare_gender(String male) throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        sleep(3000);
    }

    @And("Selectare hobby {string}")
    public void selectare_hobby (String cricket) throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='Cricket']")).click();
        sleep(3000);
    }

    @And("Selectare skill {string}")
    public void selectare_skill (String oracle) throws InterruptedException {
        driver.findElement(By.xpath("//select[@id='Skills']/option[@value='Oracle']")).click();
        sleep(3000);
    }

    @Then("Selectare tara {string}")
    public void selectare_tara(String australia) throws InterruptedException {
        driver.findElement(By.xpath("//select[@id='country']/option[@value='Australia']"));
        sleep(3000);
    }

    @And("Selectare data {string}")
    public void selectare_data(String data) throws InterruptedException {
        driver.findElement(By.xpath("//select[@ng-model='yearbox']/option[@value='1989']"));
        sleep(3000);
        driver.findElement(By.xpath("//select[@ng-model='monthbox']/option[@value='September']"));
        sleep(3000);
        driver.findElement(By.xpath("//select[@ng-model='daybox']/option[@value='15']"));
        sleep(3000);
    }

    @Then("Adaugare parola {string}")
    public void adaugare_parola(String pass) throws InterruptedException {
        driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("Parola1");
        sleep(3000);
    }

    @And("Confirmare parola {string}")
    public void confirmare_parola(String cpass) throws InterruptedException {
        driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("Parola1");
        sleep(3000);
    }

    @Then("Finalizare inregistrare {string}")
    public void finalizare_inregistrare(String submit) throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        sleep(3000);
    }



}
