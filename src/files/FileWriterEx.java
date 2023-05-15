package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx
{

	public static void main(String[] args)
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("C:/temp/aaaa.txt");
			int i = 0;
			while((i = isr.read()) != -1) {
				fw.write(i);
			}
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try
			{
				fw.close();
				isr.close();
			}
			catch (IOException e)
			{				
				e.printStackTrace();
			}
		}

	}

}
