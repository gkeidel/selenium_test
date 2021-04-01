package io.cucumber.gisela;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.pt.*;

public class TesteSeleniumSteps {

  public WebDriver driver;
  
  @Dado("que entro no site da tricentis")
  public void que_entro_no_site_da_tricentis() {
    System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

    driver = new ChromeDriver();
    driver.get("http://sampleapp.tricentis.com/101/app.php");
    driver.manage().window().maximize();
  }

  @Dado("preencho o formulario")
  public void preencho_o_campo_make() {
    Select make = new Select(driver.findElement(By.id("make")));
    make.selectByVisibleText("BMW");
    Select model = new Select(driver.findElement(By.id("model")));
    model.selectByVisibleText("Motorcycle");
    WebElement cylinder = driver.findElement(By.id("cylindercapacity"));
    cylinder.sendKeys("1998");
    WebElement engine = driver.findElement(By.id("engineperformance"));
    engine.sendKeys("170");
    WebElement dateBox = driver.findElement(By.id("dateofmanufacture"));
    dateBox.sendKeys("01/30/2021");
    Select seats = new Select(driver.findElement(By.id("numberofseats")));
    seats.selectByVisibleText("4");
    WebElement hand_drive = driver.findElement(By.cssSelector(".ideal-radio"));
    hand_drive.click();
    Select seats_motorcycle = new Select(driver.findElement(By.id("numberofseatsmotorcycle")));
    seats_motorcycle.selectByVisibleText("2");
    Select fuel = new Select(driver.findElement(By.id("fuel")));
    fuel.selectByVisibleText("Gas");
    WebElement payload = driver.findElement(By.id("payload"));
    payload.sendKeys("208");
    WebElement weight = driver.findElement(By.id("totalweight"));
    weight.sendKeys("1525");
    WebElement price = driver.findElement(By.id("listprice"));
    price.sendKeys("88000");
    WebElement plate_number = driver.findElement(By.id("licenseplatenumber"));
    plate_number.sendKeys("KDI-7876");
    WebElement annual_mileage = driver.findElement(By.id("annualmileage"));
    annual_mileage.sendKeys("8000");
  }
  
  @Entao("clico em next")
  public void clico_em_next() {
    WebElement botaoNext = driver.findElement(By.id("nextenterinsurantdata"));
    botaoNext.click(); 
  }

  @Entao("preencho dados do formulario Insurant Data")
  public void preencho_dados_do_formulario_Insurant_Data() {
   WebElement inputFirstName = driver.findElement(By.id("firstname"));
   inputFirstName.sendKeys("Jane");
   WebElement inputLastName = driver.findElement(By.id("lastname"));
   inputLastName.sendKeys("Doe");
   WebElement dateBirth = driver.findElement(By.id("birthdate"));
   dateBirth.sendKeys("01/30/1981");
  //  WebElement gender = driver.findElement(By.cssSelector("ideal-radiocheck-label"));
  //  gender.click();
   WebElement streetAddress = driver.findElement(By.id("streetaddress"));
   streetAddress.sendKeys("Rua Putinga");
   Select country = new Select(driver.findElement(By.id("country")));
    country.selectByVisibleText("Brazil");
    WebElement zipCode = driver.findElement(By.id("zipcode"));
    zipCode.sendKeys("52191281");
    WebElement city = driver.findElement(By.id("city"));
    city.sendKeys("Recife");
    Select occupation = new Select(driver.findElement(By.id("occupation")));
    occupation.selectByVisibleText("Employee");
    WebElement hobbies = driver.findElement(By.xpath("//label[text()=' Bungee Jumping']"));
    hobbies.click();
    WebElement botaoNext = driver.findElement(By.id("nextenterproductdata"));
    botaoNext.click();
    WebElement date = driver.findElement(By.id("startdate"));
    date.sendKeys("08/15/2021");
    Select insuranceSum = new Select(driver.findElement(By.id("insurancesum")));
    insuranceSum.selectByIndex(3);
    Select meritRating = new Select(driver.findElement(By.id("meritrating")));
    meritRating.selectByIndex(7);
    Select damageInsurance = new Select(driver.findElement(By.id("damageinsurance")));
    damageInsurance.selectByVisibleText("Full Coverage");
    WebElement optionalProducts = driver.findElement(By.xpath("//label[text()='Euro Protection']"));
    optionalProducts.click();
    Select courtesyCar = new Select(driver.findElement(By.id("courtesycar"))) ;
    courtesyCar.selectByVisibleText("Yes");
    WebElement nextStep = driver.findElement(By.id("nextselectpriceoption"));
    nextStep.click();
  }

  @Entao("eu seleciono a opcao")
  public void eu_seleciono_a_opcao() {
    WebElement priceOption = driver.findElement(By.xpath("//input[@value='Gold']"));
    priceOption.click();
}

// @Entao("clico next")
// public void clico_next() {
//     // Write code here that turns the phrase above into concrete actions
//     throw new io.cucumber.java.PendingException();
// }





  
}
