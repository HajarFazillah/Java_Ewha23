// 예제 3-5 : continue 문을 이용하여 양수 합 구하기
// 5개의 정수를 입력 받고 그 중 양수들만 합하여 출력하는 프로그램을 작성하라.

import java.util.Scanner; // allow user to read input from the console easily

public class ContinueExample {

	// public : method can be accessed from outside the class
	// static : method belongs to the class itself (not the instance)
	// void : method doesn't return any value
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// creates a 'Scanner' object named 'scanner' to read input from the console
		
		System.out.println("정수를 5개 입력하세요."); // print a message asking the user to input 5 integers
		int sum=0; // initialize value to store the sum of the integers
		
		// enters a for loop that iterates 5 times
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt();		// input integer from keyboard
			
			// if the input is less than or equal to 0 (not positive)
			// it skips the iteration using 'continue'
			if(n<=0)
				continue;	// 양수가 아닌 경우 다음 반복으로 진행
			else
				sum+=n;		// 양수인 경우 덧셈
				// if n is positive (adds n to the sum)
		}
		System.out.println("양수의 합은 "+sum); // print the results
		scanner.close(); // closes the scanner object to release resources
	}
}
