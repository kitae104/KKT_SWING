package swing.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame {

	public Frame() {
		setTitle("Ÿ��Ʋ");
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
	
	public static void main(String[] args) {
		new Frame();
	}

}
