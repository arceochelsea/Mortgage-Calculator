//For each question we want to validate the value that the user enters. If invalid we want to ask the same question again.

package com.chelsea;

import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator {

    public static void main(String[] args) {
        
        //consts
        int monthsInAYear = 12;
        int percentage = 100;
        
        //these were removed out of the code block so it is able to be accessed globally
        int principal = 0; 
        float monthlyInterest = 0;
        int numOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) { //infinite loops 
            System.out.print("Principle: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) //if valid value break if not print error
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) { //if valid value, calculate monthlyinterest then break out of the loop if not print error
                monthlyInterest = annualInterest / percentage / monthsInAYear;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Period: (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) { //if valid calculate numofpayments then break, if not print error
                numOfPayments = years * monthsInAYear;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        /*
        M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]
        P = principal loan amount

        i = monthly interest rate

        n = number of months required to repay the loan
        */

        //this will work the same because consts were placed outside of local scope (inside code block) to outside of it!
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numOfPayments)) / (Math.pow(1 + monthlyInterest, numOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

}

