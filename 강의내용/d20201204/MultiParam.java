package d20201204;

import java.util.Scanner;

public class MultiParam {
	// login
	void loginDemo(String id, int pw) {
		// id가 java이고 pw가 1234이면 로그인 성공 메시지 출력
		
		if(id.equals("java") && pw == 1234) {		// 문자열 비교시 equals 함수 사용
			System.out.println("로그인 성공했습니다.");
		}else {
			System.out.println("로그인 실패했습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		//아주 간단한 로그인
		
		String id = "";
		int pw = 0;
		
		System.out.println("로그인 하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		id = sc.nextLine();
		System.out.println("패스워드를 입력하세요 : ");
		pw = sc.nextInt();
		
		System.out.println(""+ id + ""+ pw);
		
		// 로그인 여부 확인
		MultiParam mp = new MultiParam();
		mp.loginDemo(id, pw);
	}
	
}

