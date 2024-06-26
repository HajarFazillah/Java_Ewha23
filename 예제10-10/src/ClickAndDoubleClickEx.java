// 예제 10-10 : 더블클릭 시 컨텐트팬의 배경색 변경
// 더블클릭할 때마다 컨텐트팬의 배경색을 랜덤하게 변경하다.

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ClickAndDoubleClickEx extends JFrame {
	public ClickAndDoubleClickEx() {
		setTitle("Click and Double-Click");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==2) {
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				Component c = getContentPane();
				c.setBackground(new Color(r,b,g));
			}
		}
	}
	public static void main(String[] args) {
		new ClickAndDoubleClickEx();
	}
}
