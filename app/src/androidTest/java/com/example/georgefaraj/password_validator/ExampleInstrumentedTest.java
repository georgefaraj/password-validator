package com.example.georgefaraj.password_validator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.widget.EditText;
import org.junit.Rule;
import android.support.test.rule.ActivityTestRule;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> menuActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.georgefaraj.password_validator", appContext.getPackageName());
    }

    @Test
    public void validPassword() throws InterruptedException {
        onView(withId(R.id.editText)).perform(typeText("GoodPassword!1"),closeSoftKeyboard());
        Thread.sleep(1500);
        onView(withId(R.id.button)).perform(click());
        Thread.sleep(1500);
        onView(withId(R.id.responseText)).check(matches(withText("Strong!")));
    }

    @Test
    public void invalidPassword() throws InterruptedException {
        onView(withId(R.id.editText)).perform(typeText("a"),closeSoftKeyboard());
        Thread.sleep(1500);
        onView(withId(R.id.button)).perform(click());
        Thread.sleep(1500);
        onView(withId(R.id.responseText)).check(matches(withText("Not strong enough!")));
    }
}
