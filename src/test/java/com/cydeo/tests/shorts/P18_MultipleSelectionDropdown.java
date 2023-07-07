package com.cydeo.tests.shorts;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P18_MultipleSelectionDropdown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void multipleSelectionDropdownTest(){
        driver.get("https://practice.cydeo.com/dropdown");

        Select multiSelect = new Select(driver.findElement(By.name("Languages")));

        System.out.println("multiSelect.isMultiple() = " + multiSelect.isMultiple());

        multiSelect.selectByValue("java");
        multiSelect.selectByVisibleText("Python");
        multiSelect.selectByIndex(2);

        multiSelect.deselectAll();

    }
}
