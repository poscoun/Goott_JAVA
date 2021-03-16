package 연습문제;

public class HwNo12d20201202 {
	public static void main(String[] args) {
// While문 
// 1) 1000 이하의 정수 중에서 2의 배수이면서 7의 배수인 숫자 출력
// 2) 그 숫자들의 합을 구해보세요

		int num = 1;
		int sum = 0;
		
		while(num<=1000) { 			
			if(num%2==0 && num%7==0) {	//2의 배수이면서 7의 배수
				System.out.println(num);
				sum=sum+num;	// 숫자들의 합	
			}
			num++;
		}		
		System.out.println("합 : "+ sum);
	}

}
	