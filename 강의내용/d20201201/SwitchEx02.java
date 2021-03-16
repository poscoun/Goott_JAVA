package d20201201;

// switch문
// 상대적으로 if문보다 빠르다
// switch문의 조건은 제한적이지마 if문보다 조건을 파악하기 쉽다
// switch문은 key값이 필요하다 (보통 정수, 문자도 가능)

public class SwitchEx02 {
	public static void main(String[] args) {
		// 월 ~ 금요일을 영문으로 출력
		// => 1부터 5까지 숫자정보가 생성되면 그 숫자에 해당하는 요일을 영문으로 출력
		
		int key = 1;
		
		String day = "";		// String : 자료형(문자열)
		
		// 최종 출력 : Today is ~~.
		
		switch(key) {
		case 1 : day = "MON"; break;	// break : 해당 값이 나올 경우 거기서 중단 
		case 2 : day = "TUE"; break;
		case 3 : day = "WEN"; break;
		case 4 : day = "THU"; break;
		case 5 : day = "FRI"; break;
		default : 
			System.out.println("Wrong number");		// default : case 값 이외의 값이 나올 경우 출력 
		}
		
		System.out.println("Today is "+ day);
		
	}

}
