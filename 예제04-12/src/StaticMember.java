// 예제 4-12 : static을 이용한 환율 계산기
// static 멤버를 이용하여 달러와 원화를 변환 해주는 환율 계산기를 만들어보자.

import java.util.Scanner;

class CurrencyConverter{
	 // Static variable to store the exchange rate
	private static double rate; 
	
	// Korean Won to US Dollar
	public static double toDollar(double won) {
		return won/rate;
	}
	
	// US Dollar to Korean Won
	public static double toKWR(double dollar) {
		return dollar * rate;
	}
	
	// method to set the exchange rate
	public static void setRate(double r) {
		rate = r;
	}
}

public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("환율(1달러)>>");
		double rate = scanner.nextDouble();
		
		// Set the exchange rate using the setRate method of CurrencyConverter
		CurrencyConverter.setRate(rate);
		
		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) +"입니다.");
		System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
		scanner.close();
	}
}
