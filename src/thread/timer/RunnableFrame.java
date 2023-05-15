package thread.timer;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import thread.basic.TimerThread;

public class RunnableFrame extends JFrame implements Runnable
{

	public RunnableFrame() {
		setTitle("타이머");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		JLabel lbl = new JLabel("0", JLabel.CENTER);
		lbl.setFont(new Font("Gothic", Font.ITALIC, 80));
		add(lbl);
						
		setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		RunnableFrame frame = new RunnableFrame();
		Thread th = new Thread(frame);
		th.start();
	}

	@Override
	public void run()
	{
		System.out.println("AAAA");
		
	}

}
