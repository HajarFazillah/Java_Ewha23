// 예제 3-4 : 2중 중첩을 이용한 구구단
// 2중 중첩 for문을 사용하여 구구단을 출력하는 프로그램을 작성하시오.
// 한 줄에 한단씩 출력한다.

public class NestedLoop {

	public static void main(String[] args) {
		// contains a nested 'for' loop structure
		
		for(int i=1; i<10; i++) { // outer loop (iterates over the row)
			for(int j=1; j<10; j++) { // inner loop (iterates over the column)
				System.out.print(i+"*"+j+"="+i*j); // prints each multiplication
				System.out.print("\t"); // \t means tab space (ensure proper alignment)
			}
			System.out.println();
		}
	}
}
