package d20201201;

// 8. 대입 연산자 : =, +=, -=, *=, /=, %=
public class OperEx08 {
	public static void main(String[] args) {
		int a = 10;
		
		//a = a + 2;		
		a += 2;
		
		System.out.println(" a : "+ a);		// a = 12
		System.out.println(" a += 2 : "+ (a += 2));		// a = 14	
		System.out.println(" a -= 2 : "+ (a -= 2));		// a = 12
		System.out.println(" a *= 2 : "+ (a *= 2));		// a = 24
		System.out.println(" a /= 2 : "+ (a /= 2));		// a = 12
		System.out.println(" a %= 2 : "+ (a %= 2)); 	// a = 0
	}

}
