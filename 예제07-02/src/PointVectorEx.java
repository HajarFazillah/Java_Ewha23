// 예제 7-2 : Point 클래스만 다루는 Vector<Point> 컬렉션 활용
// 점(x,y)를 표현하는 Point 클래스를 만들고, Point의 객체만 다루는 백터를 작성하라.

import java.util.Vector;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return"(" + x + "," + y + ")";
	}
}

public class PointVectorEx {

	public static void main(String[] args) {
		// Point 객체를 요소로만 가지는 백터 생성
		Vector<Point> v = new Vector<Point>();
		
		// 3개의 Point 객체 삽입
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		v.remove(1); // 인덱스 1의 Point(-5,20) 객체 삭제
		
		// 백테에 있는 Point 객체 모두 검색하여 출력
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); // 백터에서 i 번째 Point 객체 얻어내기
			System.out.println(p); // p.toString()을 이요하여 객체 p 출력
		}
	}
}
