// 예제 3-1 : for문을 이용하여 1부터 10까지 합 출력
// for문을 이용하여 1부터 10까지 덧셈을 표시하고 합을 구하시오.

public class ForSample {

	public static void main(String[] args) {
		
		int sum = 0; // initialize value to store the sum of numbers
		
		// starts a loop from 1 to 10, incrementing 'i' by 1 each time
		for(int i=1; i<=10; i++) {		// 1~10까지 반복 repeat
			sum+=i;			// adds the current value of 'i' to the sum
			System.out.print(i);		// 더하는 수 출력
			
			// checks if i is less than or equal to 9
			// if true, prints + to separate numbers being added
			if(i<=9) 					// 1~9까지는 '+' 출력
				System.out.print("+");
			else {						// else i가 10인 경우
				System.out.print("=");	// '=' 출력하고
				System.out.print(sum);	// 덧셈 결과 출력
			}
		}
	}
}