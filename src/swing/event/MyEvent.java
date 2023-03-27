package swing.event;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEvent extends JFrame implements ActionListener {

	private JButton btn;

	public MyEvent(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		
		btn = new JButton("ȫ�浿");
		btn.setSize(80, 25);
		btn.setLocation(100, 100);
		btn.addActionListener(this);
		add(btn);
		
		setVisible(true);		
	}

	public static void main(String[] args) {
		new MyEvent("MyEvent");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn) {
			System.out.println("AAA");
		}
		
	}

}
