package d20201201;

// 6. 논리 연산자 : &&, ||
public class OperEx06 {
	public static void main(String[] args) {
		boolean bl1 = true;
		boolean bl2 = false;
		
		// bl1과 bl2를 and 연산
		System.out.println("bl1 && bl2 : "+ (bl1 && bl2));
		
		// bl1과 bl2를 or 연산
		System.out.println("bl1 || bl2 : "+ (bl1 || bl2));
		
		// 비트 연산자가 논리 연산도 가능하다. 그러나 반대로는 불가능함
		System.out.println("bl1 & bl2 : "+ (bl1 & bl2));

	}

}
