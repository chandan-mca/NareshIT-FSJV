import java.io.File;
import java.util.Scanner;

public class Test22_FileClass_delete {
	public static void main(String[] args) {
		
		File file1 = new File("xyz.txt");
		boolean deleted = file1.delete();
		System.out.println("xyz.txt is deleted: "+ deleted);
		
		File file2 = new File("bbc"); //empty folder
		deleted = file2.delete();
		System.out.println("bbc is deleted: " + deleted);
		
		File file3 = new File("mno"); //not empty folder
		deleted = file3.delete();
		System.out.println("mno is deleted: "+ deleted);

		
//		Scanner scn = new Scanner(System.in);
//
//		System.out.print("Enter file/directory to delete: ");
//		File file1 = new File(scn.next());
//		
//		if(file1.exists()) {
//			boolean deleted = file1.delete();
//			
//			if (deleted) {
//				System.out.println(file1 + " is deleted");
//			}else {
//				System.out.println(file1 + " is not deleted");
//			}
//			
//		}else {
//			System.out.println(file1+ " does not exist");
//		}
	
		
	}
	
}
