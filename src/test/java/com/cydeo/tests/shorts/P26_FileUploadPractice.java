package com.cydeo.tests.shorts;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P26_FileUploadPractice {

    @Test
    public void fileUploadTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        WebElement chooseFileBtn = Driver.getDriver().findElement(By.id("file-upload"));
        chooseFileBtn.sendKeys("/Users/aysun/Downloads/some-file.txt");

        BrowserUtils.sleep(3);

        Driver.getDriver().findElement(By.id("file-submit")).click();



    }
}
