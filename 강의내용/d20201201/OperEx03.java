package d20201201;

// 3. shift 연산자 : >>, <<, >>>
public class OperEx03 {		// 클래스 시작
	public static void main(String[] args) {		// 메인 시작
		
		byte b = 10;		// byte 자료형 b 변수에 10 대입
		
		// >> : 맨 앞의 비트값이 0이면 0으로, 1이면 1로 들어옴
		// >>> : 맨 앞의 비트값과 관계없이 0으로 들어옴
		
		System.out.println("b >> 2 : " + (b >> 2));		// "b >> 2 : " + (b >> 2) 출력
		// 0000 1010 >> 0000 0010 
		
		System.out.println("b << 2 :" + (b << 2));		// "b << 2 :" + (b << 2) 출력
		// 0000 1010 << 0010 1000
		
		System.out.println("b >>> 2 : " + (b >>> 2));		// "b >>> 2 : " + (b >>> 2) 출력
		// 0000 1010 >>> 0000 0010
	}		//메인 끝

}		// 클래스 끝
