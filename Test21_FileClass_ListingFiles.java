import java.io.File;

/**
 * public String[] list();
 * public File[]   listFiles();
 * 
 * public String[] list(FilenameFilter filter);
 * public File[]   listFiles(FilenameFilter filter);
 * 
 */
public class Test21_FileClass_ListingFiles {
	public static void main(String[] args) {
		
		ListFiles listFiles = new ListFiles();
		listFiles.listFiles("abc");
		
	}
}
