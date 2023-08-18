package com.jfrogpipe.demo;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class DemoTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Assertions.assertTrue( true );
    }

    @Test
    public void generateMockTests() {
        for (int i = 1; i <= 1; i++) {
            String testName = "test" + i;
            String expected = "expected" + i;
            String actual = "actual" + i;
            Assertions.assertEquals(expected, actual);
            //Thread.currentThread().getStackTrace();
        }
    }
}
