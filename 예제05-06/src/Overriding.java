// 예제 5-6 : 메소드 오버라이딩
// 게임에서 무기를 표현하는 Weapon 클래스를 만들고
// 살상능력을 리턴하는 fire() 메소드를 작성하면 다음과 같다.

// fire()은 1을 리턴한다.

class Weapon {
	protected int fire() {
		return 1; // 무기는 기본적으로 한 명만 살상
			}
}


class Cannon extends Weapon {
	@Override
	protected int fire() { // 오버라이딩
		return 10; // 대포는 한 번에 10명을 살상
	}
}
	
public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " +weapon.fire());

		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 " +
		weapon.fire());
		}
}