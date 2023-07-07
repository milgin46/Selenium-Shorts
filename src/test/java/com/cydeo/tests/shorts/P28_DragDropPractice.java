package com.cydeo.tests.shorts;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P28_DragDropPractice {

    @Test
    public void dragAndDropTest(){

        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());

        //actions.dragAndDrop(smallCircle,bigCircle).perform();

        actions.moveToElement(smallCircle)
                .pause(1000)
                .clickAndHold()
                .pause(1000)
                .moveToElement(bigCircle)
                .pause(1000)
                .release().perform();

    }
}
