package swing.frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		// 레이아웃 설정 
		setLayout(new FlowLayout());
		
		// 컴포넌트 추가 
		JButton btn = new JButton("버튼");
		add(btn);
		
		
		setVisible(true);
	}
}

