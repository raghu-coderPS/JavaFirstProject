package com.sapient.week1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    private Application app;

    @Before
    public void setup() {
        app = new Application();
    }


    @Test
    public void test1() {
        int count = app.checkEven(1);
        assertTrue(count == 0);
    }

    @Test
    public void test2() {
        int count = app.checkEven(24);
        assertTrue(count == 1);
    }

    @Test
    public void test3() {
        int count = app.checkEven(31);
        assertTrue(count == 0);
    }

    @Test
    @Ignore
    public void test4() {
        int count = app.checkEven(100);
        assertTrue(count == 1);
    }

    @Test
    public void test5() {
        int count = app.checkEven(101);
        assertTrue(count == 0);
    }
}
