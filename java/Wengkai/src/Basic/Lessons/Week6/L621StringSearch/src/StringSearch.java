package Basic.Lessons.Week6.L621StringSearch.src;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  s1 = "adbcdefghijk";
        s1 = s1.toUpperCase();
        for (int i =0;i<s1.length();i+=1){
            System.out.print(s1.charAt(i)+" ");
        }
//        Can not use "for each"!!!
        System.out.println();
        System.out.println(s1.substring(2,4));
        System.out.println(s1.indexOf("4"));
        System.out.println(s1.indexOf("EFG"));
    }
}
