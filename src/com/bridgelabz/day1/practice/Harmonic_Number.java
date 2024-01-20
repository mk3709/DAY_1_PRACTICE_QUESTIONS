package com.bridgelabz.day1.practice;
import java.util.Scanner;
public class Harmonic_Number {
    public static void main(String[] args) {
        int Num_1;
        double result = 0;
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        Num_1 = scanner.nextInt();
        if(Num_1!=0)
        {
            for(double i=1;i<Num_1+1;i++)
            {
                result = result +(1/i);
            }
            System.out.println(result);
        }
        else
        {
            System.out.println("Enter a valid number");
        }
    }
}
