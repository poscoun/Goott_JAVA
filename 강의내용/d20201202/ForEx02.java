package d20201202;
// 반복문 중첩 - 다중 반복문
public class ForEx02 {
	public static void main(String[] args) {
		// 19단 출력
		for(int dan=2; dan<=19; dan++) {
			for(int j=1; j<=19; j++) {
				System.out.println(dan + " * "+ j + " = "+ (dan*j));
			}	//내부 for문 end
		}	//외부 for문 end
		
	}

}
