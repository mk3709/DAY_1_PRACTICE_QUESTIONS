package com.bridgelabz.day1.practice;
import java.util.Scanner;
public class leap_year_problem {
    public static void main(String[] args){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Leap Year");
        a = scanner.nextInt();
        if(a%100 !=0 && a%4==0 ){
            System.out.println("Its a Leap year");
        }
        else if (a%400==0 && a%100==0 ){
            System.out.println("Its a Leap year");
        }
        else {
            System.out.println("Its not a Leap year");
        }
    }
}
