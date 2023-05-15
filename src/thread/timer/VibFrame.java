package thread.timer;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

import thread.basic.TimerThread;

public class VibFrame extends JFrame implements Runnable, MouseListener
{

	private Thread th;

	public VibFrame() {
		setTitle("타이머");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		JLabel lbl = new JLabel("0", JLabel.CENTER);
		lbl.setFont(new Font("Gothic", Font.ITALIC, 80));
		add(lbl);
		
		addMouseListener(this);
	
		th = new Thread(this);
		th.start();
		
		setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		VibFrame frame = new VibFrame();
		
	}

	@Override
	public void run()
	{
		Random random = new Random();
		
		while(true) {
			
			try
			{
				Thread.sleep(50);
			} 
			catch (InterruptedException e)
			{				
				return;
			}
			
			int x = getX() + random.nextInt() % 5;
			int y = getY() + random.nextInt() % 5;
			setLocation(x, y);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		if(th.isAlive()) {
			th.interrupt();
		} else {
			return;
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

}
