package Basic.Homeworks.Week2.H2SingalReport.src;

import java.util.Scanner;

public class SingalReport {
	private static Scanner in1;

	public static void main(String[] args) {
		in1 = new Scanner(System.in);
		String sinR = "", sinS = "";
		int sinNum0 = in1.nextInt();
		if (sinNum0 >= 11 && sinNum0 <= 59) {
			switch (sinNum0 / 10) {
			case 1:
				sinR = "Unreadable";
				break;
			case 2:
				sinR = "Barely readable, occasional words distinguishable";
				break;
			case 3:
				sinR = "Readable with considerable difficulty";
				break;
			case 4:
				sinR = "Readable with practically no difficulty";
				break;
			case 5:
				sinR = "Perfectly readable";
				break;
			}
			switch (sinNum0 % 10) {
			case 1:
				sinS = "Faint signals, barely perceptible";
				break;
			case 2:
				sinS = "Very weak signals";
				break;
			case 3:
				sinS = "Weak signals";
				break;
			case 4:
				sinS = "Fair signals";
				break;
			case 5:
				sinS = "Fairly good signals";
				break;
			case 6:
				sinS = "Good signals";
				break;
			case 7:
				sinS = "Moderately strong signals";
				break;
			case 8:
				sinS = "Strong signals";
				break;
			case 9:
				sinS = "Extremely strong signals";
				break;
			}
		}
		if(sinS != "" && sinR!="") {
			System.out.println(sinS + ", " + sinR + ".");
		}
	}
}
