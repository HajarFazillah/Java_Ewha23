// 예세 4-4 : 생성자 선언 멫 활용 연습
// 제목과 저자를 나타내는 title과 author 필드를 가진 Book 클래스를 작성하고,
// 생성자를 작성하여 필드를 초기화하라.

// 클레스 선언
public class Book {
	String title;
	String author;
	
	// 생성자
	public Book(String t) {
		title = t;
		author = "작자미상";
	}
	
	// 생성자
	public Book(String t, String a) {
		title = t;
		author = a;
	}

	// main 메소드 (프로그램의 진입점 - 여기부터 시작)
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생태쥐페리");
		Book loveStory = new Book("춘향전");
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);

	}

}
