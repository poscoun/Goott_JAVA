package d20201201;

public class SwitchEx01 {
	public static void main(String[] args) {
		
		int num = 5;
		
		switch(num) {
		case 1 :
			System.out.println("switch case 1 : wow java");
		case 2 : 
			System.out.println("switch case 2 : happy java");
		case 3 :
			System.out.println("switch case 3 : fantasy java");
		default :
			System.out.println("switch default : simple java");		// case 값 이외의 값이 나올 경우 출력
		}
	}

}
