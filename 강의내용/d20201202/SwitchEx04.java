package d20201202;

import java.util.Scanner;

// 국어, 영어, 수학 점수를 받아 총점, 평균, 학점 구하기

public class SwitchEx04 {
	public static void main(String[] args) {
		// 점수를 차례대로 입력 받기
		System.out.println("...학점처리...");
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int k_score = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int e_score = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int m_score = sc.nextInt();
		
		// System.out.println(""+ k_score + ", " + e_score + ", "+ m_score);
		
		// 총점 구하기
		int score = (k_score + e_score + m_score);
		
		// 평균 구하기
		double avg = score/3.0;
		
		// System.out.println("총점 : "+ score + ", 평균 : "+ avg);
		
		// 학점 구하기
		String grade = "";
		int key = score/30;
		
		// System.out.println(""+ score + ", " +key);
		
	    switch(key) {
	    case 10 :
	    case 9 : grade = "A"; break;
	    case 8 : grade = "B"; break;
	    case 7 : grade = "C"; break;
	    case 6 : grade = "D"; break;
	    default : grade = "F"; break;	    
		}
	    
	    // 최종 출력
	    System.out.println("당신의 평균점수는 "+ avg + " 입니다.");
	    System.out.println("당신의 학점은 "+ grade + " 입니다.");

	}

}
