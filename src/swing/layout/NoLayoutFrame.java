package swing.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutFrame extends JFrame {

	public NoLayoutFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		// 레이아웃 설정 
		setLayout(null);
		
		// 컴포넌트 추가 
		JButton btn = new JButton("버튼");
		btn.setSize(100, 25);
		btn.setLocation(100, 100);	
		add(btn);		
		
		JButton btn2 = new JButton("버튼2");
		btn2.setSize(100, 25);
		btn2.setLocation(50, 50);	
		add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.setBounds(200, 50, 80, 25);
		add(btn3);
		
		setVisible(true);		
		
	}
	
	public static void main(String[] args) {
		new NoLayoutFrame("NoLayoutFrame");
	}

}
