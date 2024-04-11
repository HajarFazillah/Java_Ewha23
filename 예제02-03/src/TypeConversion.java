// 예제 2-3 : 타입 변환
// 자동 타입 변환과 간제 타입 변환의 이해를 위한 예제이다.

public class TypeConversion {

	public static void main(String[] args) {
		
		byte b = 127; // smallest data (puts in a box)
		int i = 100;  // initialize value of integer
		
		System.out.println(b+i);				// 227
		System.out.println(10/4);				// 2
		System.out.println(10.0/4);				// 2.5
		System.out.println((char)0x12340041);	// A
		System.out.println((byte)(b+i));		// -29
		System.out.println((int)2.9+1.8);		// 3.8
		System.out.println((int)(2.9+1.8));		// 4
		System.out.println((int)2.9+(int)1.8);	// 3

	}

}
