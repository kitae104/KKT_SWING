package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx
{

	public static void main(String[] args)
	{
		byte[] b = {7, 51, 3, 4, -1, 24};
		
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream("C:/temp/aa11.txt");
			fos.write(b);
			
		} catch (FileNotFoundException e)
		{			
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try
			{
				fos.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
