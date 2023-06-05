package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopy
{

	public static void main(String[] args)
	{
		File src = new File("c:/windows/system.ini");
		File dst = new File("c:/temp/myFile.txt");
		
		FileReader fr = null;
		FileWriter fw = null; 
		try
		{
			fr = new FileReader(src);
			fw = new FileWriter(dst);
			int i = 0; 
			while((i = fr.read()) != -1) {
				fw.write((char)i);
			}
			System.out.println("file copy!");
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				fr.close();
				fw.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
