// 클래스 선언 (원의 반지름과 이름을 가지고 있음)
public class Circle {
	// 반지름과 이름 저장, 변수 선언
	int radius;
	String name;
	
	// 매개변수 없는 생성자 정의, 반지름 1, 이름 빈 문자열로 초기화함
	public Circle() {
		radius = 1;
		name = ""; // radius의 초기값은 1
	}
	
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
	
	// 원의 넓이를 계산해서 반환하는 메소드
	// 공식 pie x 반지름 x 반지름
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		
		// 새 instance 생성, 반지름, 이름 초기화함
		Circle pizza = new Circle(10, "자바피자");
		
		// pizza 객체의 넓이를 계산하고 출력함
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+ area);
		
		// 새 instance 생성, 반지름 이름 초기화함 (다른 형태로)
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		
		// donut 객체의 넓이를 계산하고 출력함
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);

	}

}
