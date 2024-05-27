// 예제 10-7 : <F1> 키를 입력받으면 콘텐트팬의 배경을 초록색으로
// & 키를 입받으면 노란색으로 변경

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, % ㅋ; 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true); // 키 입력을 받을 수 있도록 포커스를 준다.
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			
			Container contentPane = getContentPane();
			
			if(e.getKeyChar()=='%') // % 키 입력 판별하기 위해 e.getKeyChar() 호출
				contentPane.setBackground(Color.YELLOW);
			else if (e.getKeyCode()==KeyEvent.VK_F1) // F1 키를 판별하기 위해 e.getKeyCode() 호출 KeyEvent.VK_F1 값과 비교
				contentPane.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String[] args) {
		new KeyCodeEx();
	}
}
