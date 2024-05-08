// 예제 6-1 : Object 클래스로 객체 속겅 알아내기
// 객체 레퍼런스만으로 객체의 클래스명 , 해시코드 값 , 객체의 문자열을 출력해보자

class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Override toString method to provide a meaningful representation of Point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class ObjectPropertyEx{
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); // class name
		System.out.println(obj.hashCode());			  // hash code value
		System.out.println(obj.toString());           // object > string converter
		System.out.println(obj);					  // show output (object)
	}
	public static void main(String[] args) {
		Point p = new Point(2,3);
		print(p);
	}
}