package com.cydeo.tests.shorts;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P13_RadioButtons {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blueRadioBtn = driver.findElement(By.xpath("//input[@id='blue']"));

        System.out.println("blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());

        WebElement redRadioBtn = driver.findElement(By.xpath("//input[@id='red']"));

        System.out.println("Before clicking redRadioBtn.isSelected() = " + redRadioBtn.isSelected());

        redRadioBtn.click();

        System.out.println("After clicking redRadioBtn.isSelected() = " + redRadioBtn.isSelected());

        WebElement greenRadioBtn = driver.findElement(By.xpath("//input[@id='green']"));

        System.out.println("greenRadioBtn.isSelected() = " + greenRadioBtn.isSelected());
        greenRadioBtn.click();
        System.out.println("greenRadioBtn.isEnabled() = " + greenRadioBtn.isEnabled());

    }
}
