package thread.basic;

import javax.swing.JLabel;

public class TimerThread extends Thread
{	
	private int n = 0;
	private JLabel lbl;

	public TimerThread() {
		
	}
	
	public TimerThread(JLabel lbl)
	{
		this.lbl = lbl;
	}

	@Override
	public void run()
	{
		while(true) {
			
			lbl.setText(n + "");
			
			n++;
			
			if(n > 15) {
				break;
			}
			
			try
			{
				this.sleep(1000);
			} 
			catch (InterruptedException e)
			{				
				e.printStackTrace();
			}
		}
		
	}
	
}
