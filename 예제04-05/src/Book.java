// 예제 4-5 : this()로 다른 생성자 호출
// 예제 4-4에서 작성한 Book 클래스의 생성자를 this() 이용하여 수정하라.

public class Book {
	String title;
	String author;
	
	// simple method that prints the title and author of the book to the console
	// void show used: to encapsulate the logic for displaying the info (promotes code reusability and readibility)
	void show() {
		System.out.println(title+" "+author);
	}
	
	// this keyword refers to the current object within a class
	public Book() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public Book(String title) {
		this(title, "적자미상");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자","생태쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();
		loveStory.show();

	}

}
