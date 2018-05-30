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

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void notPassword(){
        Validator test = new Validator();
        assertFalse(test.validate("password"));
        assert(test.validate("notpassword"));
    }


}