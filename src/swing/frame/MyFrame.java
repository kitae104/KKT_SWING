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
		
		// ���̾ƿ� ���� 
		setLayout(new FlowLayout());
		
		// ������Ʈ �߰� 
		JButton btn = new JButton("��ư");
		add(btn);
		
		
		setVisible(true);
	}
}

