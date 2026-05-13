package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(5, 3);

        System.out.println("Running test: 5 + 3 = " + result);

        Assert.assertEquals(8, result);
    }
}