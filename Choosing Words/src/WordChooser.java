/**
 * <p></p> 
 * Sep 19, 2017
 * @author Patrick Riley
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class WordChooser {


	
	/**
	 * 
	 * @return a scanner of the txt file
	 *
	 *Scanner
	 */
	public static Scanner fileRead(String fname) {
		
		File file = new File(fname);
		Scanner input = null;
		
		try {
			
			input = new Scanner(file);
			
		} catch(FileNotFoundException ex) {
			
			System.out.println("Cant open file: " + ex.getMessage() + " " + fname);
			return null;
			
		}
		
		return input;
		
	}
	
	/**
	 * 
	 * @return 
	 *
	 *PrintWriter
	 */
	public PrintWriter fileWrite() {
		return null;
		
	}
	
	
	/**
	 * @param args
	 *
	 *void
	 */
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("No file my dude");
			System.exit(1);
		}
		Scanner in  = fileRead(args[0]);
		
		if(in == null) System.exit(1);
		
		System.out.print(in.nextLine());
		in.close();

	}

}
