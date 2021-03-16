package d20201202;

public class WhileBasic {
	public static void main(String[] args) {
		// for 9단
		for(int i=1; i<10; i++) {
			System.out.print((9*i)+ " ");
		}
		
		System.out.println();
		System.out.println("---------------------------------");
		
		// while 9단 출력
		int j=1;		// 초기식
		while(j<=9) {		// 조건식
			System.out.println(9*j);
			j++;		// 증감식
		}
		
		System.out.println("-----------------------------");
		
		// do~while문 9단 출력
		
	    int k=1;		// 초기식
	    do {
	    	System.out.println(9*k);		
	    	k++;		// 증감식
	    }while(k<=9);		// 조건식
		
		
		
	}
}
