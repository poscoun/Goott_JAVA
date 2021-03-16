package d20201203;

public class ArrayEx03 {
	public static void main(String[] args) {
		// int 배열 3칸짜리 a
		// int 배열 3칸짜리 b
		// int 배열 3칸짜리 c
		
		// a, b 각 배열에 임의값을 대입
		// c 배열에는 a 배열의 값과 b 배열의 값을 더한 후 대입
		
		int[] a = {10, 20, 30};
		int[] b = {40, 50, 60};
		int[] c = new int[3];
		
//		c[0] = a[0] + b[0];
//		c[1] = a[1] + b[1];
//		c[2] = a[2] + b[2];
		
		for(int i=0; i<c.length; i++) {
			c[i] = a[i] + b[i];
			System.out.println("c["+i+"] : "+ c[i]);
		}
		
		System.out.println(""+ c[0] + c[1] + c[2]);
		
		System.out.println("---------------------------------");
		// 배열을 각각 가져와서도 연산 가능
		System.out.println(a[1] + b[2]);
	}
}
