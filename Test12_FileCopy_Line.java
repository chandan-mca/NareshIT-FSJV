import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test12_FileCopy_Line {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader(new FileReader("dbc.txt"));
		
		FileWriter fw = new FileWriter("ebc.txt"); 
		
		String line;
		while((line = br.readLine()) != null) {
			fw.write(line + '\n');
		}
		
		System.out.println("file copied");
		
		br.close();
		fw.close();
		
	}
}
