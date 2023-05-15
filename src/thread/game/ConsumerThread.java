package thread.game;

public class ConsumerThread extends Thread
{
	private MyLabel bar;
	
	public ConsumerThread(MyLabel bar)
	{
		this.bar = bar;
	}

	@Override
	public void run()
	{
		while(true) {
			try
			{
				sleep(400);
				bar.consume();
			} 
			catch (InterruptedException e)
			{
				return;
			}
		}
	}
	
}
