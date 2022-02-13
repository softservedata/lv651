package com.softserve.edu;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void testApp ()  {
        System.out.println("class AppTest, method testApp() ");
        System.out.println("***surefire.application.password = "+System.getProperty("surefire.application.password"));
        System.out.println("***System.getenv().MY_PASSWORD = "+System.getenv().get("MY_PASSWORD"));
        Assert.assertTrue(true);
    }

}
