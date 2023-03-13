package swing.frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameBackground extends JFrame {

	public MyFrameBackground(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		// 레이아웃 설정 
		setLayout(new FlowLayout());
		
		// 컴포넌트 추가 
		JButton btn1 = new JButton("OK");
		btn1.setBackground(Color.BLUE);
		
		
		JButton btn2 = new JButton("Cancel");
		btn2.setBackground(Color.RED);
		add(btn2);
		
		JButton btn3 = new JButton("Ignore");
		add(btn3);
		
		Container contentPane = this.getContentPane();
				
		contentPane.setBackground(Color.ORANGE);
		add(btn1);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new MyFrameBackground("Frame 배경색 설정");
	}
}

