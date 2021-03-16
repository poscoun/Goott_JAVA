package d20201130;
// 3. 문자형 : char
// char는 ' ' 안에 한글자만 가능
public class VarEx03 {                                         // 클래스 시작
	public static void main(String[] args) {                   // 메인 시작
		// 콘솔에 JAVA 라는 글자를 출력
		
		char ch1 = 'J';                                        // char 자료형 ch1 변수에 'J' 대입
		char ch2 = 'A';                                        // char 자료형 ch2 변수에 'A' 대입
		char ch3 = 'V';
		char ch4 = 'A';
		
		System.out.println(ch1+ch2+ch3+ch4);                   // ch1+ch2+ch3+ch4 출력
		System.out.println(""+ch1+ch2+ch3+ch4);                // ""+ch1+ch2+ch3+ch4 , 출력식이 ""로 시작하면 전체가 문자취급, 이때의 +는 연결 연산자

		
		String str = "JAVA";                                   // String 자료형 str 변수에  "JAVA" 대입
		System.out.println("str : " + str); 				   // "str : " + str 출력
		
		// 자바는 unicode도 지원 - 한글 사용 가능 (단, 권장 하지는 않는다)
		String 한글 = "한글 잘 되나?";                               // String 자료형 str 변수에  "한글 잘 되나?" 대입
		System.out.println("한글 : "+ 한글);                      // "한글 : "+ 한글 출력
		
		System.out.println("---------------------------------");  // "---------------------------------" 출력
		 
		// 각각 출력해보세요
		// ctrl + alt 아래방향키 : 선택된 행 복사   
		char ch5 = 'A';                     // 문자형                                    // char 자료형 ch5에 'A' 대입
 		char ch6 = 65;                      // ASCII 코드값                      // char 자료형 ch6에  65 대입
		char ch7 = '\u0063';                // unicode 코드값                  // char 자료형 ch7에  '\u0063' 대입
		char ch8 = 99;                      // ASCII 코드값                       // char 자료형 ch8에 99 대입
		 
		System.out.println("ch5 : "+ ch5);                         // "ch5 : "+ ch5 출력
		System.out.println("ch6 : "+ ch6);                         // "ch6 : "+ ch6 출력
		System.out.println("ch7 : "+ ch7);                         // "ch7 : "+ ch7 출력
		System.out.println("ch8 : "+ ch8);                         // "ch8 : "+ ch8 출력
		
		System.out.println("----------------------------------");  // "----------------------------------" 출력
		
		// 특별한 의미를 갖는 문자 기능 수행 : \(escape 문자)
		System.out.println("\\오늘은 월요일입니다.　\n내일은 화요일입니다.");    // "\\오늘은 월요일입니다.　\n내일은 화요일입니다." 출력
		
		System.out.println("내일은 \n화요일입니다.");                    // "내일은 \n화요일입니다." 출력
		
		// ex) \n : 개행(엔터 효과), \t : tab만큼 공백, \b : backspace, \\ : \

	}                                                             // 메인 끝
}                                                                 // 클래스 끝
