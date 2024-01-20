
package com.bridgelabz.day1.practice;
import java.util.*;

public class coin_flip {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of times to flip the coin");
        int flips = input.nextInt();
        int headcount = 0, tailcount = 0;
        for (int i = 1; i <= flips; i++) {
            double rand = Math.random();
            if (rand >= 0 && rand < 0.5) {
                tailcount++;

            } else {
                headcount++;
            }
        }
        System.out.println("Headcount is:" + headcount);
        System.out.println("Tailcount is:" + tailcount);
        double headPercentage = ((double) headcount / flips) * 100;
        System.out.println("Heads percentage=" + headPercentage);
        double tailPercentage = 100 - (headPercentage);
        System.out.println("Tails percentage=" + tailPercentage);


    }
}

