package d20201204;

// call by name
public class SungJuk {

	void hap() {
		int kor = 90;
		int eng = 100;
		
		int sum = kor + eng;
		
		System.out.println("hap : "+ sum);
	}	// hap end
	
	public static void main(String[] args) {
		SungJuk sj = new SungJuk();
		sj.hap();
	}
}
