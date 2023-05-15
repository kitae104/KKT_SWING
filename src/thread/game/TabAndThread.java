package thread.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class TabAndThread extends JFrame implements KeyListener
{

	private MyLabel bar;

	public TabAndThread(String title)
	{
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setLocationRelativeTo(null);
		setLayout(null);
		
		bar = new MyLabel(100);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setBounds(20, 50, 300, 20);
		add(bar);
		
		addKeyListener(this);
		
		ConsumerThread ct = new ConsumerThread(bar);
		ct.start();
		
		
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new TabAndThread("아무키나 빨리 눌러");

	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		bar.full();		
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

}
