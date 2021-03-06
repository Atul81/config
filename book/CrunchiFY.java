package book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
/**
 * @author Crunchify.com
 */
 
public class CrunchiFY {
 
	@SuppressWarnings("unused")
	public static void main(String args[]) throws Exception {
		FileInputStream crunchifyStream1 = null;
		FileInputStream crunchifyStream2 = null;
		String fileName = "Crunchify.txt";
		float g= 56;
		float u = 3.1f;
		float price = 49.95f;
		char c = 'c';
		Character character = c;
 
		System.out.println("main: Starting " + CrunchiFY.class.getName() + " with file name = " + fileName);
 
		// get file input stream 1
		try {
			crunchifyStream1 = crunchifyTest1(fileName);
		} catch (FileNotFoundException ex) {
			System.out.println("main: Oops, FileNotFoundException caught");
		} catch (Exception ex) {
			System.out.println("main: Oops, genreal exception caught");
		}
 
		// get file input stream 2
		crunchifyStream2 = crunchifyTest2(fileName);
		System.out.println("main: " + CrunchiFY.class.getName() + " ended");
	}
 
	public static FileInputStream crunchifyTest1(String fileName) throws FileNotFoundException {
		FileInputStream crunchifyStream = new FileInputStream(fileName);
		System.out.println("crunchifyTest1: File input stream created");
		return crunchifyStream;
	}
 
	public static FileInputStream crunchifyTest2(String fileName) throws Exception {
		FileInputStream crunchifyStream = null;
		try {
			crunchifyStream = new FileInputStream(fileName);
		} catch (FileNotFoundException ex) {
			//throw new Exception("crunchifyTest2: Oops, FileNotFoundException caught");
			throw new Exception("CHecking");
			//System.out.println("crunchifyTest2: Oops, FileNotFoundException caught");
		} finally {
			System.out.println("crunchifyTest2: finally block");
		}
		System.out.println("crunchifyTest2: Returning from crunchifyTest2");
		return crunchifyStream;
	}
 
}