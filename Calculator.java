package com.company;

import java.sql.SQLOutput;

public class Calculator {
    public addition(int a, int b) {
        return a+b;
        //System.out.println("Сложение двух чисел " + sum);
    }

    public differenceOff(int c, int d) {
        return c-d;
        //System.out.println("Разница двух чисел " + dif);
    }

    public multiplication(int e, int f) {
        return e*f;
        //System.out.println("Произведение двух чисел " + mult);
    }

    public division(int g, int h) {
        return g/h;
        //System.out.println("Частное двух чисел " + div);
    }

    public static void remaindeOfTheDivision() {
        int numb=9;
        int rem = numb % 3;
        if (rem == 0) {
            System.out.println("Число делится на 3");
        } else {
            System.out.println("Число не делится на 3");
        }
    }
}
