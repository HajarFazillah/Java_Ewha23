// 사용자로부터 콘솔을 통해 입력을 받을 수 있게 해준다
import java.util.Scanner;

// 클래스 선언
public class Rectangle {
	int width;
	int height;
	
// 메소드 정의 getArea (사각형의 넓이를 계산하고 반환한다)
// 특정 작업을 수행하는 코드블록
public int getArea() {
	return width*height;
}

	// main 메소드 정의 (프로그램의 진입점)- 여기부터 실행된다. 
	public static void main(String[] args) {
		
		// 새 instance 생성 (새로 만든 사각형 객체를 참조할 것이다)
		Rectangle rect = new Rectangle();
		// 사용자로부터 입력을 받기 위해 객체를 생성함
		// 콘솔 system.in을 통해 사용자로부터 입력을 받는다
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		
		// scanner 객체를 사용해서, 사용자로부터 2개의 정수를 읽어와서
		// 객체 변수에 할당한다 (값, 사각형의 크기를 나타냄)
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 "+rect.getArea());
		// 객체를 닫아서 사용이 끝나도록 함, 연결된 자원들을 해제, 입력 작업 끝냄.
		scanner.close();
	}

}
