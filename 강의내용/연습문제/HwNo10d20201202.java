package 연습문제;

import java.util.Scanner;

public class HwNo10d20201202 {
	public static void main(String[] args) {
		System.out.println(" 몇단? : ");
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		System.out.println(dan);
		for(int x=1; x<=9; x++) {
			System.out.println(dan + " * "+ x + " = "+ (dan*x));
		}
		
	}
}
