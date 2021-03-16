package d20201207;

public class MethodEx06 {

	/*	
	 *	소수 출력하기
	 *
	 * 	- 소수 : 자기 자신과 1을 제외하고는 인수가 없는 (어떤 수로도 나눠지지 않는) 수이다.
	 *
	 *	1) main()에서 1이상 100이하의 값 중 소수를 전부 출력
	 *	2) isPrimeNumber()를 통해 전달된 값이 소수인지 아닌지를 판단하여 true, false로 반환되는
	 *	      형태로 체크
	 *
	 *
	 */
	public static void main(String[] args) {
			
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
			
		
	}//main() end
	
	// isPrimeNumber() : 소수 여부를 판단 (true/false)
	boolean isPrimeNumber(int x) {
		for(int i=2; i<x; i++) {
			if(x%i == 0) {
				return false;
			}
		}
		return true;
	}
}
