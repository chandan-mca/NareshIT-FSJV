import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test13_FileCopy_Filter {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader(new FileReader("dbc.txt"));
		
		FileWriter fw = new FileWriter("ebc.txt"); 
		
		String line;
		while((line = br.readLine()) != null) {
			//if(line.contains("abc"))
			//if(line.startsWith("abc"))
			if(line.endsWith("abc"))
				fw.write(line + '\n');
		}
		
		System.out.println("file copied");
		
		br.close();
		fw.close();
		
	}
}
