package d20201207;

public class MethodEx05 {
	/*
	 * 
	 *	임의의 원의 반지름 정보를 전달하면 
	 * 	
	 * 	1) 원의 넓이를 계산해서 반환하는 메소드 생성 - 구현부에서 결과 출력
	 * 	반지름 : 12.2
	 * 
	 * 	2) 원의 둘레를 계산해서 반환하는 메소드 생성 - 구현부에서 결과 출력
	 * 	반지름 : 7.6
	 * 
	 * 	원의 넓이 : 반지름 * 반지름 * 3.14
	 * 	원의 둘레 : 반지름 * 2 * 3.14
	 * 
	 */
	
	// 1) 원의 넓이를 구하는 메소드
		double roundA(double x) {
			
			double result = (x * x * 3.14);
			
			return result;
	}
	// 2) 원의 둘레를 구하는 메소드
		double roundB(double x) {
			
//			double result = (x*2*3.14);
//			
//			return result;
			
			return x * 2 * 3.14;
			
	}
		public static void main(String[] args) {
			MethodEx05 me5 = new MethodEx05();
			
			double result = me5.roundA(12.2);
			System.out.println("원의 넓이 : "+ result);
			
			System.out.println("원의 둘레 : "+ me5.roundB(7.6));
			
		}
}
