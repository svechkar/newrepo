package com.company;

import java.util.Scanner;

public class Calculator {
    public static void getNumb() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        if (sc.hasNextInt()) {
            sc.nextInt();

            // System.out.println("You have entered " + number);
        } else {
            System.out.println("It is not a number! Please, enter a number.");
        }

        sc.close();
    }

    public int getSum(int a, int b) {
        return  a + b;
    }

    public int getDif(int a, int b) {
        return  a - b;
    }

    public int getMul(int a, int b) {
        return  a * b;
    }

    public int getDiv(int a, int b) {
        return  a / b;
    }

}
