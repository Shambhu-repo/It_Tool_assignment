package com.assignment_16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"src/com/assignment_16/file.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}


