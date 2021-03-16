package d20201203;

public class ArrayEx04 {
	public static void main(String[] args) {
		// char 배열 10칸짜리 변수 ch
		// 이 변수에 JavaWorld 라는 글자를 대입한 후 콘솔에 출력해보세요
		
		// char[] ch = new char[10];
		
		// ch[0] = 'J';
		// ch[1] = 'a';
		// ch[2] = 'v';
		
		
		char[] ch = {'J', 'a', 'v', 'a', 'W', 'o', 'r', 'l', 'd', };		// 문자형 자료형
		
		// 콘솔에 출력
		for(int i=0; i<ch.length; i++) {
				System.out.print(ch[i]);
		}
		
		System.out.println();
		System.out.println("-----------------------------------------");
		
		String str = "JavaWorld";		// 문자열 자료형
		System.out.println(str);
 } 

}