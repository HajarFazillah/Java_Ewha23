// 예제 10-1 : 독립 클래스로 Action 이벤트의 리스너 작성

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IndepClassListener extends JFrame{

	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // 레이아웃 매니저 설정
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // Action 리스너 달기
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();
	}
}

// 독립 클래스 : MyActionListener
// independent class bcs it is defined separately
// and not nested within another class (for event handling)
class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}
