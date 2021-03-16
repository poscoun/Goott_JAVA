package d20201203;
// break : 가장 가까운 반복문을 탈출
// break 라벨명 : 라벨이 붙어있는 반복문을 탈출
// continue : 이번만 생략
// continue 라벨명 : 라벨이 붙어있는 반복문에서 조건이 true이면 이번만 생략
public class BreakEx {
	public static void main(String[] args) {
		
		outer :
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i==j) {		
					//break;		// 외부 for문과 내부 for문이 같으면 정지			
					//continue;
					continue outer;
				}
				
				System.out.println("i : "+ i + ", j : "+ j);
			}// 내부 for end
		}// 외부 for end
	}
}
