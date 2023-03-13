package swing.basic;

import javax.swing.JFrame;

public class MyApp {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 프레임");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 300);
		f.setLocationRelativeTo(null);
		f.setVisible(true);

	}

}
