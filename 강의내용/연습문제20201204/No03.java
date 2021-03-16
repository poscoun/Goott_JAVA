package 연습문제20201204;

import java.util.Scanner;

/*SwithEx04와 같은 결과과 나오도록 처리해보세요
- main : 사용자로부터 국어, 영어, 수학 점수 입력받기
         : call by value 형태로 메소드를 호출하여 결과 (평균점수와 학점) 출력
         : 메소드명 : paramDemo()
- paramDemo() : 평균점수와 학점 구하는 로직 필요
*/
public class No03 {
	public static void main(String[] args) {
		System.out.println("...학점처리...");
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int k_score = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int e_score = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int m_score = sc.nextInt();
		
		//System.out.println(""+ k_score + ", " + e_score + ", "+ m_score);
		
		//총점 구하기
		int score = (k_score + e_score + m_score);
		
		No03 mh = new No03();
		mh.paramDemo(score);
	
	}// main end

	// paramDemo() : 평균점수와 학점을 구하는 로직이 필요
	void paramDemo(int total) {
		// 평균 구하기
		double avg = total/3.0;
		
		// System.out.println("총점 : "+ score + ", 평균 : "+ avg);
		
		// 학점 구하기
		String grade = "";
		int key = total/30;
		
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
