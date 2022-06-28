package com.assignment_filehandling_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException {
		File file1 = new File("C:/Users/sushi/Desktop/read.txt");
		file1.createNewFile();
		if(file1!=null) {
			System.out.println("file is created");
		}

		FileReader fr = new FileReader(file1);

		File file2= new File("C:/Users/sushi/Desktop/write.txt");
		file2.createNewFile();
		FileWriter fw = new FileWriter(file2);
		
		String message="";
		String line;
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);

		while((line=br.readLine())!=null) {
           bw.write(line);
			bw.newLine();
			if(file2!=null) {
				message =  "write.txt file is with data transfered from read.txt";
			}
			else
			{
				message ="reading and writng performance is not done , try again"; 
			}
		}
		System.out.println(message);
		br.close();
		bw.close();
		fw.close();
		fr.close();

	}


}
