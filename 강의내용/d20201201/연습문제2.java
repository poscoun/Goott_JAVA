package d20201201;

import java.util.Scanner;

public class 연습문제2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	System.out.println("태어난 년도(4자리숫자)를 입력해주세요 :");
	
	int year = sc.nextInt();  //int를 입력 받을 때는 nextInt 메서드를 이용한다.
	//System.out.println("년도 : "+ year);
	
	int result; 
	result = year%12;
		
	if(result == 4) {
		System.out.println ("쥐");
	    } else if( result == 5) {
	    System.out.println ("소");
	    } else if( result == 6) {
	    System.out.println ("호랑이");
	    } else if( result == 7) {
	    System.out.println ("토끼");
	    } else if( result == 8) {
	    System.out.println ("용");
	    } else if( result == 9) {
	    System.out.println ("뱀");
	    } else if( result == 10) {
	    System.out.println ("말");
	    } else if( result == 11) {
	    System.out.println ("양");
	    } else if( result == 12) {
	    System.out.println ("원숭이");
	    } else if( result == 1) {
	    System.out.println ("닭");
	    } else if( result == 2) {
	    System.out.println ("개");
	    } else if( result == 3) {
	    System.out.println ("돼지");
	   
	    } 
	    
	
	}

}
