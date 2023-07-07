package com.cydeo.tests.shorts;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P14_CheckBox {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.id("box1"));
        System.out.println("Before clicking checkBox1.isSelected() = " + checkBox1.isSelected());
        checkBox1.click();


        System.out.println("After clicking checkBox1.isSelected() = " + checkBox1.isSelected());

        System.out.println("checkBox1.isEnabled() = " + checkBox1.isEnabled());

    }
}
