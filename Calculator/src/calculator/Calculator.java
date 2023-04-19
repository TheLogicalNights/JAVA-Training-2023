package calculator;

import java.util.Scanner;

public class Calculator {
    private void displayOptions() {
        System.out.println("--------------------------------------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Square");
        System.out.println("7. Cube");
        System.out.println("8. Exit");
        System.out.println("--------------------------------------------");
        System.out.println("Enter your choice...");
    }

    private int getIntegerInput() {
        Scanner cin = new Scanner(System.in);
        return cin.nextInt();
    }

    private void process(int choice) {
        Math math = new Math();
        switch (choice) {
            case 1: {
                System.out.println("Enter First Number");
                int iNo1 = getIntegerInput();
                System.out.println("Enter Second Number");
                int iNo2 = getIntegerInput();
                int addition = math.addTwoNumbers(iNo1, iNo2);
                System.out.println("Addition is: " + addition);
                break;
            }
            case 2: {
                System.out.println("Enter First Number");
                int iNo1 = getIntegerInput();
                System.out.println("Enter Second Number");
                int iNo2 = getIntegerInput();
                int subtraction = math.subtractTwoNumbers(iNo1, iNo2);
                System.out.println("Subtraction is: " + subtraction);
                break;
            }
            case 3: {
                System.out.println("Enter First Number");
                int iNo1 = getIntegerInput();
                System.out.println("Enter Second Number");
                int iNo2 = getIntegerInput();
                int multiplication = math.multiplyTwoNumbers(iNo1, iNo2);
                System.out.println("Multiplication is: " + multiplication);
                break;
            }
            case 4: {
                System.out.println("Enter First Number");
                int iNo1 = getIntegerInput();
                System.out.println("Enter Second Number");
                int iNo2 = getIntegerInput();
                int division = math.divideTwoNumbers(iNo1, iNo2);
                if (division == -1) {
                    System.out.println("Cannot divide with : " + iNo2);
                } else {
                    System.out.println("Multiplication is: " + division);
                }
                break;
            }
            case 5: {
                System.out.println("Enter First Number");
                int iNo1 = getIntegerInput();
                System.out.println("Enter Second Number");
                int iNo2 = getIntegerInput();
                int modulo = math.moduloOfTwoNumbers(iNo1, iNo2);
                if (modulo == -1) {
                    System.out.println("Cannot divide with : " + iNo2);
                } else {
                    System.out.println("Modulo is: " + modulo);
                }
                break;
            }
            case 6: {
                System.out.println("Enter a Number");
                int iNo = getIntegerInput();
                int square = math.squareOfNumber(iNo);
                System.out.println("Square of " + iNo + " is: " + square);
                break;
            }
            case 7: {
                System.out.println("Enter a Number");
                int iNo = getIntegerInput();
                int cube = math.cubeOfNumber(iNo);
                System.out.println("Cube of " + iNo + " is: " + cube);
                break;
            }
            case 8: {
                break;
            }
            default: {
                System.out.println("Invalid Choice.");
            }
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int choice = 0;
        while (choice != 8) {
            calculator.displayOptions();
            choice = calculator.getIntegerInput();
            calculator.process(choice);
        }
    }
}
