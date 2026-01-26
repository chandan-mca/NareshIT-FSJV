import java.io.File;
import java.util.Scanner;

public class Test23_FileClass_Uninstaller_deleteCompleteDir {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter file/directory to delete: ");
		File dir = new File(scn.next());
		
		DeleteDirectory.deleteDirectory(dir);
		if(dir.exists())
			System.out.println(dir +" is not deleted");
		else
			System.out.println(dir +" is deleted");
		
	}
}
