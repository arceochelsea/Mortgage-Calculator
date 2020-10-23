package com.chelsea;

import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator {

    public static void main(String[] args) {
        //consts

        int monthsInAYear = 12;
        int percentage = 100;

        //create scanner class to get input from users
        //print out on the terminal
        //next method to read the data

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        long principal = scanner.nextLong();
        System.out.println("Your principle is " + principal);

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        System.out.println("Your Annual Interest Rate is " + annualInterest);
        float monthlyInterest = annualInterest / percentage / monthsInAYear;

        System.out.print("Period: ");
        int years = scanner.nextInt();
        int numOfPayments = years * monthsInAYear;
        System.out.println("Your Period is " + years);

        /*
        M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]
        P = principal loan amount

        i = monthly interest rate

        n = number of months required to repay the loan
        */

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numOfPayments)) / (Math.pow(1 + monthlyInterest, numOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

}
