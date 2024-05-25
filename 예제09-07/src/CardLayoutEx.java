// CardLayoutEx.java file

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutEx extends JFrame {
	
	public CardLayoutEx() {
		setTitle("CardLayout Sample"); // 프레임의 타이틀  달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		
		JPanel cardPanel = new JPanel();
		CardLayout cardLayout = new CardLayout();
		cardPanel.setLayout(cardLayout);

		// 카드 생성
		JPanel card1 = new JPanel();
		card1.add(new JLabel("Card 1"));
		JPanel card2 = new JPanel();
		card2.add(new JLabel("Card 2"));
		JPanel card3 = new JPanel();
		card3.add(new JLabel("Card 3"));

		// 카드 패널에 카드 추가
		cardPanel.add(card1, "Card 1");
		cardPanel.add(card2, "Card 2");
		cardPanel.add(card3, "Card 3");

		// 버튼 패널 생성
		JPanel buttonPanel = new JPanel();
		JButton firstButton = new JButton("First");
		JButton nextButton = new JButton("Next");
		JButton previousButton = new JButton("Previous");
		JButton lastButton = new JButton("Last");

		firstButton.addActionListener(e -> cardLayout.first(cardPanel));
		nextButton.addActionListener(e -> cardLayout.next(cardPanel));
		previousButton.addActionListener(e -> cardLayout.previous(cardPanel));
		lastButton.addActionListener(e -> cardLayout.last(cardPanel));

		buttonPanel.add(firstButton);
		buttonPanel.add(nextButton);
		buttonPanel.add(previousButton);
		buttonPanel.add(lastButton);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(cardPanel, BorderLayout.CENTER);
		c.add(buttonPanel, BorderLayout.SOUTH);

		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new CardLayoutEx();
	}
}
