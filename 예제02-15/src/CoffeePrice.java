// 예제 2-15 : switch 문 활용
// switch 문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램을 작성하라.
// 에스프레소, 카푸치노, 카페라떼는 3500원이고, 아메리카노는 2000원이다.

import java.util.Scanner;
public class CoffeePrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What kind of coffee would you like? >> ");
		String order = scanner.next();
		int price = 0;
		switch(order) {
		case "Espresso":
		case "Cappucino":
		case "Cafe-latte":
			price = 3500;
			break;
		case "Americano":
			price = 2500;
			break;
		default:
			System.out.print("The chosen order is not on the menu.");
		}
		if(price!=0)
			System.out.print(order+" is "+price+" won.");
		scanner.close();
	}

}
