package com.shrenik;

import java.io.File;
import java.io.IOException;

public class MainApp {

	public static void main(String[] args) throws IOException{

		File conn = new File("c:/demo/test.txt");
		
		//1. createNewFile()
		if(conn.exists())
		{
			System.out.println("\n File already present");
		}
		else
		{
			conn.createNewFile();
			System.out.println("New File Created");
		}
		
		//2. getName()
		System.out.println("getName() = " + conn.getName());
		
		//3. getParent()
		System.out.println("getParent() = " + conn.getParent());
		
		//4. getParentFile()
		System.out.println("getParentFile() = " + conn.getParentFile());
		
		//5. getPath()
		System.out.println("getPath() = " + conn.getPath());		
		
		//6. canRead()
		System.out.println("canRead() = " + conn.canRead());
		
		//7. canWrite()
		System.out.println("canWrite() = " + conn.canWrite());
		
		//8. isDirectory()
		System.out.println("isDirectory() = " + conn.isDirectory());
		
		//9. isFile()
		System.out.println("isFile() = " + conn.isFile());
		
		//10. isHidden()
		System.out.println("isHidden() = " + conn.isHidden());
		
		
		//11. length()
		System.out.println("length() = " + conn.length());
		
		
		//12. delete()
		System.out.println("delete() = " + conn.delete());
		
		
		
	}

}
