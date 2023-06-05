package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx
{

	public static void main(String[] args)
	{
		byte[] b = new byte[6];
		
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("c:/temp/aa11.txt");
			int i = 0;
			int n = 0;
			while((i = fis.read()) != -1) {
				b[n++] = (byte)i;	
			}
			
			for (int j = 0; j < b.length; j++)
			{
				System.out.print(b[j] + " ");
			}
			
		} 
		catch (FileNotFoundException e)
		{			
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				fis.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
