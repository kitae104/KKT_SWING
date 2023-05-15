package thread.basic;

public class Main
{

	public static void main(String[] args)
	{
		TimerThread tt = new TimerThread();
		TimerThread tt2 = new TimerThread();
		tt.start();
		tt2.start();
		
		System.out.println("AAA");

	}

}
