package com.example.madt_p3;

public class Calculator {

    /**
     * Adds the numbers 'a' and 'b'
     *
     * @param  double a     the first number
     * @param  double b     the second number
     *
     * @return  the sum
     */
    public static double Add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the number 'a' from the number 'b'
     *
     * @param  double a     the first number
     * @param  double b     the second number
     *
     * @return  the subtraction
     */
    public static double Subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies the numbers 'a' and 'b'
     *
     * @param  double a     the first number
     * @param  double b     the second number
     *
     * @return  the multiplication
     */
    public static double Multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the numbers 'a' by the number 'b'
     *
     * @param  double a     the first number
     * @param  double b     the second number
     *
     * @return  the quotient
     */
    public static double Divide(double a, double b) throws Exception {
        if(b == 0) {
            throw new Exception("Division by 0 is undefined");
        }
        return a / b;
    }

    /**
     * Takes square root of the number
     *
     * @param  double a     the number
     *
     * @return  the square root
     */
    public static double Sqrt(double a) throws Exception {
        if(a < 0) {
            throw new Exception("Square root of negative numbers is undefined");
        }

        return Math.sqrt(a);
    }

    /**
     * Reverses the sign of the number
     *
     * @param  double a     the number
     *
     * @return  the negative of the number if it's positive,
     *          or the positive of the number if it's negative.
     */
    public static double ReverseSign(double a) {
        return a * (-1);
    }
}
