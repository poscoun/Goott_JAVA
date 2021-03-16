package d20201203;

public class ArrayEx02 {
	public static void main(String[] args) {
		// 1. int 크기 배열 생성
		// 2. 참조대상변수는 3개
		// 3. 3개의 변수에 임의의 값을 대입한 후 출력해보세요
		
		int[] a = new int[3];	  // 1. int 크기 배열 생성
			
		a[0] = 0;		// 2. 참조대상변수는 3개
		a[1] = 1;
		a[2] = 2;
		
		// int 기본값 : 0
		// float 기본값 : 0.0f
		
		int[] b = {0, 1, 2};		// 메모리 낭비 문제 해소
		
		for(int i=0; i<a.length; i++) {			// 3. 3개의 변수에 임의의 값을 대입한 후 출력해보세요
			System.out.println(a[i]);
			System.out.println(b[i]);
		}
		
	}
	
	
}
