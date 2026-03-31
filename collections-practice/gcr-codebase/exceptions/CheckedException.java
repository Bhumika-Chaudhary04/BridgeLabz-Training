package exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) {
		try {
			FileInputStream fs=new FileInputStream("src/exception_handling/data.txt");
			int ch;
			while((ch=fs.read())!=-1) {
				System.out.print((char)ch);
			}			
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}

}
