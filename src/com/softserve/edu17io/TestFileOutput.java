package com.softserve.edu17io;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutput {
	public static void main(String[] args) {
		System.out.println("start");
		byte[] w = { 48, 49, 50, 13, 10, 53, 54, 55, 56 };
		String fileName = "d:/test.txt";
		FileOutputStream outFile = null;
		try {
			outFile = new FileOutputStream(fileName); // Create empty file.
			System.out.println("Output file was opened.");
			outFile.write(w);
			System.out.println("Saved: " + w.length + " bytes.");
			// outFile.close();
			// System.out.println("Output stream was closed.");
		} catch (IOException e) {
			System.out.println("File Write Error: " + fileName);
		} finally {
			try {
				if (outFile != null) {
					outFile.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Output stream was closed.");
		}
	}
}
