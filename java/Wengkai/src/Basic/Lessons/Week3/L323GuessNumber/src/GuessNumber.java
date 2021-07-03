package Basic.Lessons.Week3.L323GuessNumber.src;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        int num0 = (int)(Math.random()*128+1);
        int guess0 = 0;
        int count0 = 0;
        do{
            guess0 = in0.nextInt();
            count0 += 1;
            if (guess0>num0){
                System.out.print("Tty to less: ");
            }
            else if (guess0<num0){
                System.out.print("Tty to more: ");
            }
        }while(guess0 != num0);
        System.out.println("Congratulations! You are right!");
        System.out.print("You guessed for "+count0+" times. ");
        if(count0 >7){
            System.out.println("It's too much for this game.");
        }
        else if(3< count0 && count0 <=7){
            System.out.println("Not bad.");
        }
        else{
            System.out.println("Excellent!");
        }
    }
}
