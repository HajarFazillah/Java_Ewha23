// 예제 3-3 :  a-z까지 출력
// do-while 문을 이용하여 'a'부터 'z'까지 출력하는 프로그램을 작성하시오.
// this code demonstrates the usage of a 'do-while' loop to print characters
// and manipulate their values until a condition is met

public class DoWhileSample {

	public static void main(String[] args) {
		
		// initializes a variable 'c' with the value 'a'
		// used to print characters
		char c='a';
		
		// enters a 'do-while' loop
		do {
			System.out.print(c); // inside the loop, it prints the value 'a'
			c=(char)(c+1);
			// increments the value of 'c' by 1
			// incremented using ASCII value manipulation 
		} while(c<='z');
		// loop continues until the value of 'c' is less than or equal to 'z'
	}
}
