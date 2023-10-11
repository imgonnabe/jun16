package human;

class Cat {
	String name;
	int age;

	// 자바가 보고 있다가 기본 생성자를 주입한다.
	public Cat(String name) {
		/*
		 * this.변수 
		 * this();// 내 생성자() 
		 * super.변수// 부모의 변수 
		 * super();// 부모의 생성자()
		 */
		this.name = name;// this = 내 객체 / 참조 변수 필드를 사용
		System.out.println(name + "(이)가 태어났습니다.");
		System.out.println("Mew~");
	}

	public Cat(String name, int age) {
		this.name = name;
		if (age < 0) {
			age = 0;
		}
		this.age = age;
	}

	void print() {
		System.out.println(this.name);
	}
}

class Mini {
	public Mini(int age) {
		System.out.println("객체가 생성됩니다. 초기는 " + age + "살입니다.");
	}
}

public class Car {
	String name;

	// 필드
	// 생성자: 클래스명과 동일, 대문자로 시작, 리턴 타입x
	public Car() {// 기본 생성자: 없는 경우 자바가 만들어서 넣어준다.
		System.out.println("인스턴스를 만듭니다.");
	}

	// 메소드
	public void car() {
		System.out.println("car메소드 입니다.");

	}

	public static void main(String[] args) {

		Cat c = new Cat("고양이", -1);
		c.name = "고양";
		System.out.println(c.name);
		System.out.println(c.age);
		c.print();
		// System.out.println(this.name);// Cannot use this in a static context

		Mini m = new Mini(1);

		Human h = new Human("홍길동", 1);// 기본생성자로 만들어진 인스턴스 = 기본 객체
		h.age = 0;
		Human h2 = new Human(0);
	}

}
