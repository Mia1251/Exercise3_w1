package se.lexicon;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculations and result:");

        System.out.println("Enter your first number:");
        int number1 = scanner.nextInt();
        System.out.println("Now choose an operation type: +. -, * or /");
        String operationTypE= scanner.next();
        System.out.println("Enter your second number:");
        int number2 = scanner.nextInt();

        switch (operationTypE) {

            case "+":
                int resultAdd = (number1 + number2);
                System.out.println("The sum is " + resultAdd);
                break;
            case "-":
                int resultSub = (number1 - number2);
                System.out.println("The difference is " + resultSub);
                break;
            case "*":
                int resultMul = (number1 * number2);
                System.out.println("The end result becomes " + resultMul);
                break;
            case "/":
                int resultDiv = (number1 / number2);
                System.out.println("The end result becomes " + resultDiv);
                break; }
    }
}
