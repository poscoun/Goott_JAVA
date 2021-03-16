package 연습문제20201203;

import java.util.Arrays;

//아래의 데이터를 정렬시키는 코드를 작성하시오.
//int[] data  = { 100,20,5,2,3,34,65,23,66,200};

public class No0809 {
	public static void main(String[] args) {
		 int[] data  = { 100,20,5,2,3,34,65,23,66,200};
		 
		 int temp = 0;
		 
		 for(int i=0; i<data.length; i++) {			//선택정렬 알고리즘
			 for(int j=i+1; j<data.length; j++) {
				 if(data[i] > data[j]) {
					 temp = data[i];
					 data[i] = data[j];
					 data[j] = temp;
				 }
			 }
			 System.out.println(data[i] + " ");
		 }
		 System.out.println("-------------------------------");
	
		 for(int index = 1 ; index < data.length ; index++){	//삽입정렬 알고리즘
			 
		      int temp1 = data[index];
		      int aux = index - 1;

		      while( (aux >= 0) && ( data[aux] > temp1 ) ) {

		         data[aux+1] = data[aux];
		         aux--;
		
				 
				 }
				 data[aux + 1] = temp1;
				 System.out.println(temp1 + "");
		 	}

	 }
}
	