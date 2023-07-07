package com.cydeo.tests.shorts;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P31_JSExecutorScrolling {

    @Test
    public void jsexecutorScrollingTest(){

        Driver.getDriver().get("https://practice.cydeo.com/");

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver());

        BrowserUtils.sleep(3);

        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);

        BrowserUtils.sleep(3);

        Driver.closeDriver();
    }
}
