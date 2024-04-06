// "exit" 입력되면 while 문을 벗어나도록 break 문을 활용하는 프로그램을 작성하라.

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료됩니다.");
		
		while(true) {
			System.out.println(">>");
			String text = scanner.nextLine();
			
			if(text.equals("exit"))		// check the text input by user
				break;
		}
		System.out.println("종료됩니다...");
		scanner.close();
	}
}