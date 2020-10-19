package com.chelsea;

import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        //consts
        int months = 12;
        int percentage = 100;

        //create scanner class to get input from users
        //print out on the terminal
        //next method to read the data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        long principle = scanner.nextLong();
        System.out.println("Your principle is " + principle);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        float interest = scanner1.nextFloat();
        System.out.println("Your Annual Interest Rate is " + interest);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Period: ");
        int period = scanner2.nextInt();
        System.out.println("Your Period is " + period);

    }

}
