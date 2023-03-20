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
		
		// ���̾ƿ� ���� 
		setLayout(null);
		
		// ������Ʈ �߰� 
		JButton btn = new JButton("��ư");
		btn.setSize(100, 25);
		btn.setLocation(100, 100);	
		add(btn);		
		
		JButton btn2 = new JButton("��ư2");
		btn2.setSize(100, 25);
		btn2.setLocation(50, 50);	
		add(btn2);
		
		JButton btn3 = new JButton("��ư3");
		btn3.setBounds(200, 50, 80, 25);
		add(btn3);
		
		setVisible(true);		
		
	}
	
	public static void main(String[] args) {
		new NoLayoutFrame("NoLayoutFrame");
	}

}
