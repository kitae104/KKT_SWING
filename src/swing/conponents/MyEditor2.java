package swing.conponents;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.fife.ui.autocomplete.*;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

public class MyEditor2 extends JFrame implements ActionListener  {


	private JMenuItem itemExit;
	private JMenuItem itemInfo;
	private JMenuItem itemNew;
	private JMenuItem itemOpen;
	private JMenuItem itemSave;
	private RSyntaxTextArea textArea;
	
	public MyEditor2(String title) {
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

		textArea = new RSyntaxTextArea(20, 60);
		textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
		textArea.setCodeFoldingEnabled(true);
		RTextScrollPane sp = new RTextScrollPane(textArea);

		CompletionProvider provider = createCompletionProvider();
		AutoCompletion ac = new AutoCompletion(provider);
		ac.install(textArea);

		panCenter.add(sp);
		
		add(panCenter);
	}

	private CompletionProvider createCompletionProvider() {
		DefaultCompletionProvider provider = new DefaultCompletionProvider();

		// a straightforward word completion.
		provider.addCompletion(new BasicCompletion(provider, "abstract"));
		provider.addCompletion(new BasicCompletion(provider, "assert"));
		provider.addCompletion(new BasicCompletion(provider, "break"));
		provider.addCompletion(new BasicCompletion(provider, "case"));
		provider.addCompletion(new BasicCompletion(provider, "class"));
		provider.addCompletion(new BasicCompletion(provider, "public"));

		// ... etc ...
		provider.addCompletion(new BasicCompletion(provider, "transient"));
		provider.addCompletion(new BasicCompletion(provider, "try"));
		provider.addCompletion(new BasicCompletion(provider, "void"));
		provider.addCompletion(new BasicCompletion(provider, "volatile"));
		provider.addCompletion(new BasicCompletion(provider, "while"));
		provider.addCompletion(new BasicCompletion(provider, "for"));

		// require the input text to be the same thing as the replacement text.
		provider.addCompletion(new ShorthandCompletion(provider, "sysout",
				"System.out.println(", "System.out.println("));
		provider.addCompletion(new ShorthandCompletion(provider, "syserr",
				"System.err.println(", "System.err.println("));
		provider.addCompletion(new ShorthandCompletion(provider, "main",
				"public static void main(String args[])", "public static void main(String args[])"));

		return provider;
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
		
		JMenuItem itemColor = new JMenuItem("Color");
		menuOption.add(itemColor);
		
		bar.add(menuOption);
		
		JMenu menuInfo = new JMenu("����");
		itemInfo = new JMenuItem("���α׷� ����");
		itemInfo.addActionListener(this);
		menuInfo.add(itemInfo);
		
		bar.add(menuInfo);
		
		setJMenuBar(bar);
	}

	public static void main(String[] args) {
		new MyEditor2("MyEditor ver0.1");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == itemExit) {
			if((JOptionPane.showConfirmDialog(
					this, "���� �����ұ��?",
					"���� Ȯ��", JOptionPane.YES_NO_OPTION,
					JOptionPane.WARNING_MESSAGE)) == JOptionPane.YES_OPTION ) {
				System.exit(0);
			}
		} else if(obj == itemInfo) {
			JOptionPane.showMessageDialog(
					this,
					"���� ������ ���α׷�",
					"���α׷� ����",
					JOptionPane.ERROR_MESSAGE
					);
		} else if(obj == itemNew) {
			
		} else if(obj == itemOpen) {
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
			
		}else if(obj == itemSave) {
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
		
	}

}
