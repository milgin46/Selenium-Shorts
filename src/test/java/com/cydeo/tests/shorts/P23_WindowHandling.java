package com.cydeo.tests.shorts;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class P23_WindowHandling {

//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUpMethod(){
//        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    }

    @Test
    public void windowHandlingTest(){
        Driver.getDriver().get("https://practice.cydeo.com/windows");
        String currentWindowHandle = Driver.getDriver().getWindowHandle();
        System.out.println("currentWindowHandle = " + currentWindowHandle);

        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        System.out.println("currentWindowHandle = " + currentWindowHandle);

        Set<String> allWindows = Driver.getDriver().getWindowHandles();

        System.out.println("allWindows = " + allWindows);

        for (String eachWindow : allWindows) {
            Driver.getDriver().switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + Driver.getDriver().getTitle());
        }

    }
}
