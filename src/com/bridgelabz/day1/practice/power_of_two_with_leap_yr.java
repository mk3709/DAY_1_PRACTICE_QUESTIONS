package com.bridgelabz.day1.practice;
import  java.util.Scanner;
public class power_of_two_with_leap_yr {
    public static void main(String[] args) {
        int letter1;
        //int b;
        double letter2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number within 31: ");
        letter1 = scanner.nextInt();
        if (letter1 < 32) {
            for (int i = 0; i < letter1; i++) {
                letter2 = (Math.pow(2, i));
                System.out.println("2^" + i + " = " + letter2);

            }
        }
    }
}
