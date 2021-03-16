package d20201201;

import java.util.Scanner;

// 학점 구하는 switch문
// 사용자로부터 점수를 입력받은 후
// 당신의 학점은 ~~~ 입니다. (출력)

public class SwitchEx03 {
	public static void main(String[] args) {
		// 1. 사용자로부터 점수를 입력을 받는다
		System.out.println("시험점수를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		//System.out.println("score : "+ score);
		
		// 2. key값 정의(찾기)
		// : switch문은 case에 값 하나만 인정됨
		// : 이런 경우라면 사이값을 값 하나가 되도록 정리 => 10의 자리수만 남도록...
		int key = score/10;
		
		String grade = "";
		
		// 3. switch문을 통한 구현
		switch(key) {
		case 10 :
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default :
			grade = "F"; break;
		}
		// 4. 최종 결과를 출력
		System.out.println("당신의 학점은 "+ grade + " 입니다.");
	
	
	}

}
