package car;

public class Car {
	// 필드 = 인스턴스 변수, 클래스 변수
	static String company = "현대자동차";// 클래스 변수 = 클래스명.변수명
	String model;// 인스턴스 변수 = 인스턴스 변수명.변수명
	String color;
	int maxSpeed;

	Car() {
		System.out.println("자동차를 만듭니다.");
	}

	Car(String model) {
		this.model = model;
	}

	Car(String model, String color) {
		this();
		this.color = color;
	}

	Car(String model, String color, int maxSpeed) {
		this(model, color);
		this.maxSpeed = maxSpeed;
	}

	public static void main(String[] args) {// Car.main()
		// static붙은 변수 호출하기
		// 클래스명.변수명;
		Car.company = "현대자동차입니다.";
		
		Car car1 = new Car();
		System.out.println(Car.company);
		System.out.println(car1.maxSpeed);
		System.out.println("--------------------");
		
		Car.company = "기아입니다.";

		Car car2 = new Car("자가용");
		System.out.println(Car.company);
		System.out.println(car2.model);
		System.out.println("--------------------");

		Car car3 = new Car("자가용", "빨강");
		System.out.println(Car.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println("---------------------");

		Car car4 = new Car("택시", "검정", 200);
		System.out.println(Car.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
	}

}
