package com.example.georgefaraj.password_validator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {

    private Validator test;

    @Before
    public void setUp() {
        test = new Validator();
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void notPassword(){
        assertFalse(test.validate("password"));
        assert(test.validate("GoodPassword1!"));
    }

    @Test
    public void passwordLength(){
        assertFalse(test.validate("a"));
        assert(test.validate("GoodPassword1!"));
    }

    @Test
    public void atLeast1Upper(){
        assertFalse(test.validate("aaaaaaa1!"));
        assert(test.validate("GoodPassword1!"));
    }

    @Test
    public void atLeast1Special(){
        assertFalse(test.validate("Aaaaaaaa1"));
        assert(test.validate("GoodPassword1!"));
    }

    @Test
    public void atLeast1Number(){
        assertFalse(test.validate("Aaaaaaaa!"));
        assert(test.validate("GoodPassword1!"));
    }

}