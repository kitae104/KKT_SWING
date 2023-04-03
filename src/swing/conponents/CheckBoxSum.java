package swing.conponents;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxSum extends JFrame implements ItemListener  {
	

	private JCheckBox chk1;
	private JCheckBox chk2;
	private JCheckBox chk3;
	private JLabel lblResult;
	private int sum = 0;
	
	public CheckBoxSum(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(260, 150);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		JLabel lbl = new JLabel("��� 100��, �� 500��, ü�� 20000��");
		add(lbl);
		
		chk1 = new JCheckBox("���");
		chk1.setBorderPainted(true);
		chk1.addItemListener(this);
		add(chk1);
		
		chk2 = new JCheckBox("��");
		chk2.setBorderPainted(true);
		chk2.addItemListener(this);
		add(chk2);
		
		chk3 = new JCheckBox("ü��");
		chk3.setBorderPainted(true);
		chk3.addItemListener(this);
		add(chk3);
		
		lblResult = new JLabel("���� 0�� �Դϴ�.");
		add(lblResult);
		
		setResizable(false);
		
		setVisible(true);		
	}

	public static void main(String[] args) {
		new CheckBoxSum("CheckBoxSum");

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int i = e.getStateChange();
		
		int sign = 1;
		if(i == ItemEvent.DESELECTED) {
			sign = -1;
		}
		Object obj = e.getItem();
		
		if(obj == chk1) {
			sum += 100 * sign;
		} else if(obj == chk2) {
			sum += 500 * sign;
		} else if(obj == chk3) {
			sum += 20000 * sign;
		}
		
		lblResult.setText("���� " + sum + "�� �Դϴ�.");
	}

}
