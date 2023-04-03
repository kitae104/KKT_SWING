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
		
		JLabel lbl = new JLabel("사과 100원, 배 500원, 체리 20000원");
		add(lbl);
		
		chk1 = new JCheckBox("사과");
		chk1.setBorderPainted(true);
		chk1.addItemListener(this);
		add(chk1);
		
		chk2 = new JCheckBox("배");
		chk2.setBorderPainted(true);
		chk2.addItemListener(this);
		add(chk2);
		
		chk3 = new JCheckBox("체리");
		chk3.setBorderPainted(true);
		chk3.addItemListener(this);
		add(chk3);
		
		lblResult = new JLabel("현재 0원 입니다.");
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
		
		lblResult.setText("현재 " + sum + "원 입니다.");
	}

}
