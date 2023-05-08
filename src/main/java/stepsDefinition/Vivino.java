package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;



    public class Vivino {
        private static WebDriver driver;

        @Before
        public void setup() {
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            chromeOptions.addArguments("--disable-notifications");
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();


        }
        @After
        public static void finishBrowser(){
            if (driver != null){
                driver.quit();
                driver= null;
            }
        }



        @Given("Accesare Website Vivino")
        public void accesare_website_vivino() {

            driver.get("https://www.vivino.com/");
        }

        @Then("Click acceptare cookies")
        public void click_acceptare_cookies() throws InterruptedException {
            driver.findElement(By.xpath("//span[@class='jss29']"))
                    .click();
            sleep(3000);
        }

        @When("Click pictograma silueta profil")
        public void click_pictograma_silueta_profil() throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"navigation-container\"]/div/nav/div[2]/div[5]/div"))
                    .click();
            sleep(5000);
        }

        @And("Click join vivino")
        public void click_join_vivino() throws InterruptedException {
            driver.findElement(By.xpath("//a[text()='Join Vivino']"))
                    .click();
            sleep(5000);
        }

        @Then("Click acceptare termeni si conditii")
        public void click_acceptare_termeni_si_conditii() throws InterruptedException {
            driver.findElement(By.xpath("//input[@data-testid='termsCheckbox']"))
                    .click();
            sleep(5000);
        }

        @Then("Introducere adresa de email {string}")
        public void introducere_adresa_de_email(String email) throws InterruptedException {
            driver.findElement(By.xpath("//input[@data-testid='email']"))
                    .sendKeys("radude1989@gmail.com");
            sleep(5000);
        }

        @And("Click buton Continue")
        public void click_buton_continue() throws InterruptedException {
            driver.findElement(By.xpath("//span[text()='Continue']"))
                    .click();
            sleep(5000);
        }

        @Then("Adaugare nume {string}")
        public void adaugare_nume(String nume) throws InterruptedException {
            driver.findElement(By.xpath("//input[@data-testid='signupFormFirstName']"))
                    .sendKeys("Pal");
            sleep(5000);
        }

        @And("Adaugare prenume {string}")
        public void adaugare_prenume(String prenume) throws InterruptedException {
            driver.findElement(By.xpath("//input[@data-testid='signupFormLastName']"))
                    .sendKeys("Radu");
            sleep(5000);
        }

        @Then("Adaugare parola {string}")
        public void adaugare_parola(String parola) throws InterruptedException {
            driver.findElement(By.xpath("//input[@name='password']"))
                    .sendKeys("Parola12345");
            sleep(5000);
        }

        @And("Click buton Join Vivino")
        public void click_buton_join_vivino() throws InterruptedException {
            driver.findElement(By.xpath("//span[contains(text(), 'Join Vivino')]"))
                    .click();
            sleep(10000);
        }


        @Given("Accesare site Vivino")
        public void accesare_site_vivino() {

            driver.get("https://www.vivino.com/");
        }

        @Then("Acceptare cookies")
        public void acceptare_cookies() throws InterruptedException {
            driver.findElement(By.xpath("//span[@class='jss29']"))
                    .click();
            sleep(3000);
        }

        @And("Click pictograma selectare profil")
        public void click_pictograma_selectare_profil() throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"navigation-container\"]/div/nav/div[2]/div[5]/div"))
                    .click();
            sleep(5000);
        }

        @Then("Adaugare adresa de email {string}")
        public void adaugare_adresa_de_email(String email) throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"email\"]"))
                    .sendKeys("radupal89@yahoo.com");
            sleep(5000);
        }

        @Then("Click Continue")
        public void click_continue() throws InterruptedException {
            driver.findElement(By.xpath("//span[contains(text(), 'Continue')]"))
                    .click();
            sleep(5000);
        }
        @And("Introducere parola {string}")
        public void introducere_parola(String parola) throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"password\"]"))
                    .sendKeys("Parola115");
            sleep(5000);
        }

        @Then("Click buton log in")
        public void click_buton_log_in() throws InterruptedException {
            driver.findElement(By.xpath("//span[@class='jss11']"))
                    .click();
            sleep(15000);
        }

        @Given("Deschidere pagina principala Vivino")
        public void deschidere_pagina_principala_vivino(){

            driver.get("https://www.vivino.com/");

        }
        @And("Accept cookies")
        public void accept_cookies() throws InterruptedException {
            driver.findElement(By.xpath("//span[@class='jss29']"))
                    .click();
            sleep(3000);
        }

        @Then("Click pe chenarul search")
        public void click_pe_chenarul_search() throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"navigation-container\"]/div/nav/div[1]/div"))
                    .click();
            sleep(3000);
        }
        @And("Introducere nume produs {string}")
        public void introducere_nume_produs(String nume) throws InterruptedException {
            driver.findElement(By.xpath("//input[@class=\"searchBar_searchInput__Jje-K\"]"))
                    .sendKeys("7Arts Cabernet Sauvignon");
            sleep(3000);
        }
        @Then("Selectare produs")
        public void selectare_produs() throws InterruptedException {
            driver.findElement(By.xpath("//a[@data-testid='searchResult-5938182']"))
                    .click();
            sleep(3000);
        }

        @Given("Deschidere site Vivino")
        public void deschidere_site_vivino(){

            driver.get("https://www.vivino.com/");

        }
        @And("Accept cookie")
        public void accept_cookie() throws InterruptedException {
            driver.findElement(By.xpath("//span[@class='jss29']"))
                    .click();
            sleep(3000);
        }

        @Then("Click pe search any wine")
        public void click_pe_search_any_wine() throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"navigation-container\"]/div/nav/div[1]/div"))
                    .click();
            sleep(3000);
        }

        @And("Selectare tip de vin {string}")
        public void selectare_tip_de_vin(String culoare ) throws InterruptedException {
            driver.findElement(By.xpath("//a[@class=\"searchResults_result__wKekM\"]"))
                    .click();
            sleep(3000);
        }


        @Then("Scroll in jos")
        public void scroll_in_jos() throws InterruptedException {
            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(By.tagName("body")));
            actions.sendKeys(Keys.PAGE_DOWN).build().perform();
            sleep(3000);
        }

        @Then("Selectare rating vin")
        public void selectare_rating_vin() throws InterruptedException {
            driver.findElement(By.xpath("//input[@name='rating' and @id='4.2']"))
                    .click();
            sleep(5000);
        }

        @And("Aplicare filtru tip strugure {string}")
        public void aplicare_filtru_tip_strugure(String strugure) throws InterruptedException {
            driver.findElement(By.xpath("//span[@class='pill__text--24qI1' and text()='Grenache']"))
                    .click();
            sleep(5000);
        }


        @Then("Selectare regiune {string}")
        public void selectare_regiune(String regiune) throws InterruptedException {
            driver.findElement(By.xpath("//span[@class='pill__text--24qI1' and text()='Rhone Valley']"))
                    .click();
            sleep(5000);
        }

        @Then("Scroll in sus")
        public void scroll_in_sus() throws InterruptedException {

            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.PAGE_UP).perform();
            sleep(5000);
        }
        @And("Selectare produs aparut")
        public void selectare_produs_aparut() throws InterruptedException {
            driver.findElement(By.xpath("//div[@class='wineCard__infoColumn--3NKrN']"))
                    .click();
            sleep(10000);
        }

        @Given("Deschidere website")
        public void deschidere_website() {

            driver.get("https://www.vivino.com/");
        }
        @And("Accept cokies")
        public void accept_cokies() throws InterruptedException {
            driver.findElement(By.xpath("//span[@class='jss29']"))
                    .click();
            sleep(10000);
        }
        @Then("Click buton support")
        public void click_buton_support() throws InterruptedException {
            WebElement frame = driver.findElement(By.id("forethought-chat"));
            driver.switchTo().frame(frame);


            driver.findElement(By.id("ft-help-button")).click();

            sleep(5000);

            driver.switchTo().defaultContent();
        }
        @And("Introducere text {string}")
        public void introducere_text(String text1) throws InterruptedException {
            driver.switchTo().frame("forethought-chat");
            driver.findElement(By.xpath("//div[contains(@class, 'MuiInputBase-multiline')]//textarea[@id=':r0:']"))
                    .sendKeys("hello" + Keys.RETURN);
            sleep(10000);


        }

        @Then("Inchidere functie")
        public void inchidere_functie() throws InterruptedException {
            driver.findElement(By.xpath("//button[@class='css-b9qsed']/img[@alt='Close Widget']"))
                    .click();
            sleep(10000);
        }
    }

