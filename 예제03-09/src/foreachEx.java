// 예제 3-9 : for-each문 활용
// for-each문을 활용하는 사례를 보자
// demonstrates the usage of the for-each loop (enhanced for loop) with different types of data structures

public class foreachEx {
	// declares an enum named Week, representing days of the week
	// enum : enumeration - special data type used to define a collection of constants.
	// provides a way to represent a fixed set of predefined values
	enum Week { 월, 화, 수, 목, 금, 토, 일 }

	// public : method can be accessed from outside the class
	// static : method belongs to the class itself (not the instance)
    // void : method does not return any value 
	public static void main(String[] args) {
		
		// declares and initializes an array of integers and an array of strings
		int [] n = {1,2,3,4,5};
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		
		int sum=0; // initialize value to store the sum of integers
		
		// 아래 for-each에서 k는 n[0],n[1],..,n[4]로 반복
		// uses a for-each loop to iterate over elements of the array 'n'
		for(int k:n) {
			System.out.print(k+" "); // 반복되는 k 값 출력 (print element)
			sum += k; // calculates the sum of integers
		}
		System.out.println("합은 "+sum);
		
		// 아래 for-each에서 s는 names[0], names[1],.., names[5]로 반복
		for(String s : names)
			System.out.print(s+" ");
		System.out.println();
		
		// 아래 for-each에서 day는 월,화,수,목,금,토,일 값으로 반복
		for(Week day : Week.values())
			System.out.print(day+"요일 ");
		System.out.println();
	}
}
