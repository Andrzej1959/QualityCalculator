package pl.edu.agh.qualitycalculator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testSum(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4.0 plus 4.0 gives value 8.0")));
       }
    @Test
    public void testSub(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnSub)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4.0 minus 4.0 gives value 0.0")));
    }
    @Test
    public void testMult(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnMult)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4.0 multiplied by 4.0 gives value 16.0")));
    }
    @Test
    public void testDiv(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4.0 divided by 4.0 gives value 1.0")));
    }
    @Test
    public void testDiv0(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("0"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4.0 divided by 0.0 gives value Infinity")));
    }
    @Test
    public void testDiv00(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("0"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("0"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("0.0 divided by 0.0 gives value NaN")));
    }
    @Test
    public void testEmpty1(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText(""));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("6"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }
    @Test
    public void testEmpty12(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("7"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText(""));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }
    @Test
    public void testAvg(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("3"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("5"));
        onView(withId(R.id.btnAvg)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("average of 3.0, 4.0, 5.0 gives value 4.0")));
    }
    @Test
    public void testAvgEmpty1(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText(""));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("7"));
        onView(withId(R.id.btnAvg)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }
    @Test
    public void testAvgEmpty2(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText(""));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("7"));
        onView(withId(R.id.btnAvg)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }
    @Test
    public void testAvgEmpty3(){
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("3"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText(""));
        onView(withId(R.id.btnAvg)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
    }

}

