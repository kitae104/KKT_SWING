package thread.sync;

public class WorkerThread extends Thread
{
	private SharedPrinter p; 
	private String[] text;

	public WorkerThread(SharedPrinter p, String[] text)
	{
		this.p = p;
		this.text = text;
	}

	@Override
	public void run()
	{
		for (int i=0; i<text.length; i++) { // 한 줄씩 출력
			p.print(text[i]); // 공유 프린터에 출력
		}

	}

	
}
