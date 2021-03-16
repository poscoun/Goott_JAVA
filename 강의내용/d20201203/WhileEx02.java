package d20201203;

public class WhileEx02 {
	public static void main(String[] args) {
//		 1부터 100까지의 합 (while)
		int sum = 0;	// 초기값을 0으로 해야 num 값들만 더해지기 때문에 선언
		int num = 1;
		
		while(num <=100) {
			//sum = sum + num;
			sum += num;
			num ++;
		}
		System.out.println(sum);	// 결과값만 얻기 위해 밖에서 출력
		
		System.out.println("----------------------------------");
		
//		 1부터 100까지 출력 (while)
		int num1 = 1;
		while(num1 <= 100) {
			System.out.println(num1++);
		}
		
		// 100부터 1까지 출력 (do ~ while)
		int num2 = 100;
		do {
			System.out.println(num2--);
		}while(num2 >= 1);
		
	}
}
