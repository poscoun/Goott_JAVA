package d20201202;

public class ForEx04 {
	public static void main(String[] args) {
		// 1. 구구단 모두 출력
		for(int dan=1; dan<=9; dan++) {
			for(int x=1; x<=9; x++) {
				System.out.println(dan + " * "+ x + " = "+ (dan*x));
			}
		}
		
		// 2. 구구단 짝수단만 출력
		
		for(int dan=2; dan<=9; dan+=2) {
			for(int x=1; x<=9; x++) {
				System.out.println(dan + " * "+ x + " = "+ (dan*x));
			}
		}

		// 3. 2단은 2*2까지, 4단은 4*4까지, 6단은 6*6까지, 8단은 8*8까지 출력		
		for(int dan=2; dan<=9; dan+=2) {
			for(int x=1; x<=dan; x++) {
				System.out.println(dan + " * "+ x + " = "+ (dan*x));
			}
		}
		for(int i=2; i<=9; i++) {                                       // 위의 코드와 똑같은 기능을 수행
			for(int j=1; j<=9; j++) {
				if(i%2==0 && i>=j) {
					System.out.println(i + " * "+ j + " = "+ (i*j));
				}
			}
		}

	}

}
