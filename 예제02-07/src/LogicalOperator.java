// 예제 2-7 : 비교 연산자와 논리 연산자 사용하기

public class LogicalOperator {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 비교 연산
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		
		// 비교 연산과 논리 연산 복합
		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 != 2) || (-1 > 0));
		System.out.println((3 != 2) ^ (-1 > 0));
	}
}
