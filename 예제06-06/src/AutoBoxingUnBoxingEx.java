// 예제 6-6 : 박싱 언박싱
// 박싱(Boxing): 기본 자료형을 참조 자료형으로 변환하는 과정
// 언박싱(Unboxing): 참조 자료형을 기본 자료형으로 변환하는 과정
// Integer 클래스는 int를 포장(wrapping)한 클래스
// 다음 코드에 대한 결과는 무엇인가?

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10; // 기본 자료형 int 변수 선언 및 초기화
		Integer intObject = n; // 박싱: int를 Integer 객체로 변환
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10; // 언박싱 후 계산: Integer를 int로 변환하여 연산
		System.out.println("m = " + m);
	}
}
