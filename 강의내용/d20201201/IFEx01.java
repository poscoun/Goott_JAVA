package d20201201;

// 조건문(분기문)
public class IFEx01 {
	public static void main(String[] args) {
		int x = 50;
		int y = 100;
		
		// if문
		if(x < y) {
			//조건이 참일 경우에 실행
			System.out.println("x가 y보다 작습니다");
		}
		
		System.out.println("---------------------------------");
		if(x != y) {
			System.out.println("x와 y가 다릅니다.");	// true일 경우 실행 
		}else {
			System.out.println("x와 y는 같습니다.");	// false일 경우 실행
		}
	}

}
