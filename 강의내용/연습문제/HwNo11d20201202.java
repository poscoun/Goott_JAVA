package 연습문제;

import java.util.Scanner;

public class HwNo11d20201202 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		int inputN = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" 숫자를 입력하세요 : ");
		inputN = sc.nextInt();
		do {
			num++;
			sum += num;
		}while (num < inputN);
		System.out.printf("1부터 입력하신 숫자 %d까지의 합은 ", inputN);
		System.out.printf("%d 입니다", sum);
		sc.close();
	
	}

}
