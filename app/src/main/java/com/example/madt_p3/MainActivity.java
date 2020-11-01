package com.example.madt_p3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Float.parseFloat;

public class MainActivity extends AppCompatActivity {

    private EditText eTCalculatorIO;
    private double number1;
    private String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTCalculatorIO = (EditText) findViewById(R.id.editTextCalculatorIO);

        // Setting Digits' texts
        Button[] btnDigits = new Button[10];
        for (int i = 0; i < 10; i++) {
            int resourceId = getResources().getIdentifier(
                    "buttonDigit"+i,
                    "id",
                    getApplicationContext().getPackageName());
            btnDigits[i] = (Button) findViewById(resourceId);
            int btnId = getResources().getIdentifier("btn" + i, "string", getPackageName());
            if(btnId != 0)
                btnDigits[i].setText(getString(btnId));
        }

        // Setting Controls' text
        Button btnDot = (Button) findViewById(R.id.buttonDigitDot);
        Button btnEqual = (Button) findViewById(R.id.buttonActionEqual);
        Button btnSum = (Button) findViewById(R.id.buttonActionAddition);
        Button btnMinus = (Button) findViewById(R.id.buttonActionSubtraction);
        Button btnDivide = (Button) findViewById(R.id.buttonActionDivision);
        Button btnMultiply = (Button) findViewById(R.id.buttonActionMultiplication);
        Button btnSqrt = (Button) findViewById(R.id.buttonActionSqrt);
        Button btnReverse = (Button) findViewById(R.id.buttonActionReverseSign);
        Button btnClear = (Button) findViewById(R.id.buttonClearSign);
        Button btnBackspace = (Button) findViewById(R.id.buttonActionBackSpace);
        btnDot.setText(R.string.btnDot);
        btnEqual.setText(R.string.btnEqual);
        btnSum.setText(R.string.btnSum);
        btnMinus.setText(R.string.btnMinus);
        btnDivide.setText(R.string.btnDivide);
        btnMultiply.setText(R.string.btnMultiply);
        btnSqrt.setText(R.string.btnSqrt);
        btnReverse.setText(R.string.btnReverse);
        btnClear.setText(R.string.btnClear);
        btnBackspace.setText(R.string.btnBackspace);


        ResetCalculator();
    }

    /**
     * Calculates the request and writes the output to the I/O
     */
    @SuppressLint("SetTextI18n")
    private void Calculate() {
        double result;
        double number2 = parseFloat(String.valueOf(eTCalculatorIO.getText()));
        switch (operator) {
            case "Add": // addition
                result = Calculator.Add(number1, number2);
                break;
            case "Sub": // subtraction
                result = Calculator.Subtract(number1, number2);
                break;
            case "Mul": // multiplication
                result = Calculator.Multiply(number1, number2);
                break;
            case "Div": // division
                result = Calculator.Divide(number1, number2);
                break;
            case "Sqr": // square root
                result = Calculator.Sqrt(number1);
                break;
            case "Rev": // reverse sign
                result = Calculator.ReverseSign(number1);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        eTCalculatorIO.setText(Float.toString((float) result));
    }

    /**
     * Resets calculator to its initial values
     */
    private void ResetCalculator() {
        number1 = 0;
        operator = "";
        eTCalculatorIO.setText("");
        eTCalculatorIO.setHint(R.string.btn0);
    }

    /**
     * OnClick event handler for the digits from 1-9
     *
     * @param instance of android.view.View
     */
    @SuppressLint("SetTextI18n")
    public void onClickDigitHandler(View view) {

        // Getting the clicked digit from the clicked object by filtering Id
        String[] splitedId = String.valueOf(view).split("app:id/buttonDigit");
        String clickedDigit = String.valueOf(splitedId[1].charAt(0));

        boolean inputEqualsZero = eTCalculatorIO.getText().toString().equals("0");

        if (inputEqualsZero) {
            // Replace
            eTCalculatorIO.setText(clickedDigit);
        } else {
            // Append
            eTCalculatorIO.setText(eTCalculatorIO.getText() + clickedDigit);
        }
    }

    /**
     * OnClick event handler for the actions (Multiply, Divide, Add, Subtract)
     *
     * @param instance of android.view.View
     */
    public void onClickActionHandler(View view) {

        // Getting the clicked action from the clicked object by filtering Id
        String[] splitedId = String.valueOf(view).split("app:id/buttonAction");
        String clickedAction = splitedId[1].substring(0,3);

        boolean isInputEmpty = eTCalculatorIO.getText().toString().equals("");
        boolean isOperatorEmpty = operator.equals("");

        if( ! isInputEmpty) {
            if( ! isOperatorEmpty) {
                // if we already have an operator existing from the previous action
                Calculate();
                operator = "";
                return;
            }

            // save the first number and action in memory
            number1 = parseFloat(String.valueOf(eTCalculatorIO.getText()));
            operator = clickedAction;

            // empty the I/O to read the second number
            eTCalculatorIO.setText("");
        }
    }

    /**
     * OnClick event handler for the actions which require only one input (Square Root, Reverse Sign)
     *
     * @param instance of android.view.View
     */
    public void onClickOneInputActionHandler(View view) {

        // Getting the clicked action from the clicked object by filtering Id
        String[] split = String.valueOf(view).split(getString(R.string.btnIdRegex));
        String clickedAction = split[1].substring(0, 3);

        boolean isInputEmpty = eTCalculatorIO.getText().toString().equals("");

        if( ! isInputEmpty) {
            number1 = parseFloat(String.valueOf(eTCalculatorIO.getText()));
            operator = clickedAction;
            Calculate();
            operator = "";
        }
    }

    /**
     * OnClick event handler for the digit '0'
     *
     * @param instance of android.view.View
     */
    @SuppressLint("SetTextI18n")
    public void onClickButton0Handler(View view) {

        boolean isInput0 = eTCalculatorIO.getText().toString().equals("0");

        if( ! isInput0) {
            eTCalculatorIO.setText(
                    eTCalculatorIO.getText() + "0");
        }
    }

    /**
     * OnClick event handler for the 'C' button
     *
     * @param instance of android.view.View
     */
    public void onClickButtonClearSign(View view) {
        ResetCalculator();
    }

    /**
     * OnClick event handler for the '.' button
     *
     * @param instance of android.view.View
     */
    @SuppressLint("SetTextI18n")
    public void onClickDigitDot(View view) {

        boolean isInputEmpty = eTCalculatorIO.getText().toString().equals("");
        boolean doesInputContainDot = eTCalculatorIO.getText().toString().contains(".");

        if(isInputEmpty) {
            eTCalculatorIO.setText(
                    eTCalculatorIO.getText() + "0.");
        } else if ( ! doesInputContainDot) {
            eTCalculatorIO.setText(
                    eTCalculatorIO.getText() + ".");
        }

    }

    /**
     * OnClick event handler for the equals button
     *
     * @param instance of android.view.View
     */
    public void onClickEqualsHandler(View view) {

        boolean isInputEmpty = eTCalculatorIO.getText().toString().equals("");
        boolean isOperatorEmpty = operator.equals("");

        if( ! isInputEmpty && ! isOperatorEmpty) {
            Calculate();
            operator = "";
        }
    }

    /**
     * OnClick event handler for the backspace button
     *
     * @param instance of android.view.View
     */
    public void onClickActionBackSpace(View view) {

        boolean isInputEmpty = eTCalculatorIO.getText().toString().equals("");

        if( ! isInputEmpty) {
            String inputString = eTCalculatorIO.getText().toString();
            eTCalculatorIO.setText(
                    inputString.substring(0, inputString.length() - 1));
        }
    }
}