package d20201201;

// 산술 연산자 : +, -, *, /, %

public class OperEx02 {			// 클래스 시작
	public static void main(String[] args) {			// 메인 시작
		int a = 100;		// int 자료형 a 변수에 100 대입
		int b = 200;		// int 자료형 b 변수에 200 대입
		
		System.out.println("a + b = "+ a + b);			// "a + b = "+ a + b 출력
		System.out.println("a + b = "+ (a + b));		// "a + b = "+ (a + b) 출력
		System.out.println("a - b = "+ (a - b));		// "a - b = "+ (a - b) 출력
		System.out.println("a * b = "+ (a * b));		// "a * b = "+ (a * b) 출력
		System.out.println("a / b = "+ (a / b));		// "a / b = "+ (a / b) 출력
		System.out.println("a % b = "+ (a % b));		// "a % b = "+ (a % b) 출력
	}		// 메인 끝

}		// 클래스 끝
