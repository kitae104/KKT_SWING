package swing.event;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest2 extends JFrame implements ActionListener {

	private JButton btn;

	public EventTest2(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		// 레이아웃 설정 
		setLayout(new FlowLayout());
		
		// 컴포넌트 추가 
		btn = new JButton("test");	
		btn.addActionListener(this);
		add(btn);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventTest2("EventTest2");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn) {
			btn.setText("수업끝!");
		}
		
	}

}

