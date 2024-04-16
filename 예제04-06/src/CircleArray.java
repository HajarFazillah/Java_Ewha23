// 예제 4-6 : Circle 객체 배열 만들기
// 반지름이 0~4인 Circle 객체 5개를 가지는 배열을 생성하고,
// 배열에 있는 모든 Circle 객체의 면적을 출력하라.

class Circle { // 클래스 선언
	int radius; // 필드
	// 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	// 메소드
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	// 프로그램의 진입점 - 여기부터 실행 시작
	public static void main(String[] args) {
		// Circle [] indicates that c will hold an array of objects of type 'Circle'
		// c - chosen name of the array variable
		Circle [] c;
		c = new Circle[5]; // creates an array of 5 'Circle'
		
		for(int i=0; i<c.length; i++)
			c[i] = new Circle(i);
		for(int i=0; i<c.length; i++)
			System.out.print((int)(c[i].getArea())+" ");
	}

}
