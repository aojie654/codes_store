package Basic.Lessons.Week2.L211BuyTickets.src;

import java.util.Scanner;

public class BuyTickets {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        int amount0 = 0;
        int charge0 = 0;

        System.out.println("There's $10 for one tickets:");
        System.out.print("Please inputs money: ");
        amount0 = in0.nextInt();
        charge0 = amount0 - 10;
        if (charge0 >= 0) {
            System.out.println("Here is your ticket.");
            if (charge0 != 0) {
                System.out.println("The charge is $" + charge0 + ".");
            } else {
                System.out.println("There is no charge to you.");
            }
        } else {
            System.out.println("The amount is not enough for you need $" + -charge0 + " more.");
        }
    }
}
