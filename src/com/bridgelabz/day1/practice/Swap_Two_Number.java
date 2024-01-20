package com.bridgelabz.day1.practice;
import java.util.Scanner;

public class Swap_Two_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A value : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter B Value : ");
        int num2 = scanner.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println(num1);
        System.out.println(num2);
    }
}
