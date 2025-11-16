import java.io.File;
import java.io.IOException;
/**
 * File class methods for creating files and directories
 * 	1. public boolean createNewFile() throws IOExcpetion
 * 	2. public boolean mkdir() 
 * 	3. public boolean mkdirs() 
 * 
 */
public class Test19_FileClass_creation {
	public static void main(String[] args) throws IOException {
		
		File file1 = new File("xyz.txt");
		System.out.println(file1.createNewFile()); //true  false
		
		File file2 = new File("xyz.txt","mno.txt");
		//System.out.println(file2.createNewFile()); //RE: IOExcetpion
		
		File file3 = new File("abc");
		System.out.println(file3.mkdir());
		
		File file4 = new File("bbc", "cbc");
		System.out.println(file4.mkdirs());
		
		File file5 = new File("bbc", "dbc");
		System.out.println(file5.mkdirs());
		
		File file6 = new File("bbc", "ebc");
		System.out.println(file6.mkdir());
		
		File file7 = new File("dbc", "fbc");
		System.out.println(file7.mkdir()); //no RE, returns false
		
		File file8 = new File("dbc", "fbc.txt");
		//System.out.println(file8.createNewFile()); //RE: IOE
		
		File file9 = new File("dbc", "fbc.txt");
		System.out.println(file9.mkdirs()); //RE: IOE
		
	}
}
