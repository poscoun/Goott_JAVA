package d20201201;

// 5. 비트 연산자 : &, |
public class OperEx05 {		
	public static void main(String[] args) {
		byte a = 10;	// 0000 1010	
		byte b = 22;	// 0001 0110
		
		
		// a & b : 각 자리수 비트 끼리 and 연산	             
		System.out.println("a & b : "+ (a & b));	// 0000 0010
		
		// a | b : 각 자리수 비트끼리 or 연산
		System.out.println("a | b : "+ (a | b));	// 0001 1110
	}

}
