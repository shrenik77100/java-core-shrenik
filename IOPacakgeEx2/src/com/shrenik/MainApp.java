/* WAP to create and store text data file using Character Stream Class */

package com.shrenik;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MainApp {

	public static void main(String[] args)throws IOException {
		File ref = new File("c:/demo/sample.txt");
		
		if(ref.exists())
		{
			//used to save any message in selected file
			PrintWriter pw = new PrintWriter(ref);
			
			String s = "Hello Python";
			pw.write(s);
			
			System.out.println("Message saved in file..");
			
			pw.close();
		}

	}

}
