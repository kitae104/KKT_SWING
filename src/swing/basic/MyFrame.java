package swing.basic;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}

