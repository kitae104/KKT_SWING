package swing.event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BasicEvent extends JFrame implements ActionListener {

	private JButton btn;
	private JButton btn2;
	private Container contentPane;
	

	public BasicEvent(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		// ·¹ÀÌ¾Æ¿ô ¼³Á¤ 
		setLayout(new FlowLayout());
		
		contentPane = getContentPane();
		
		// ÄÄÆ÷³ÍÆ® Ãß°¡ 
		btn = new JButton("ÆÄ¶û");		
		btn.addActionListener(this);
		add(btn);
		
		btn2 = new JButton("»¡°­");
		btn2.addActionListener(this);
		add(btn2);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BasicEvent("BasicEvent");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn) {
			contentPane.setBackground(Color.RED);
		} else if(obj == btn2) {
			contentPane.setBackground(Color.BLUE);			
		}
		
	}

}

