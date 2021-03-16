package d20201201;

import java.util.Scanner;

public class 연습문제1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수 입력 : ");
		
		int kor, eng, math; 
		
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		int total = kor + eng + math;
		double ave = total/3.0;
		
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ ave);
		String grade = "";
		
		switch(total/30) {
		case 10 : 
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default :
			grade = "F"; break;
		}
		
		System.out.println("당신의 평균점수는 : "+ ave +"입니다.");
		System.out.println("당신의 학점은 : "+ grade +"입니다.");
	
	}

}
