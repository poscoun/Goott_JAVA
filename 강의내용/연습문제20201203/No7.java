package 연습문제20201203;
//[도전과제] 
//369게임에서 박수가 필요한 숫자에서 "짝"이라고 표현해보세요
//(단 100까지만)
public class No7 {
	public static void main(String[] args) {
		int count = 100;		// 실행 횟수
		
		for(int i = 1; i<=count; i++) {
			String str = String.valueOf(i);		// 문자열로 형변환
			System.out.println(str);
			
			for(int j=0; j<str.length(); j++) {			//형변환된 값의 길이 만큼 반복
				char chk = str.charAt(j);
				if(chk == '3' || chk == '6' || chk == '9' ) {
					System.out.println("짝");
				}
			}
			System.out.println();		// 줄바꿈
	}
	
	}

}
