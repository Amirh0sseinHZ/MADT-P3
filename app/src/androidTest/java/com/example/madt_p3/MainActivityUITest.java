package com.example.madt_p3;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.MediumTest;

import org.junit.Test;
import org.junit.Rule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@MediumTest
public class MainActivityUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testWhenNumber0IsPressed() {
        final String expectedResult = "0";

        onView(withId(R.id.buttonDigit0)).perform(click());
        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenNumber1IsPressed() {
        final String expectedResult = "1";

        onView(withId(R.id.buttonDigit1)).perform(click());
        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenNumber2IsPressed() {
        final String expectedResult = "2";

        onView(withId(R.id.buttonDigit2)).perform(click());
        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenNumber3IsPressed() {
        final String expectedResult = "3";

        onView(withId(R.id.buttonDigit3)).perform(click());
        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenNumber4IsPressed() {
        final String expectedResult = "4";

        onView(withId(R.id.buttonDigit4)).perform(click());
        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenNumber5IsPressed() {
        final String expectedResult = "5";

        onView(withId(R.id.buttonDigit5)).perform(click());
        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenNumber6IsPressed() {
        final String expectedResult = "6";

        onView(withId(R.id.buttonDigit6)).perform(click());
        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenNumber7IsPressed() {
        final String expectedResult = "7";

        onView(withId(R.id.buttonDigit7)).perform(click());
        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenNumber8IsPressed() {
        final String expectedResult = "8";

        onView(withId(R.id.buttonDigit8)).perform(click());
        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenNumber9IsPressed() {
        final String expectedResult = "9";

        onView(withId(R.id.buttonDigit9)).perform(click());
        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenBackspaceIsPressedAndIOAlIsEmpty() {
        final String expectedResult = "";

        onView(withId(R.id.buttonActionBackSpace)).perform(click());
        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenBackspaceIsPressedAndIOContainsNumber() {
        final String expectedResult = "1.001";

        onView(withId(R.id.buttonDigit1)).perform(click());
        onView(withId(R.id.buttonDigitDot)).perform(click());
        onView(withId(R.id.buttonDigit0)).perform(click(), click());
        onView(withId(R.id.buttonDigit1)).perform(click(), click());
        onView(withId(R.id.buttonActionBackSpace)).perform(click());
        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenTwoNumbersAreAdded() {
        final String expectedResult = "5.0";

        onView(withId(R.id.buttonDigit2)).perform(click());
        onView(withId(R.id.buttonActionAddition)).perform(click());
        onView(withId(R.id.buttonDigit3)).perform(click());
        onView(withId(R.id.buttonActionEqual)).perform(click());

        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenTwoNumbersAreSubtracted() {
        final String expectedResult = "4.0";

        onView(withId(R.id.buttonDigit9)).perform(click());
        onView(withId(R.id.buttonActionSubtraction)).perform(click());
        onView(withId(R.id.buttonDigit5)).perform(click());
        onView(withId(R.id.buttonActionEqual)).perform(click());

        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenTwoNumbersAreMultiplied() {
        final String expectedResult = "20.0";

        onView(withId(R.id.buttonDigit4)).perform(click());
        onView(withId(R.id.buttonActionMultiplication)).perform(click());
        onView(withId(R.id.buttonDigit5)).perform(click());
        onView(withId(R.id.buttonActionEqual)).perform(click());

        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenTwoNumbersAreDivided() {
        final String expectedResult = "2.0";

        onView(withId(R.id.buttonDigit6)).perform(click());
        onView(withId(R.id.buttonActionDivision)).perform(click());
        onView(withId(R.id.buttonDigit3)).perform(click());
        onView(withId(R.id.buttonActionEqual)).perform(click());

        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenDotIsPressed() {
        final String expectedResult = "0.";

        onView(withId(R.id.buttonDigitDot)).perform(click());

        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenReverseSignIsPressed() {
        final String expectedResult = "-5.0";

        onView(withId(R.id.buttonDigit5)).perform(click());
        onView(withId(R.id.buttonActionReverseSign)).perform(click());

        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenSqrtIsDoneOnANumber() {
        final String expectedResult = "5.0";

        onView(withId(R.id.buttonDigit2)).perform(click());
        onView(withId(R.id.buttonDigit5)).perform(click());
        onView(withId(R.id.buttonActionSqrt)).perform(click());

        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenMultipleActionButtonsArePressedAndThenDesiredCalculation() {
        final String expectedResult = "10.0";

        onView(withId(R.id.buttonActionDivision)).perform(click());
        onView(withId(R.id.buttonActionMultiplication)).perform(click());
        onView(withId(R.id.buttonActionAddition)).perform(click());
        onView(withId(R.id.buttonActionSubtraction)).perform(click());

        onView(withId(R.id.buttonDigit2)).perform(click());
        onView(withId(R.id.buttonActionMultiplication)).perform(click());
        onView(withId(R.id.buttonDigit5)).perform(click());
        onView(withId(R.id.buttonActionEqual)).perform(click());

        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenClearIsPressedOnEmptyIO() {
        final String expectedResult = "";

        onView(withId(R.id.buttonClearSign)).perform(click());

        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenClearIsPressedOnDirtyIO() {
        final String expectedResult = "";

        onView(withId(R.id.buttonDigit1)).perform(click(), click(), click(), click());
        onView(withId(R.id.buttonClearSign)).perform(click());

        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenClearIsPressedInTheMiddleOfAnActionThenCurrentActionVanishes() {
        final String expectedResult = "3.0";

        onView(withId(R.id.buttonDigit5)).perform(click());
        onView(withId(R.id.buttonActionMultiplication)).perform(click());
        onView(withId(R.id.buttonClearSign)).perform(click());
        onView(withId(R.id.buttonDigit1)).perform(click());
        onView(withId(R.id.buttonActionAddition)).perform(click());
        onView(withId(R.id.buttonDigit2)).perform(click());
        onView(withId(R.id.buttonActionEqual)).perform(click());

        onView(withId(R.id.editTextCalculatorIO)).check(matches(withText(expectedResult)));
    }
}