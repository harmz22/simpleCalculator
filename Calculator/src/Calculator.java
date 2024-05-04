/**    Name: Harman Sandhu
 Student ID: 215629967
 ITEC 2610 - Object-Oriented Programing.
 This class controls the various computations
 the user is able to perform using switch case method **/
public class Calculator {
    private double num1; // First User entered value.
    private double num2; // Second User entered value.
    private char operator; // '+', '-','*','/'

    public Calculator(double num1, double num2, char operator) {
            this.num1 = num1;
            this.num2 = num2;
            this.operator = operator;
        }
    public double calculate() { // Possible Operations
        switch (operator) {
            case '+':
                return num1 + num2; // Addition
            case '-':
                return num1 - num2; // Subtraction
            case '*':
                return num1 * num2; // Multiplication
            case '/':
                if (num2 != 0) {
                    return num1 / num2; // Division by all values that are not zero.
                } else {
                    return Double.NaN; // Indicate division by zero or invalid operator.
                }
            default:
                return Double.NaN; // Indicate invalid operator.
        }
    }
}

