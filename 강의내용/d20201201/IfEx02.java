package d20201201;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		// 학점 처리
		
		System.out.println("학생의 성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);		//	스캐너 클래스 복제
		
		int score = sc.nextInt();
		
		//System.out.println("score : "+ score);
		
		if(score >= 90) {
			System.out.println("당신의 학점은 A입니다.");
		}else if(score >= 80) {
			System.out.println("당신의 학점은 B입니다.");						
		}else if(score >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		}else if(score >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		}else {
			System.out.println("당신의 학점은 F입니다.");
		}
		
		
		
	}

}
