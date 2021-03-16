package d20201130;

public class VarEx02 {                                         // 클래스 시작 
	public static void main(String[] args) {                   // 메인 시작
		
		byte b2;                                               // byte 자료형 b2 변수를 선언
		
		b2 = 127; // 변수 선언과 동시에 초기화                                                // b2 변수에 127을 대입
		
		// ctrl + F11 : 실행
		System.out.println("b2 : "+ b2);                       // 콘솔에 "b2 : "+ b2 출력
		
		System.out.println("---------------------------");     // 콘솔에 "---------------------------" 출력
		
		byte b1 = 10;                                          // byte 자료형 b1 변수에 10을 대입
		byte b3 = 20;                                          // byte 자료형 b3 변수에 20을 대입
		 
		//b2 = (b1 + b3);
		// 자바는 int 이하의 연산에서는 모두 int로 자동변환하여 계산
		
		int c = b1 + b3;                                       // int 자료형 c 변수에 b1 + b3 값 대입
		
		System.out.println("c : "+ c);                         // "c : "+ c 출력
		
		System.out.println("----------------------------");    // "----------------------------" 출력
		
		//c = b1;
		
		b1 = (byte)c; // (강제) 형변환                                                       // b1 변수에 (byte)형변환 c변수 대입
		
		System.out.println("b1 : "+ b1);                       // "b1 : "+ b1 출력
		
		int num = (int)3.15;                                   // int 자료형 num 변수에 int(형변환)3.15 대입
		  
		System.out.println("num : "+ num);                     // "num : "+ num 출력
		
		System.out.println("---------------------------");     // "---------------------------" 출력
		
		// 2. 실수형 : float, double
	      float f1 = 3.1415f;                                  // float 자료형 f1 변수에 3.1415f 대입
	      
	      double d1 = 3.1415;                                  // double 자료형 d1 변수에 3.1415 대입
	      
	      System.out.println("f1 : "+f1);                      // "f1 : "+f1 출력
	      System.out.println("d1 : "+d1);                      // "d1 : "+d1 출력

	}                                                          // 메인 끝

}                                                              // 클래스 끝
