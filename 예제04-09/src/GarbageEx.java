// 예제 4-9 : 가비지의 발생
// 다음 코드에서 언제 가비지가 발생하는지 설명하라.

// the garbage objects in this scenario are
// the "Good" and "Normal" string objects,
// as there are no active references to them,
// making them eligible for garbage collection.

public class GarbageEx {
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null;
		d= c;
		c = null;
	}

}
