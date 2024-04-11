// 예제 3-7: 배열에 입력받은 수 중 제일 큰수 찾기
// 양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라.
// prompts the user to input 5 positive numbers, stores them in an array,
// and then finds and prints the largest number among them.

import java.util.Scanner; // allows user to read input from console easily

public class ArrayAccess {

	// public : method can be accessed from outside the class
	// static : method belongs to the class itself (not the instance)
	// void : method does not return any value
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// allows user to read input 
		
		int intArray[] = new int[5]; 			// 배열 생성 (creates an array to store 5 integers)
		int max=0; 								// 현재 가장 큰 수 (variable to store the max number, initialized to 0)
		
		System.out.println("양수 5개를 입력하세요.");	
		
		// enters a for loop that iterates 5 times
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt(); 	// 입력받은 정수를 배열에 저장
			
			// checks if the current number is greater than the current maximum
			if(intArray[i] >max) 				// intArray[i]가 현재 가장 큰 수보다 크면
				max = intArray[i]; 				// intArray[i]를 max로 변경 (updates new max)
		}
		System.out.print("가장 큰 수는 "+max+"입니다."); // print the max number found among the input numbers
		
		scanner.close(); // scanner object close to release resources
	}
}
