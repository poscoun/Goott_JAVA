package 연습문제20201203;
//한 배열에 임의의 숫자를 대입한 후 임의의 숫자만큼 *을 출력하시오
//결과)
//*
//****
//****
//***
//*
//****
//****
//**
//*
//***
//**
public class No10 {
	public static void main(String[] args) {
		int[] num = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i]; j++) {
			System.out.print("*");
		}
			System.out.println();
	}
}

}