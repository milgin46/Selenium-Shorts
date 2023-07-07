package com.cydeo.tests.shorts;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P33_LoginPractice {

    @Test
    public void practicePageLoginTest(){

        Driver.getDriver().get("https://practice.cydeo.com/login");

        WebElement username = Driver.getDriver().findElement(By.name("username"));
        username.sendKeys("tomsmith");

        WebElement password = Driver.getDriver().findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");

        WebElement loginBtn = Driver.getDriver().findElement(By.id("wooden_spoon"));
        loginBtn.click();

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Secure Area";

        Assert.assertEquals(actualTitle,expectedTitle,"Secure Area title did not appear!");


    }
}
