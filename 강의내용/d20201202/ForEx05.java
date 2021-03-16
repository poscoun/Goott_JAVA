package d20201202;

import java.util.Scanner;

public class ForEx05 {
	public static void main(String[] args) {
		// 한 줄 주석
		
		/*  여러 줄 주석 
		 */
		
		/*
		       다음 식을 만족하는 모든 A와 B의 조합을 구하시오
		    
		      A  B
		   +  B  A
		    -------
		      9  9
		      		  
		 */
		for(int A=1; 1<10; A++) {
			for(int B=1; B<10; B++) {
				// 각 A와 B가 99를 만족하는 조건을 찾기
				if((10*A+B)+(10*B+A)==99)
					System.out.println("A= "+ A +" B = "+ B);
			}
		}
		
		
	}
}
