// 예제 6-1 : Object 클래스로 객체 속성 알아내기
// 객체 레퍼런스만으로 객체의 클래스명, 해시코드 값, 객체의 문자열을 출력해보자

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Override toString method to provide a meaningful representation of Point
    @Override
	public String toString() {
		return "Point("+x+","+y+")";
	}
}

public class ToStringEx{
	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println(p.toString());	// explicitly calling toString()
		System.out.println(p); 				// p는 p.toString()으로 자동 변환
		System.out.println(p+"입니다."); 		//p.toString()+"입니다"로 자동 변환
	}
}