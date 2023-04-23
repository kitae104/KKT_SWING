package swing.app;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SecodeForm extends JFrame implements ActionListener
{

	private JTextField textField;
	private JButton btn;
	private FirstForm firstForm;

	public SecodeForm(String title, FirstForm firstForm)
	{
		this.firstForm = firstForm;
		setTitle(title);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocation(200, 200);
		setLayout(new FlowLayout());

		textField = new JTextField(15);
		textField.addActionListener(this);
		add(textField);

		btn = new JButton("»Æ¿Œ");
		btn.addActionListener(this);
		add(btn);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object obj = e.getSource();

		if (obj == textField || obj == btn)
		{
			String str = textField.getText();
			firstForm.getTextField().setText(str);
		}
	}

}
