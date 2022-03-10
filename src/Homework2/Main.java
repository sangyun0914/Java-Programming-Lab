package Homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first fraction: ");
        int numerator1 = input.nextInt();
        int denominator1 = input.nextInt();

        System.out.print("Input second fraction: ");
        int numerator2 = input.nextInt();
        int denominator2 = input.nextInt();

        while (denominator1 == 0 || denominator2 == 0) { // Validate denominator value
            System.out.println("Cannot be divided by zero.");
            System.out.println("Input Again.");

            System.out.print("Input first fraction: ");
            numerator1 = input.nextInt();
            denominator1 = input.nextInt();

            System.out.print("Input second fraction: ");
            numerator2 = input.nextInt();
            denominator2 = input.nextInt();
        }

        Fraction fraction1 = new Fraction(numerator1, denominator1);
        Fraction fraction2 = new Fraction(numerator2, denominator2);
        Fraction newFrac = new Fraction();

        System.out.print("First fraction is: ");
        fraction1.print();
        System.out.print("Second fraction is: ");
        fraction2.print();

        newFrac = fraction1.add(fraction2);
        System.out.print("Result of addition is: ");
        newFrac.print();

        newFrac = fraction1.subtract(fraction2);
        System.out.print("Result of subtraction is: ");
        newFrac.print();

        newFrac = fraction1.multiply(fraction2);
        System.out.print("Result of multiplication is: ");
        newFrac.print();

        if (fraction2.getNumerator() == 0) // Catch divion by zero
            System.out.println("Result of division is: Cannot be divided by zero.");
        else {
            newFrac = fraction1.divide(fraction2);
            System.out.print("Result of division is: ");
            newFrac.print();
        }

        input.close();
    }

}