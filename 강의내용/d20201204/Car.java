package d20201204;

public class Car {
	// 특성 (성질)
	String manf = "롤스로이스";			// 멤버 변수
	String engine = "16기통";
	String name = "팬텀";
	String wheel = "20인치";
	
	// 행동(행위)
	void go() {
		System.out.println("와 참 조용히 전진함...");
	}
	
	void back() {
		System.out.println("와 후방 카메라...");
	}
	void stop() {
		System.out.println("와 잘 멈춤...");
	}
	
	public static void main(String[] args) {
		Car car = new Car();		// 생성자
		
		System.out.println("car : "+ car);
		
		String carManf = car.manf;
		System.out.println(carManf);
		
		car.go();
		
		
	}

}	