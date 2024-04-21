// 예제 3-13 : main()에서 명령행 인자의 합 계산
// 사용자가 명령행에 입력한 야러 개의 실수를
// main() 메소드에서 전달받아 합을 구하는 프로그램을 작성하라.

public class Calc { // 클래스 선언
	public static void main(String args[]) { // main 메소드
		double sum = 0;
		
		for(int i=0; i<args.length; i++) // 인자 개수만큼 반복
			sum += Double.parseDouble(args[i]); // 문자열을 실수(double타입)로 변환하여 협산
			
		System.out.println("합계: "+sum);
	}
}
