package com.bridgelabz.day1.practice;
import java.util.Scanner;

public class Quotient_and_Remainder_Problem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dividend: ");
        int a = scanner.nextInt();

        System.out.println("Enter divisior: ");
        int b = scanner.nextInt();

        int c = a/b;
        int d = a%b;

        System.out.println("The quotient is " + c);
        System.out.println("The remainder is " + d);

    }
}
