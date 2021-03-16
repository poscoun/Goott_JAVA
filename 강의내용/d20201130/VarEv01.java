package d20201130;

// 식별자 + 변수
// 1. primitive type
// 정수형 : byte, short, int, long
public class VarEv01 {          // 클래스 시작
	public static void main(String[] args) {		// 메인 시작
		// 변수 : 데이터를 저장하거나 참조하기 위해 메모리에 공간을 할당하는 것(그릇)
		
		// 변수 사용법 : 식별자(자료형) 변수명; => 변수를 선언한다
		byte b1; // -128 ~ 127            // byte 자료형 b1이라는 변수를 선언
		
		// 초기화
		b1 = 10; // = : 대입 연산자                    // b1이라는 변수에 10을 대입
		
		b1 = 20;                          // b1 변수에 20을 대입
		
		short sh1;                        // short 자료형 sh1이라는 변수를 선언
		
		sh1 = 10000;                      // sh1 변수에 10000을 대입
		
		int it;                           // int 자료형 it이라는 변수를 선언
		it = 999999999;                   // it 변수에 999999999을 대입
		
		long lo1;                         // long 자료형 lo1이라는 변수를 선언
		lo1 = 1293081238;                 // lo1 변수에 1293081238을 대입
		
		System.out.println("b1 : "+ b1);      // 콘솔에  "b1 : "+ b1 값을 출력
		System.out.println("sh1 : "+ sh1);    // 콘솔에  "sh1 : "+ sh1 값을 출력
		System.out.println("it : "+ it);      // 콘솔에  "it : "+ it 값을 출력
		System.out.println("lo1 : "+ lo1);    // 콘솔에  "lo1 : "+ lo1 값을 출력
	}                                     // 메인 끝

}                                         // 클래스 끝
