package com.cydeo.tests.shorts;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P29_RightClickPractice {

    @Test
    public void rightClickTest(){

        Driver.getDriver().get("https://practice.cydeo.com/");

        WebElement abTestingLink = Driver.getDriver().findElement(By.linkText("A/B Testing"));

        Actions actions = new Actions(Driver.getDriver());

        actions.contextClick(abTestingLink)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.RETURN).perform();

        Assert.assertEquals(Driver.getDriver().getTitle(),"No A/B Test");
    }
}
