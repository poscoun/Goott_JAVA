package d20201201;

import java.io.IOException;

// 사용자로부터 문자 한글자를 입력받은 후
// 소문자는 대문자로, 대문자는 소문자로 변경해보세요

// 힌트 : 소문자 a = 97, .... 소문자 z : 122
//		 대문자 A = 65, .... 소문자 Z : 90

public class IfEx04 {
	public static void main(String[] args) throws IOException {
		System.out.println("문자 입력 : ");
		
		int value = System.in.read();
				
		System.out.println("처음 사용자가 입력한 값 :"+ value);
		
		if(value >= 65 && value <= 90) {
			value += 32;
		}else if(value >= 97 && value <= 122) {
			value -= 32;
		}
		
		System.out.println("변환된 값 : "+ value);
		
		char ch = (char)value;
		
		System.out.println("최종 변환된 문자 : "+ ch);
	}

}
