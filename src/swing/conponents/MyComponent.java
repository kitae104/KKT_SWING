package swing.conponents;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyComponent extends JFrame implements ActionListener {

	private JButton btn;
	private JButton btn2;
	private JButton btn3;

	public MyComponent(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		btn = new JButton("홍길동");		
		btn.addActionListener(this);
		btn.setBackground(Color.YELLOW);
		btn.setForeground(Color.RED);
		add(btn);
		
		btn2 = new JButton("자바프로그램");		
		btn2.addActionListener(this);
		btn2.setEnabled(false);
		add(btn2);
		
		btn3 = new JButton("Swing");		
		btn3.addActionListener(this);
		btn3.setVisible(true);
		add(btn3);
		
		JLabel lbl = new JLabel("자바 JLabel");
		lbl.setOpaque(true);
		lbl.setForeground(Color.ORANGE);
		lbl.setBackground(Color.RED);
		add(lbl);
		
		String currentPath = System.getProperty("user.dir");
		System.out.println(currentPath);
		
		setVisible(true);		
	}

	public static void main(String[] args) {
		new MyComponent("MyComponent");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn) {
			System.out.println("AAA");
		}
		
	}

}
