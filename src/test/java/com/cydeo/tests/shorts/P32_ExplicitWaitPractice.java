package com.cydeo.tests.shorts;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P32_ExplicitWaitPractice {

    @Test
    public void explicitWaitTest(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading");

        WebElement example2 = Driver.getDriver().findElement(By.partialLinkText("Example 2"));
        example2.click();

        Driver.getDriver().findElement(By.xpath("//button[.='Start']")).click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        WebElement loadingBar = Driver.getDriver().findElement(By.id("loading"));

        wait.until(ExpectedConditions.invisibilityOf(loadingBar));

        WebElement helloWorldText = Driver.getDriver().findElement(By.xpath("//h4[.='Hello World!']"));

        Assert.assertTrue(helloWorldText.isDisplayed());
    }
}
