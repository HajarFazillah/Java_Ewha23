// 예제 5-4 : super()를 활용한 ColorPoint 작성
// super() 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스
// Point의 생성자를 호출하는 예를 보인다.

// Person 클래스: 사람을 나타내는 기본 클래스
class Person { }

// Student 클래스: 학생을 나타내는 클래스, Person 클래스를 상속받음
class Student extends Person { }

// Researcher 클래스: 연구원을 나타내는 클래스, Person 클래스를 상속받음
class Researcher extends Person { }

// Professor 클래스: 교수를 나타내는 클래스, Researcher 클래스를 상속받음
class Professor extends Researcher { }

// 메인 클래스
public class InstanceOfEx {
    // Person 객체를 받아와서 해당 객체의 타입을 확인하고 출력하는 메서드
    static void print(Person p) {
        if (p instanceof Person) // 만약 p가 Person 클래스의 인스턴스인지 확인
            System.out.print("Person "); // Person 클래스의 인스턴스이면 "Person" 출력
        if (p instanceof Student) // 만약 p가 Student 클래스의 인스턴스인지 확인
            System.out.print("Student "); // Student 클래스의 인스턴스이면 "Student" 출력
        if (p instanceof Researcher) // 만약 p가 Researcher 클래스의 인스턴스인지 확인
            System.out.print("Researcher "); // Researcher 클래스의 인스턴스이면 "Researcher" 출력
        if (p instanceof Professor) // 만약 p가 Professor 클래스의 인스턴스인지 확인
            System.out.print("Professor "); // Professor 클래스의 인스턴스이면 "Professor" 출력
        System.out.println(); // 줄 바꿈
    }

    // 메인 메서드
    public static void main(String[] args) {
        System.out.print("new Student()\t->\t"); // "new Student() ->" 출력
        print(new Student()); // Student 클래스의 객체 생성 후 print 메서드 호출하여 출력
        System.out.print("new Researcher()->\t"); // "new Researcher() ->" 출력
        print(new Researcher()); // Researcher 클래스의 객체 생성 후 print 메서드 호출하여 출력
        System.out.print("new Professor()\t->\t"); // "new Professor() ->" 출력
        print(new Professor()); // Professor 클래스의 객체 생성 후 print 메서드 호출하여 출력
    }
}
