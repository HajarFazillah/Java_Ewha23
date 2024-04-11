// 예제 3-6 : break 문을 이용하여 while 문 벗어나기
// "exit" 입력되면 while 문을 벗어나도록 break 문을 활용하는 프로그램을 작성하라.

import java.util.Scanner; // allows user to read input from console easily

public class BreakExample {
	// public : method can be accessed from outside the class
	// static : method belongs to the class itself (not the instances)
	// void : method does not return any value
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// creates a scanner object to read input from the user
		
		// displays a message instructing the user to input "exit"
		// to terminate the program (only "exit")
		System.out.println("exit을 입력하면 종료됩니다.");
		
		// enters an infinite 'while' loop -> while(true)
		while(true) {
			System.out.println(">>"); // prompts the user ">>"
			
			String text = scanner.nextLine(); // and = reads the input text
			
			if(text.equals("exit"))		// check the text input by user
				break;		
			// if the input correctly, it breaks out of the loop using 'break' statement
		}
		System.out.println("종료됩니다..."); // prints message after loop exits
		scanner.close(); // closes the scanner object to release resources
	}
}