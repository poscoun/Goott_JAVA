package d20201202;

public class ForEx03 {
	public static void main(String[] args) {
		// 1부터 16까지 짝수만 출력해보세요
		
		for(int i=2; i<=16; i+=2) {
			System.out.println("짝수는 : "+ i);			
		}
		
		
		System.out.println("------------------------------------");
		// 1부터 9까지 옆으로 출력
		for(int i=1; i<10; i++) {             // 이 때의 i를 지역변수라고 부른다
			System.out.print(i);
			// ln : 엔터기능(개행)이 들어있음
		}
		
		System.out.println();  // 콘솔에서 엔터키와 같은 기능
		System.out.println("-----------------------------------");
		// 1부터 10까지 합을 출력해보세요

		int sum = 0;		// 지역 변수
		for(int i=1; i<=10; i++) {
			
			sum = sum + i;
			
			//System.out.println(sum);			
		}
		
		System.out.println(sum);

		}
}
