package com.a210;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputOutputEx 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		//write
		//String s = "Welcome to tops";
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		
		FileOutputStream fout = new FileOutputStream("E://neelam.txt");
		fout.write(data.getBytes());
		System.out.println("Executed");
		
		//read
		Thread.sleep(2000);
		
		FileInputStream fin = new FileInputStream("E://neelam.txt");
		
		int i=0;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
		
	}
}
