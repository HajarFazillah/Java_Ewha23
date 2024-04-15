// 예제 3-11 : 비정방향 배열의 생성과 접근
// 비정방향 배열을 만들어 값을 초기화하고 출력하시오.

public class IrregularArray {

	public static void main(String[] args) {
		
		// declaration and creation of an irregular array
		int intArray[][] = new int[4][];
		
		// initialization of sub-arrays with different lengths
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		// initialization of array elements
		for(int i=0; i<intArray.length; i++)
			for(int j=0; j<intArray[i].length; j++)
				intArray[i][j]=(i+1)*10+j;
		
		// printing array elements
		for(int i=0; i<intArray.length;i++) {
			for(int j=0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j]+" ");
			System.out.println(); // move cursor to the next line after each row
		}	

	}

}