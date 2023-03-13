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
		
		// 레이아웃 설정 
		setLayout(new GridLayout(4, 2));
		
		// 컴포넌트 추가 
		JLabel lbl1 = new JLabel("이름");
		add(lbl1);
		
		JTextField tf1 = new JTextField("");
		add(tf1);
		JLabel lbl2 = new JLabel("학번");
		add(lbl2);
		
		JTextField tf2 = new JTextField("");
		add(tf2);
		
		JLabel lbl3 = new JLabel("학과");
		add(lbl3);
		
		JTextField tf3 = new JTextField("");
		add(tf3);
		
		JLabel lbl4 = new JLabel("과목");
		add(lbl4);
		
		JTextField tf4 = new JTextField("");
		add(tf4);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new GridLayoutFrame2("GridLayout2 연습");
	}
}

