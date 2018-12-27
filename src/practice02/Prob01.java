package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		Scanner s = new Scanner(System.in);
		System.out.print("금액: ");
		int money = s.nextInt();
		
		System.out.println();
		for(int i = 0 ; i < MONEYS.length; i++) {
			System.out.print(MONEYS[i]+"원 : " );
			System.out.println(money/MONEYS[i]+"개");
			money = money%MONEYS[i];
		}
		
	}

}
