package swing.conponents;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BasicForm extends JFrame  {
	

	public BasicForm(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
				
		setVisible(true);		
	}

	public static void main(String[] args) {
		new BasicForm("CheckBoxSum");

	}

}
