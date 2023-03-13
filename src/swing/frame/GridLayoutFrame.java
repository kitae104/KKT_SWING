package swing.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutFrame extends JFrame {

	public GridLayoutFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		// 레이아웃 설정 
		setLayout(new GridLayout(2, 3));
		
		// 컴포넌트 추가 
		JButton btn1 = new JButton("1");
		add(btn1);
		
		JButton btn2 = new JButton("2");
		add(btn2);
		
		JButton btn3 = new JButton("3");
		add(btn3);
		
		JButton btn4 = new JButton("4");
		add(btn4);
		
		JButton btn5 = new JButton("5");
		add(btn5);
		
		JButton btn6 = new JButton("6");
		add(btn6);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new GridLayoutFrame("GridLayout 연습");
	}
}

