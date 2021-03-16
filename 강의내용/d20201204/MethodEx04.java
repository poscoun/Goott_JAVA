package d20201204;

/*  
 * 출력
 *
 * 자바
 * 자바 A
 * 자바 A 1000
 * 자바 A 1000 10.5
 * 자바 A 1000 10.5 true
 */

// method overloading (다중 정의)
// : 메소드 이름은 하나이지만 다양한 상황에서 동작하게 하는 기능
// : 메소드 이름은 같게 하고 매개변수 타입, 이름, 순서, 개수를 다르게 하면 됨
// : 만드는 사람(개발자)는 불편하나 사용자는 편해짐


public class MethodEx04 {
	
	void print(String str, char ch, int x, double d, boolean bol) {
		System.out.println(str);
		System.out.println(str + " "+ ch);
		System.out.println(str + " "+ ch + " "+ x);
		System.out.println(str + " "+ ch + " "+ x + " "+ d);
		System.out.println(str + " "+ ch + " "+ x + " "+ d + " "+ bol);
	}
	public static void main(String[] args) {
		MethodEx04 me4 = new MethodEx04();
		me4.print("자바", 'A', 1000, 10.5, true);
		
		
		
}
}