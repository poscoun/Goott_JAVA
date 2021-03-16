package 연습문제20201203;
//사용자로부터 입력받은 값이 3의 배수인지 아닌지 출력
import java.util.Scanner;

public class No1 {
	public static void main(String[] args) {
		System.out.println(" 입력 : ");

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		if((a%3)==0) {
			System.out.println(a +"는 3의배수입니다.");
		}
		
		else {
			System.out.println(a +"은 3의배수가 아닙니다");
		}
	}

}
