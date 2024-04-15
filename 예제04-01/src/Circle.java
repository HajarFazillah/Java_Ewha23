
public class Circle {
	int radius;
	String name;
	
	// constructor method (생성자)
	// 객체를 초기화하는 데 사용되는 특별한 메서드
	// 이 생성자는 아무것도 수행하지 않는다
	public Circle() {} 
	
	
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// proses sini basically macam nak buat pizza atau donut
		// kena ada base dough dulu, pastu lebarkan dia besar mana (radius)
		// apa nama dia dan lain-lain
		
		Circle pizza;
		pizza = new Circle(); // creates a new Circle object > assign to pizza
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면젹은 "+area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);

	}

}