// 예제 2-4 : Scanner를 이용하여 키 입력 연습
// Scanner를 이용하여 이름, 도시, 나이, 체중, 독신 여부를 입력 받고
// 다시 출력하는 프로그램을 작성하라

import java.util.Scanner; // allow user to read input easily

public class ScannerEx {

	// public : method can be accessed from outside the class
	// static : method belongs to the class itself (not the instances of it)\
	// void : method does not return any value
	public static void main(String[] args) {
		
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("이름은 " + name + ", ");
		
		String city = scanner.next();
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.print("나이는 " + age + "살, ");
		
		double weight = scanner.nextDouble();
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean();
		System.out.print("독신 여부는 " + single + "입니다.");
	
		scanner.close(); // close to release resources
		
	}

}
