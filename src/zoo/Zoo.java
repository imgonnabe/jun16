package zoo;

// Dog 클래스
// 생성과 동시에 이름과 나이를 지정하는 생성자를 만든다.
// 메인 메소드에서 인스턴스를 발생시키고 출력한다.
class Dog {
	String name, addr;
	int age;
	// this();
	public Dog(String name) {
		this.name = name;
	}

	public Dog(String name, int age) {
		//this.name = name;
		this(name);// 생성자 호출
		if (age < 0) {
			age = 0;
		}
		this.age = age;
		System.out.printf("이름은 %s이고 나이는 %d살이다.\n", name, age);
	}
	
	public Dog(String addr, int age, String name) {
		this(name, age);// 무조건 첫번째 줄에, 한번 사용
		// 둘이 자리 바뀌면 안됨.
		this.addr = addr;
		// 생성자 호출
		/*
		 * 같은 클래스에 정의된 다른 생성자를 호출하는 키워드 this();
		 * 생성자의 파라미터 순서에 맞게 호출하면 자동으로 호출된다.
		 * 
		 * 단, this생성자 호출은 생성자 첫줄에만 호출가능하다.
		 * 호출은 단 한번만 가능하다.
		 */
		System.out.println("addr을 저장합니다.");
		
	}
	
	public Dog(String addr, int age, String name, boolean ch) {
		this(addr ,age ,name);
	}

	public void sleep() {
		System.out.println(this.name + "가 잠을 자요.");
	}
}

public class Zoo {
	public static void main(String[] args) {
		Dog d = new Dog("쿠키", 15);
		Dog d2 = new Dog("강아지");
		System.out.println(d.name);
		System.out.println(d2.name);
		System.out.println(d.age);
		d.sleep();
		d2.sleep();

	}

}
