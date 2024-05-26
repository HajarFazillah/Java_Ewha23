// 예제 10-4 : 마우스로 문자열 이동시키기 - 마우스 이벤트 연습
// 컨텐트팬의 아무 위치에 마우스 버튼을 누르면 마우스 포인트가 있는 위치로
// "hello" 문자열을 옮기는 스윙 응용 프로그램을 작성하라.

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello"); // "Hello" 문자열을 표시할 JLabel 생성
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제"); // 창의 제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫을 때 프로그램 종료
		
		Container c = getContentPane(); // 컨텐트 팬을 가져옴
		c.addMouseListener(new MyMouseListener()); // 컨텐트 팬에 MouseListener 추가
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(300,250);
		setVisible(true);
	}
	
	// MouseListener 인터페이스를 구현하는 내부 클래스
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y); // JLabel의 위치를 마우스 클릭 위치로 설정
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		new MouseListenerEx(); // 프레임 생성
	}
}
