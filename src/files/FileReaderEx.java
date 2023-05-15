package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx
{

	public static void main(String[] args)
	{
		FileReader fr = null;
		try
		{
			fr = new FileReader("C:\\Temp\\aaaa.txt");
			int i = 0;
			
			while(  (i = fr.read()) != -1 ) {
				System.out.print((char)i);				
			}
			
			
		} 
		catch (FileNotFoundException e)
		{			
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally 
		{
			try
			{
				fr.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
