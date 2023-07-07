package com.cydeo.tests.shorts;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class P25_JavaFakerPractice {

    @Test
    public void javaFakerTest(){
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.address().city() = " + faker.address().city());
        System.out.println("faker.address().country() = " + faker.address().country());
        System.out.println("faker.number().randomNumber() = " + faker.number().randomNumber());


    }
}
