package j07Java_File_IO_NIO2;

import java.io.File;
import java.io.IOException;

public class ex6 {
	public static void main(String args[]) throws IOException
	{
		new ex6().recDelete("c:/abc");
	}
	public void recDelete(String dirName) throws IOException {
	    File[] listOfFiles = new File(dirName).listFiles();
	    if (listOfFiles != null && listOfFiles.length > 0) {
	        for (File aFile : listOfFiles) {
	            if (aFile.isDirectory()) {
	                recDelete(aFile.getAbsolutePath());
	            } else if (aFile.getName().endsWith(".class")) {
	                aFile.delete();
	            }
	        }
	    }
	}
	
}
/*
Given the code fragment:

public void recDelete(String dirName) throws IOException {
    File[] listOfFiles = new File(dirName).listFiles();
    if (listOfFiles != null && listOfFiles.length > 0) {
        for (File aFile : listOfFiles) {
            if (aFile.isDirectory()) {
                recDelete(aFile.getAbsolutePath());
            } else if (aFile.getName().endsWith(".class")) {
                aFile.delete();
            }
        }
    }
}


Assume that Projects contains subdirectories that contain .class files and is passed as an argument to the recDelete() method when it is invoked.

What is the result?

A. The method deletes all the .class files in the Projects directory and its subdirectories.
B. The method deletes the .class files of the Projects directory only.
C. The method executes and does not make any changes to the Projects directory.
D. The method throws an IOException.


*/