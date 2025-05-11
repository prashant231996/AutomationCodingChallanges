package com.javaProgram.codingChallange;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String fileContent = "Hi..I am Prashant.";
		writeToFile(fileContent);
	}

	public static void writeToFile(String fileContent) throws IOException {
		byte[] byteContent = fileContent.getBytes();
		// Creating New File
		File myFile = new File("myfile.txt");
		if (myFile.createNewFile()) {
			System.out.println("File is created successfully.");
		} else {
			System.out.println("File is already exists.");
		}

		try {
			// Writing Data to the file
			FileOutputStream fos = new FileOutputStream(myFile);
			fos.write(byteContent);
			System.out.println("File is created successfully with the content.");
			// Read data from the file
			FileInputStream input = new FileInputStream(myFile);
			int character;
			// read character by character by default
			// read() function return int between 0 and 255.
			System.out.println("Content of the created file are...");
			while ((character = input.read()) != -1) {
				System.out.print((char) character);
			}
			System.out.println();
		} finally {
			if (myFile.exists()) {
				myFile.delete();
				System.out.println("Created file is deleted successfully.");
			}
		}
	}

}
