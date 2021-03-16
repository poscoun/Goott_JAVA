package 연습문제20201204;

public class FormatData {
	
	void print(int a) {
		System.out.println(a);

	}
	
	void print(int[] x) {
		System.out.print("[");
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("]");
	}
	
	void print(float f) {
		System.out.println(f);
	}
}