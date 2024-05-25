// 예제 9-6 : 배치 관리자 없는 컨테이너에 컴포넌트를 절대위치와 크기로 지정
// 원하는 위치에 원하는 크기로 컴포넌트를 마음대로 배치할수 있다.

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {

	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c  = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130,50);
		la.setSize(200, 20);
		c.add(la);
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);;
			b.setSize(50,20);
			c.add(b);
		}
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NullContainerEx();
	}
}
