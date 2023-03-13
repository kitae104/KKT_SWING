package swing.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame {

	public FlowLayoutFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		// ���̾ƿ� ���� 
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		// ������Ʈ �߰� 
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

		new FlowLayoutFrame("FlowLayout ����");
	}
}

