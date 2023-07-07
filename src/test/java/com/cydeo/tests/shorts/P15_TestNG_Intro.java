package com.cydeo.tests.shorts;

import org.testng.Assert;
import org.testng.annotations.*;

public class P15_TestNG_Intro {

    @Test(priority = 1 )
    public void testTwoPlusFive(){
        System.out.println("testTwoPlusFive is running");
        Assert.assertEquals(2+5,7);

    }

    @Test(priority = 2 )
    public void testApple(){
        System.out.println("testApple is running");
        Assert.assertEquals("apple","apple");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before Method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After Method is running");
    }

    @BeforeClass
    public void setUp(){
        System.out.println("Before Class is running");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After Class is running");
    }

}
