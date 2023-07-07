package com.cydeo.tests.shorts;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P20_TestNG_DataProvider {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test(dataProvider ="googleSearchData" )
    public void googleSearchTest(String keyword,String expectedResult){
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(keyword + Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),expectedResult);
    }

    @DataProvider(name="googleSearchData")
    public Object[][] testData(){

        return new Object[][]{
                {"selenium","selenium - Google Search"},
                {"java","java - Google Search"},
                {"ruby","ruby - Google Search"},
                {"cydeo","cydeo - Google Search"}

        };
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }


}
