package d20201207;

/*
 * 	실행화면
 *-------------------
 * 1.자바
 * 2.A
 * 3.10000
 * 4.3.14
 * 5.true
*/
public class MethodReturn {
	void printStr(String str) {
		System.out.println("오늘은 월요일");
		System.out.println(str);
	}
	String returnStr() {		// returnStr 임의의 변수명
		return "자바";		
	}
	
	char returnChar() {
		return 'A';
	}
	int returnInt() {
		return 10000;
	}
	double returnDouble() {
		return 3.14;
	}
	boolean returnBol() {
		return true;
	}
	public static void main(String[] args) {
		MethodReturn mr = new MethodReturn();
		//mr00.printStr("내일은 화요일");
		
		String str = mr.returnStr();
		System.out.println("1."+ str);
		char ch = mr.returnChar();
		System.out.println("2."+ ch);
		int i = mr.returnInt();
		System.out.println("3."+ i);
		double db = mr.returnDouble();
		System.out.println("4."+ db);
		boolean bol = mr.returnBol();
		System.out.println("5."+ bol);
	}
	
		
}
