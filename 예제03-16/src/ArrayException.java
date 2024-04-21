// 예제 3-16 : 범위를 벗어난 배열의 접근
// 배열의 인덱스가 범위를 벗어날 때 발생하는
// ArrayIndexOutOfBoundsException을 처리하는 프로그램을 작성하시오.

public class ArrayException {
	public static void main(String[] args) {
		// create an array of integers with a size of 5
		int[] intArray = new int[5];
		
		// assign a value to the first element of the array
		intArray[0] = 0;
		
		try {
			// iterate through the array
			for(int i=0; i<5; i++) {
				// access elements of the array and perform calculations
				// note: This loop will intentionally cause an ArrayIndexOutOfBoundsException
				intArray[i+1]=i+1+intArray[i];
				
				// print the current element of the array
				System.out.println("intArray["+i+"]"+"="+intArray[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			// print a message indicating that the array index is out of bounds
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}
