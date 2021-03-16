package d20201202;

import java.util.Scanner;

public class ForEx01 {
	public static void main(String[] args) {
		// 사용자로부터 숫자를 하나 입력받아 해당 구구단 출력하세요
		

		System.out.println(" 2~9 사이에 숫자 하나 입력 : " );
		
		//int dan = System.in.read(); // 아스키 코드
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		//System.out.println("dan : "+ dan);
	    
		//dan -= 48;
		
		System.out.println(dan);
		
		for(int i=1; i<10; i++) {
			System.out.println(dan + "*"+ i + "="+(dan * i));
		
		
		
		}
		
		
	}

}
