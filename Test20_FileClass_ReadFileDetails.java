import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test20_FileClass_ReadFileDetails {
	public static void main(String[] args) throws IOException {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter file/directory name: ");
		File file = new File(scn.nextLine());
		
		System.out.println(file.exists());
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getCanonicalFile());
		
		System.out.println(file.isAbsolute());
		System.out.println(file.isHidden());

		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());

		System.out.println(new java.sql.Time(file.lastModified()));
		System.out.println(file.length());
	}
}
