package swing.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutFrame2 extends JFrame {

	public GridLayoutFrame2(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		
		// ���̾ƿ� ���� 
		setLayout(new GridLayout(4, 2));
		
		// ������Ʈ �߰� 
		JLabel lbl1 = new JLabel("�̸�");
		add(lbl1);
		
		JTextField tf1 = new JTextField("");
		add(tf1);
		JLabel lbl2 = new JLabel("�й�");
		add(lbl2);
		
		JTextField tf2 = new JTextField("");
		add(tf2);
		
		JLabel lbl3 = new JLabel("�а�");
		add(lbl3);
		
		JTextField tf3 = new JTextField("");
		add(tf3);
		
		JLabel lbl4 = new JLabel("����");
		add(lbl4);
		
		JTextField tf4 = new JTextField("");
		add(tf4);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new GridLayoutFrame2("GridLayout2 ����");
	}
}

