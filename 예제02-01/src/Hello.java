// 예제02-01 자바프로그램의 기본 구조

// 클래스
public class Hello {
	
	// method
	public static int sum(int m, int n) {
		return m+n;
	}

	// main method
	public static void main(String[] args) {
		int i=20;
		int s;
		char a;
		
		s = sum(i,10);
		a='?';
		
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}

}
