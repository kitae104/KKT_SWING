package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BinaryFileCopy
{

	public static void main(String[] args)
	{
		File src = new File("c:/windows/explorer.exe");
		File dst = new File("c:/temp/myProg2.exe");
		
		FileInputStream fr = null;
		FileOutputStream fw = null; 
		try
		{
			fr = new FileInputStream(src);
			fw = new FileOutputStream(dst);
			byte[] buffer = new byte[1024 * 10];
			int i = 0; 
			while(true) {
				i = fr.read(buffer);
				fw.write(buffer, 0, i);
				if(i < buffer.length) {
					break;
				}
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
