// 예제 5-3 : super()를 활용한 ColorPoint 작성
// super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스
// Point의 생성자를 호출하는 예를 보인다.

// Point 클래스: 점을 나타내는 클래스
class Point {
    // x, y 좌표를 나타내는 private 변수
    private int x, y;

    // 기본 생성자: x와 y를 0으로 초기화
    public Point() {
        this.x = this.y = 0;
    }

    // x와 y를 매개변수로 받아 초기화하는 생성자
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 현재 좌표를 출력하는 메서드
    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

// ColorPoint 클래스: 색깔을 가진 점을 나타내는 클래스
class ColorPoint extends Point {
    // 색상을 나타내는 private 변수
    private String color;

    // x, y 좌표와 색상을 초기화하는 생성자
    public ColorPoint(int x, int y, String color) {
        // 슈퍼 클래스인 Point 클래스의 생성자 호출하여 x, y 초기화
        super(x, y);
        // ColorPoint의 색상 초기화
        this.color = color;
    }

    // 색상과 좌표를 출력하는 메서드
    public void showColorPoint() {
        // 색상 출력
        System.out.print(color);
        // Point 클래스의 showPoint() 메서드 호출하여 좌표 출력
        showPoint();
    }
}

// 메인 클래스
public class SuperEx {
    public static void main(String[] args) {
        // ColorPoint 객체 생성: (5,6) 좌표에 파란색 점
        ColorPoint cp = new ColorPoint(5, 6, "blue");
        // 색상과 좌표 출력
        cp.showColorPoint();
    }
}
