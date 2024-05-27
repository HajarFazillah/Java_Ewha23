// 예제 10-9 : 마우스와 마우스 모션 이벤트 활용
/*실행 flow:
 * 초기화면
 * mouseEntered()에 의해 배경색 변경, 마우스 버튼이 눌러진 순간
 * 눌러진 마우스 버튼이 떼어진 순간
 * 마우스가 패널 위에 이동하는 동안
 * 마우스가 패널 위에 드래그하는 동안
 * 마우스가 패널 바깥으로 나가면 mouseExited()에 의해 배경색 변경*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame{
	private JLabel la = new JLabel("No Mouse Event");
	
	public MouseListenerAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.add(la);
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed("+e.getX()+", "+e.getY()+")");
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased("+e.getX()+", "+e.getY()+")");
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDragged("+e.getX()+", "+e.getY()+")");
		}
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved("+e.getX()+", "+e.getY()+")");
		}
	}
	
	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
	
}
