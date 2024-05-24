// 예제 9-2 : 3개의 버튼 컴포넌트를 가진 스윙 프레임 만들기
// 다음 그림과 같이 컨텐트팬의 배경색을 오렌지색으로 하고
// 이곳에OK, Cancel, Ignore 버튼들을 부착한 스윙 프로그램을 작성하라.

import javax.swing.*;
import java.awt.*;

// 생성자 정의
public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame"); // 프레임의 제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료 시 프로그램 종료
		
		// 컨텐트팬 가져오기
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.PINK); // 배경색을 핑크색으로 설정
		contentPane.setLayout(new FlowLayout()); // 레이아웃 매니저 설정
		
		// 버튼 추가
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(400,150); // 프레임 크기 설정
		setVisible(true); // 프레임 출력
		
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
