import java.io.File;

/**
Q) How FileInputStream and FileOutputStream classes can check whether given file is existed or not? Also how FileOutputStream class can create file if the given file is not existed? 
   These two classes internally use File class.

File class
==========
This class is used to represent files and directory paths. 
It does not represent the file data. 
The file data is represented by FileInputStream and FileOutputStream. 
Basically this class is used to create, delete, files and directories and 
also used to know about the files and directory information like, given file name represents 
file or directory, type of the file read-only or writable, last modified, etc… 

Instances of the File class are immutable. 
Once we create its object with a file path we never change it.
We do not have setter method to change the file name in this File object. 
But we have getter method to get the file information.

File class constructors
=======================
File class has below constructors to create its object.

1. File(String pathName)
2. File(String parent, String child)
3. File(File parent, String child)
4. File(URI uri)

*/
public class Test18_FileClass_Constructors {
	public static void main(String[] args) {
		
		File file1 = new File("xyz.txt");
		System.out.println("file1: "+ file1);
		
		File file2 = new File("abc", "xyz.txt");
		System.out.println("file2: "+ file2);
		
		File file3 = new File("bbc");
		System.out.println("file3: "+ file3);
		
		File file4 = new File(file3, "pqr.txt");
		System.out.println("file4: "+ file4);
		
		File file5 = new File(file3, "cbc");
		System.out.println("file5: "+ file5);
		
	}
}

