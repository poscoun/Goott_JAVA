package d20201204;

//call by value
public class SungJuk2 {

	void hap(int kor, int eng) {	// 인수(가인수, parameter)
	
			int sum = kor + eng;
		
		System.out.println("hap : "+ sum);
	}
	
	public static void main(String[] args) {
		SungJuk2 sj2 = new SungJuk2();
		sj2.hap(100, 100);		// 인수(실인수, parameter, 전달값), 쌍방간에 데이터타입과 개수가 일치해야함
	}
}
