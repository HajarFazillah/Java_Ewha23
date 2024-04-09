// 예제 3-2 : -1이 입력될 때까지 입력된 수의 평균 구하기
// while문을 이용하여 정수를 여러 개 입력 받고 평균을 출력하라.
// -1이 입력되면 입력을 종료된다.

// Scanner class allows user to read input from the console easily
import java.util.Scanner;

// Class are containers for related methods and variables
// They encapsulate the behavior and properties of objects
public class WhileSample {

	// main method - defines the entry point of the program,
	// public - so it can be accessed from outside the class
	// static - this method belongs to the class itself (not to instances of)
	// void - this method doesn't return any value
	// String[] args - array of strings that can be passed as arguments when running the program from the command line
	public static void main(String[] args) {
		
		int count=0;	// count how many input 
		int sum=0;		// calculate the sum total
		
		// creates a 'Scanner' object to read input from the user
		Scanner scanner = new Scanner(System.in);
		
		// Display a message asking the user to enter integers, ending with -1
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int n = scanner.nextInt(); 	// 정수 입력 input integer (reads the first integer input by user)
		while(n != -1) {			// -1이 입력되면 while 문 벗어남 (enters a while loop that continues as long as the input is not -1)
			sum+=n; // adds the current input to the sum
			count++; // increments the count of inputs
			n = scanner.nextInt(); 	// reads the next integer input from the user
		}
		if(count==0) // if count is 0
			System.out.print("입력될 수 없습니다.");
		else { // if count is not 0
			System.out.print("정수의 개수는 "+count+"개이며 ");
			System.out.println("평균은 "+(double)sum/count+"입니다.");
		}
		scanner.close(); // closes the scanner object to release resources
	}
}
