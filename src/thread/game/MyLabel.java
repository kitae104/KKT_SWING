package thread.game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

public class MyLabel extends JLabel
{
	private int maxBarSize;		// 전체 바의 크기
	private int size;			// 현재 크기 
	
	public MyLabel(int maxBarSize)
	{
		this.maxBarSize = maxBarSize;
		this.size = 0;
	}

	@Override
	protected void paintComponent(Graphics g)
	{		
		super.paintComponent(g);
		
		g.setColor(Color.MAGENTA);
		int width = (int)((double)getWidth() / maxBarSize * size);
		if(width == 0) {
			return;
		}
		
		g.fillRect(0, 0, width, getHeight());
	}
	
	public synchronized void full() {
		if(size == maxBarSize) {
			try
			{
				wait();
			} 
			catch (InterruptedException e)
			{
				return;
			}
		}
		
		size++;
		repaint();
		notify();
	}
	
	public synchronized void consume() {
		if(size == 0) {
			try
			{
				wait();
			} 
			catch (InterruptedException e)
			{
				return;
			}
		}
		
		size--;
		repaint();
		notify();
	}
	
}






