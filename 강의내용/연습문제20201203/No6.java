package 연습문제20201203;

import java.util.Scanner;

//화페교환기
//사용자로부터 숫자를 입력받아  화폐 몇장으로 교환가능한지 메세지를 출력하시는 코드를 작성하시오
//ex) 78500
//오만원권 1장
//만원권  2장
//오천원권 1장
//천원권 3장
//오백원권 1장
//백원권 0장
//오십원권 0장
public class No6 {
	public static void main(String[] args) {
		int t[]	= {50000, 10000, 5000, 1000, 500, 100, 50};
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 돈을 입력하세요  : ");
		int won = sc.nextInt();
		
		for(int i=0; i<t.length; i++) {
			int s = won/t[i];		// 각화폐의 개수 할당	
			won %= t[i];				//상위 화폐의 개수에 해당한 돈을뺀 남은 금액
			System.out.println(t[i]+ "원"+ s + "개");
		}
	}

}
