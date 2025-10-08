import java.io.File;

public class ListFiles {
	
	void listFiles(String fileName) {
		File file = new  File(fileName);
		listFiles(file);
	}
	
	void listFiles(File dir) {
		
		System.out.println("=====>"+dir);
		
		File[] files = dir.listFiles();
		
		for(File file : files) {
			System.out.println("  " + file);
			
			if(file.isDirectory())
				listFiles(file);	
		}

	}
}
