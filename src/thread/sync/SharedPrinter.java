package thread.sync;

public class SharedPrinter
{

	public synchronized void print(String text)
	{
		for(int i=0; i<text.length(); i++) {
			System.out.print(text.charAt(i));
		}
		System.out.println();		
	}

}
