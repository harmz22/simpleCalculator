/** Harman Sandhu
ITEC 2610 - Object-Oriented Programing.
 This Main method is used to collect user input to
 simple computations of a simple calculator. **/

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        String userInput =  new String ("y");

        while (userInput.equalsIgnoreCase("Y")) { // If user wants to run multiple calculations it will continue until n or N is entered.
            while (true) {
                System.out.print("Enter first number: "); // The first value, try and catch is used to check if this is a valid double value.
                try {
                    num1 = input.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("That is not a valid input. Please try again.");
                    input = new Scanner(System.in);
                }
            }

            System.out.print("Enter an operator (+, -, *, /): "); // Selecting an operator.
            char operator = input.next().charAt(0);

            while (true) {
                System.out.print("Enter second number: "); // The Second value, try and catch is used to check if this is a valid double value.
                try {
                    num2 = input.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("That is not a valid input. Please try again.");
                    input = new Scanner(System.in);
                }
            }

            Calculator calculator = new Calculator(num1, num2, operator); // Calls the Calculator class to perform operations by the selected operator.
            double result = calculator.calculate();

            if (Double.isNaN(result)) { // Will return error for division of zero and invalid operators
                System.out.println("Error: Cannot be divided by Zero.");
            } else {
                System.out.println("Result: " + result);
            }
            input.nextLine(); // Consumes the last line, so it doesn't end right away.
            System.out.println("Would you like to perform another (y or n): "); // Asks user if they would like to perform another calculation.
            userInput = input.nextLine();
        }
        System.out.println("The simple calculator is now closed!"); // Closed program when answer is N or n.
    }
}