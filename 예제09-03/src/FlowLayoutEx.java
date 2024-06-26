// 예제 9-3 : FlowLayout 배치관리 활용
// 수평 간격이 30, 수직 간격을 40 픽셀로하고 
// LEFT로 정렬 배치하는 FlowLayout 배치관리자를 가진 컨텐트팬에 
// 5개의 버튼 컴포넌트를 부착한 스윙 응용프로그램을 작성하라.

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	
	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		// FlowLayout.LEFT로 정렬됨
		// hGap, 30, 픽셀
		// vGap, 40, 픽셀
		
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(400,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
