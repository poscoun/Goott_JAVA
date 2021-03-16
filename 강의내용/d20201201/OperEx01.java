package d20201201;


// 연산자
// 1. 증감 연산자 : ++, --
public class OperEx01 {		// 클래스 시작
	public static void main(String[] args) {	// 메인 시작
		int a = 100;	// int 자료형 변수 a에 100을 대입
		int b = 100;    // int 자료형 변수 b에 100을 대입
		
		//a = 101;
		//a = a + 1;
//		a ++;
//		b --;
		
		//b = ++ a;	// 전치 연산 : 연산 후 대입
		
		b = a ++;	// 후치 연산 : 먼저 대입 후 연산, 변수 b에 변수 a 대입 후 ++연산
		
		System.out.println("a = "+ a + ",b = "+ b);		// "a = "+ a + ",b = "+ b 출력
	}		// 메인 끝

}		// 클래스 끝
