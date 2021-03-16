package d20201202;

// 제어문 (반복문)
// 1. for (초기식; 조건식; 증감식){
//      문장 ...
// }


public class ForBasic {
	public static void main(String[] args) {
		// 1부터 3까지를 출력
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		System.out.println("----------------------------");
		
		for(int i=1; i<=3; i++) {
			System.out.println("for 반복문 : "+ i);
		}
		
		System.out.println("------------------------------");
		//구구단 3단 출력
		for(int j=1; j<=9; j++) {
			System.out.println(" 3 * " + j + " = " + (3 * j));
		}
		
		System.out.println("------------------------------");
		
		// 구구단 5단 출력
		int dan = 5;
		
		for(int k=1; k<10; k++) {
			System.out.println(" dan * "+ k + " = "+ (dan * k));
		}
	
		
		
		
	}

}
