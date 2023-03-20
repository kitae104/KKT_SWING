package swing.event;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest extends JFrame {

	public EventTest(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		// 레이아웃 설정 
		setLayout(new FlowLayout());
		
		// 컴포넌트 추가 
		JButton btn = new JButton("test");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				String str = btn.getText();
				
				if(str.equals("test")) {
					btn.setText("버튼");			
				} else {
					btn.setText("test");
				}		
				
			}
		});
		add(btn);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventTest("EventTest");
	}

}

