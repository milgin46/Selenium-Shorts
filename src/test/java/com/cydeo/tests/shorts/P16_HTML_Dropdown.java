package com.cydeo.tests.shorts;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P16_HTML_Dropdown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
         driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void htmlDropdownTest(){

        driver.get("https://practice.cydeo.com/dropdown");

        driver.findElement(By.id("dropdownMenuLink")).click();

        driver.findElement(By.linkText("Yahoo")).click();

    }
}
