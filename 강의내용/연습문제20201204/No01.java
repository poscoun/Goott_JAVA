package 연습문제20201204;

import java.util.Scanner;

/*1. 야구게임 구현 [도전과제]
1) 컴퓨터가 3자리 정수 - 랜덤하게 생성
2) 각각 자리수가 서로 일치하지 않는지 검사
3) 사용자로부터 입력값 받기 - 3자리 정수
4) 사용자가 입력한 값과 컴퓨터가 생성한 값을 비교
5) 판정결과를 출력 : ~~ strike, ~~ ball
6) 3S가 되면 경기를 종료, 그렇지 않으면 반복
*/
public class No01 {
	public static void main(String[] args) {
//	1) 컴퓨터가 3자리 정수 - 랜덤하게 생성	
		int[] com = new int[3];
		
//	2) 각각 자리수가 서로 일치하지 않는지 검사	
	
	boolean flag = true;	
		
	while(flag) {	
		com[0] = (int)(Math.random()*10);
		com[1] = (int)(Math.random()*10);
		com[2] = (int)(Math.random()*10);
		
		if(com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) {
			flag = false;
		}
		
	}// while(flag) end
	
    System.out.println("" + com[0]+" "+com[1]+" "+com[2]);
		boolean flag2 = true;
		
		int count = 0;
	
		//	3) 사용자로부터 입력값 받기 - 3자리 정수	
		while(flag2) {
			count++;
		System.out.println("3자리 정수 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		//System.out.println("사용자가 입력한 값 : "+ value);
		
		// 152
		// [1][5][2]
		
		int[] userInput = new int[3];
		userInput[0] = value/100;
		userInput[1] = value%100/10;
		userInput[2] = value%10;

//	4) 사용자가 입력한 값과 컴퓨터가 생성한 값을 비교
		int strike = 0;
		int ball = 0;
		
		// 자리값과 숫자가 모두 일치하는지 비교
		// 자리값과 숫자가 모두 일치하면 1S 증가
		// 다른 자리에서 숫자가 일치하면 1B 증가
		
		for(int i=0; i<3; i++) {
			if(com[i] == userInput[i]) {
				strike ++;
			}else {
				for(int j=0; j<3; j++) {
					if(com[j] == userInput[i]) {
						ball ++;
					}
				}
			}
		}
//	5) 판정결과를 출력 : ~~ strike, ~~ ball
		System.out.println(strike + " strike , "+ ball + " ball ");
		
//	6) 3S가 되면 경기를 종료, 그렇지 않으면 반복	
		if(strike==3) {
			flag2 = false;
		}
	}// while(flag2) end
	
	System.out.println("당신은 " + count + " 번째에 정답을 맞췄습니다");
}// main() end

}// class end