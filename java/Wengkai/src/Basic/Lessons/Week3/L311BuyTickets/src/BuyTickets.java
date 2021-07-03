package Basic.Lessons.Week3.L311BuyTickets.src;

import java.util.Scanner;

public class BuyTickets {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        int amount0;
        int charge0;
        int balance0 = 0;
        while (true) {
            System.out.println("There's $10 for one tickets:");
            System.out.print("Please inputs money: ");
            amount0 = in0.nextInt();
            balance0 += amount0;
            charge0 = balance0 - 10;
            if (charge0 >= 0) {
                System.out.println("Here is your ticket.");
                if (charge0 == 0) {
                    System.out.println("There is no charge to you.");
                } else {
                    System.out.println("The charge is " + charge0);
                }
                balance0 = 0;
            }
        }
    }
}