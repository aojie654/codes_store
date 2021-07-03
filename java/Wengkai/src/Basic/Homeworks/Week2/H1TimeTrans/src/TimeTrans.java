package Basic.Homeworks.Week2.H1TimeTrans.src;

import java.util.Scanner;
public class TimeTrans {

	private static Scanner in1;

	public static void main(String[] args) {
		in1 = new Scanner(System.in);
		int BJT = in1.nextInt();
    	if(BJT>=0 && BJT <= 2359) {
			if(BJT < 800){
                BJT+=2400;
            }
        }
        int UTC = BJT - 800;
        System.out.println(UTC);
	}
}
