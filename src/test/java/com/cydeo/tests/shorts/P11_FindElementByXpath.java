package com.cydeo.tests.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_FindElementByXpath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement emailBox = driver.findElement(By.xpath("//input[@type='text']"));
        emailBox.sendKeys("abc@email.com");


        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        retrievePasswordButton.click();

        WebElement text = driver.findElement(By.xpath("//h4"));

        if(text.getText().equals("Your e-mail's been sent!")){
            System.out.println("Text verification is passed!");
        }else{
            System.out.println("Text verification is failed!");
        }

        System.out.println("text.getAttribute(\"name\") = " + text.getAttribute("name"));

    }
}