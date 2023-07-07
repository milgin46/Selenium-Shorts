package com.cydeo.tests.shorts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P19_SoftAssertionVSHardAssertion {

    @Test
    public void hardAssertionTest(){
        System.out.println("This is hard assertion");
        Assert.assertEquals("apple","app");
        System.out.println("After hard assertion failed!");

    }

    @Test
    public void softAssertionTest(){
        System.out.println("This is soft assertion");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple","app");
        System.out.println("After soft assertion failed!");
        softAssert.assertAll();

    }
}
