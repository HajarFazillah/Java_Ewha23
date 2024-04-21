// 예제 3-15 : 0으로 나눌 때 발생하는 ArithmeticException 예외 처리
// try-catch 블록을 이용하여 예제 3-14를 수정하여,
// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
// 다시 입력 받는 프로그램을 작성하라.

import java.util.Scanner;

public class DivideByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// loop ensures that the program repeatedly prompts the user
		// for input and handles division by zero errors until
		// a valid division operation can be performed,
		// at which point the loop is exited,
		// and the program terminates gracefully.
		
		while(true) {
			int dividend, divisor;
			System.out.print("나뉨수를 입력하시오: ");
			dividend = scanner.nextInt();
			System.out.print("나눗수를 입력하시오: ");
			divisor = scanner.nextInt();
			
			try {
				System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}
		scanner.close();
	}
}
