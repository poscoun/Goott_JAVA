package d20201204;
	
public class ArrayEx05 {
	public static void main(String[] args) {
		//2차 배열
		
		int[][]	m = new int[3][2];
		
		System.out.println("m : "+ m);
		System.out.println("m.length : "+ m.length);
		System.out.println("m[1] : "+ m[1]);
		System.out.println("m[1][0] : "+ m[1][0]);
		System.out.println("m[1].length : "+ m[1].length);
		
		System.out.println("-----------------------------------");
		
		int[][] arr = {{2, 7}, {5, 10}, {12, 7}};
		
		System.out.println(arr[0][0]+ " , "+ arr[0][1]);
		System.out.println(arr[1][0]+ " , "+ arr[1][1]);
		System.out.println(arr[2][0]+ " , "+ arr[2][1]);
		
		System.out.println("---------------------------------");
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("arr["+i+"]["+j+"] : "+ arr[i][j]);
			}
		}
		
		
		
	}
}
