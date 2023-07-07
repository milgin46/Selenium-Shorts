package com.cydeo.tests.shorts;

import com.cydeo.tests.base.TestBase;
import com.cydeo.tests.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class P24_WebTablePractice extends TestBase {

//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUpMethod(){
//        //driver = WebDriverFactory.getDriver("chrome");
//        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    }



    @Test
    public void webTableTest(){

        //driver.get("https://practice.cydeo.com/tables");
        driver.get(ConfigurationReader.getProperty("env1"));

        WebElement johnCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='John']"));
        System.out.println("johnCell.getText() = " + johnCell.getText());

        List<WebElement> bodyRow3 = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
        for (WebElement eachCell : bodyRow3) {
            System.out.println("eachCell.getText() = " + eachCell.getText());
        }

    }
}
