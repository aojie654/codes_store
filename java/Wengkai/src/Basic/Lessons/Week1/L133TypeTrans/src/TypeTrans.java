package Basic.Lessons.Week1.L133TypeTrans.src;

import java.util.Scanner;

public class TypeTrans {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double foot0;
        double inch0;
        double height0;
        Scanner in0 = new Scanner(System.in);
        foot0 = in0.nextInt();
        inch0 = in0.nextInt();
        height0 = (int)((foot0+inch0/12)*30.48);
        System.out.println(height0);
    }

}
