package swing.app;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FirstForm extends JFrame implements ActionListener  {
	

	private JButton btn;
	private JButton btn2;
	private SecodeForm sf;
	private JTextField textField;

	public FirstForm(String title) {
		setTitle(title);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		textField = new JTextField(10);
		add(textField);
		
		btn = new JButton("확인");
		btn.addActionListener(this);
		add(btn);
		
		btn2 = new JButton("변경");
		btn2.addActionListener(this);
		add(btn2);
				
		setVisible(true);		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn) {
			
			sf = new SecodeForm("SecodeForm", this);
			
		} else if(obj == btn2) {
			if(sf != null) {
				String str = textField.getText();
				sf.setTitle(str);
			} else {
				JOptionPane.showMessageDialog(this, "먼저 객체를 생성하세요.");
			}
		}
		
	}

	public JTextField getTextField() {
		return textField;
	}

	
}
