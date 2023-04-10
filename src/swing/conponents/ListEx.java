package swing.conponents;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListEx extends JFrame implements MouseListener  {
	

	private JList<String> list;
	private DefaultListModel<String> model;

	public ListEx(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocation(1100, 200);
		setLayout(new GridLayout(1, 3));
		
		model = new DefaultListModel<>();
		model.addElement("AAA");
		model.addElement("BBB");
		model.addElement("CCC");
		model.addElement("AAA");
		model.addElement("BBB");
		model.addElement("CCC");
		model.addElement("AAA");
		model.addElement("BBB");
		model.addElement("CCC");
		
		
		list = new JList<>(model);
		list.addMouseListener(this);
		
		JScrollPane scrollPane = new JScrollPane(list);
		add(scrollPane);
		
		JPanel panCenter = new JPanel();	
		
		JButton btnLR = new JButton("->");
		panCenter.add(btnLR);
		JButton btnRL = new JButton("<-");
		panCenter.add(btnRL);
		add(panCenter);
		
		
		DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<>();
		cbModel.addElement("1111");
		cbModel.addElement("2222");
		cbModel.addElement("3333");
		cbModel.addElement("4444");
		
		JComboBox<String> cb = new JComboBox<String>(cbModel);
		add(cb);
				
		setVisible(true);		
	}

	public static void main(String[] args) {
		new ListEx("ListEx");

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount() == 2) {
			int i = list.getSelectedIndex();
			String val = list.getSelectedValue();
			System.out.println(i + " : " + val);
			
			model.remove(i);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
