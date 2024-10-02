package com.a210;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		FileWriter fw = new FileWriter("E://shiv.txt");
		fw.write("Hello");
		System.out.println("Executed");
		fw.close();
		
		Thread.sleep(2000);
		
		FileReader fr = new FileReader("E://shiv.txt");
		int i=0;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
		
		
		
	}
}
