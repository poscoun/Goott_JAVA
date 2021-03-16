package d20201204;

import java.lang.management.OperatingSystemMXBean;

// 임의의 두 정수를 받아서, 사칙연산을 수행하는 메소드를 작성
// (단, 나눗셈의 몫과 나머지는 따로 출력)
// 메소드명 : operMethod()
public class MethodEx01 {
	void operMethed(int x, int y) {
		System.out.println("덧셈 : "+ (x + y));
		System.out.println("뺄셈 : "+ (x - y));
		System.out.println("곱셈 : "+ (x * y));
		System.out.println("나눗셈 : "+ (x / y));
		System.out.println("나머지 : "+ (x % y));

	}
	
	public static void main(String[] args) {
		
		MethodEx01 me1 = new MethodEx01();
		me1.operMethed(20, 10);
		
		
	}
}
