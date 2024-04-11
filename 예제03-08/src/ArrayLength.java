// 예제 3-8 : 배열 원소의 평균 구하기
// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 평균을 구하는 프로그램을 작성하라.
// prompt the user input 5 integers, stores them in an array, calculate the sum of the numbers
// then calculate and prints the average of those numbers.

import java.util.Scanner; // allow user to read input from console easily

public class ArrayLength {

	// public : method can be accessed from outside the class
	// static : method belongs to the class itself (not the instances)
	// void : method does not return any value
	public static void main(String[] args) {
		
		// declares and creates an array if size 5 to store the input integers
		int intArray[] = new int[5]; // 배열의 선언과 생성
		int sum = 0; // variable to store the sum of the integers
		
		// creates a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(intArray.length+"개의 정수를 입력하세요>>");
		
		// loop to read the integers from the user and store them in the array
		for(int i=0; i<intArray.length; i++)
			intArray[i]=scanner.nextInt(); // 키보드에서 입력받은 정수 저장
			// reads input from the keyboard and stores it in the array
		
		// loop to calculate the sum of integers stored in the array
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i]; // 배열에 저장된 정수 값을 더하기
			// adds each integer from the array to the sum
		
		// calculates and prints the average of the integers
		System.out.print("평균은 "+(double)sum/intArray.length);
		scanner.close(); // closes scanner to release resources
		
		// "release resources" - resources leaks can accumulate and cause problems such as memory leaks or resource exhaustion

	}

}