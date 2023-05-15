package thread.game;

public class Test
{

	public static void main(String[] args)
	{
		int totalWidth = 330;
		int maxBarSize = 100;
		int size = 10;
		
		int width = (int)((double)totalWidth / maxBarSize * size); 
		
		System.out.println(width);

	}

}
