package d20201204;

// 1. 임의의 두 정수를  세 번 입력 받기
// 2. 두 수 차의 절대값을 출력하는 메소드
// 메소드명 : abs()
public class MethodEx02 {
	void abs(int x, int y) {
		
		if(x > y) {						// 절대값 구하기
			System.out.println(x - y); 
		}else {
			System.out.println(y - x);
		}// if end
		
	}// abs() end
	public static void main(String[] args) {
		MethodEx02 me2 = new MethodEx02();

		me2.abs(10, 90);
		me2.abs(-20, 60);
		me2.abs(9, -37);
	
	}
}
