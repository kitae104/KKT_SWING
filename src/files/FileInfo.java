package files;

import java.io.File;

public class FileInfo
{

	public static void main(String[] args)
	{
		File f = new File("c:/windows");
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		File[] listFiles = f.listFiles();
		
		for (int i = 0; i < listFiles.length; i++)
		{
			
			if(listFiles[i].isFile()) {
				
				String name = listFiles[i].getName();
				long size = listFiles[i].length();
				long mod = listFiles[i].lastModified();
				System.out.println(name + "\t" + size + "\t" + mod);
			}
			
		}
		
		
		

	}

}
