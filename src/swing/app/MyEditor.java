package swing.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyEditor extends JFrame implements ActionListener  {
	

	private JMenuItem itemExit;
	private JMenuItem itemInfo;
	private JMenuItem itemNew;
	private JMenuItem itemOpen;
	private JTextArea textArea;
	private JMenuItem itemSave;
	private JMenuItem itemApp;

	public MyEditor(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocation(1000, 200);
		setLayout(new BorderLayout());
		
		setMenuBar();
		
		setPanCenter();
		
		setVisible(true);		
	}

	private void setPanCenter() {
		JPanel panCenter = new JPanel();
		panCenter.setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panCenter.add(scrollPane);
		
		add(panCenter);
	}

	private void setMenuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		
		itemNew = new JMenuItem("New");	
		itemNew.addActionListener(this);
		menuFile.add(itemNew);
		
		itemOpen = new JMenuItem("Open");	
		itemOpen.addActionListener(this);
		menuFile.add(itemOpen);
		
		itemSave = new JMenuItem("Save");	
		itemSave.addActionListener(this);
		menuFile.add(itemSave);
		
		menuFile.addSeparator();
		
		itemExit = new JMenuItem("Exit");	
		itemExit.addActionListener(this);
		menuFile.add(itemExit);
		
		
		bar.add(menuFile);
		
		JMenu menuOption = new JMenu("Option");
		JMenuItem itemFont = new JMenuItem("Font");
		menuOption.add(itemFont);
		
		menuOption.addSeparator();
		
		itemApp = new JMenuItem("App");
		itemApp.addActionListener(this);
		menuOption.add(itemApp);
		
		bar.add(menuOption);
		
		JMenu menuInfo = new JMenu("정보");
		itemInfo = new JMenuItem("프로그램 정보");
		itemInfo.addActionListener(this);
		menuInfo.add(itemInfo);
		
		bar.add(menuInfo);
		
		setJMenuBar(bar);
	}

	public static void main(String[] args) {
		new MyEditor("MyEditor ver0.1");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == itemExit) {
			if((JOptionPane.showConfirmDialog(
					this, "정말 종료할까요?",
					"종료 확인", JOptionPane.YES_NO_OPTION,
					JOptionPane.WARNING_MESSAGE)) == JOptionPane.YES_OPTION ) {
				System.exit(0);
			}
		} else if(obj == itemInfo) {
			JOptionPane.showMessageDialog(
					this,
					"나의 에디터 프로그램",
					"프로그램 정보",
					JOptionPane.ERROR_MESSAGE
					);
		} else if(obj == itemNew) {
			
		} else if(obj == itemOpen) {
			fileOpen();			
		}else if(obj == itemSave) {
			fileSave();
		} else if(obj == itemApp) {
			new FirstForm("FirstForm");
		}
		
	}

	private void fileSave() {
		JFileChooser fc = new JFileChooser();
		fc.showSaveDialog(this);
		File out = fc.getSelectedFile();
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(out));
			String str = textArea.getText();
			bw.write(str);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	private void fileOpen() {
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(this);
		File in = fc.getSelectedFile();
		BufferedReader br = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader(in));
			while( (line = br.readLine()) != null) {
				textArea.append(line + "\n");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
