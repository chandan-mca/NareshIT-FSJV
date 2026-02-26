import java.io.File;

public class Test24_fileSeparator {
	
	public static void main(String[] args) {
		
		//for Windows 	file separator is \
		//for Linux 	file separator is /
		
		//File file = new File("D:\abc\xyz\empnames.txt");	CE:
		
		File file1 = new File("D:\\abc\\xyz\\empnames.txt");	//no CE, but it OS dependent
		System.out.println(file1);
		
		//do not use \ or /, use File class provided static field 'separator'
		System.out.println(File.separator);
		
		String fs = File.separator;
		
		File file2 = new File("D:"+fs+"abc"+fs+"xyz"+fs+"empnames.txt");	//no CE, it OS independent
		System.out.println(file2);
		
		File file3 = new File(String.format("D:%sabc%sxyz%sempnames.txt",fs,fs,fs));	//no CE, it OS independent
		System.out.println(file3);
		
	}
}
