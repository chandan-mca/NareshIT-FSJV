import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test14_ModifyFile {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader(new FileReader("dbc.txt"));
		
		StringBuilder fileBuilder = new StringBuilder();
		
		while(br.ready()) {
			fileBuilder.append(br.readLine() + "\n");
		}
		
		fileBuilder.deleteCharAt(fileBuilder.lastIndexOf("\n"));

		String modifiedFileData = 
				fileBuilder.toString().replace("abc", "xyz");
		
		FileWriter fw = new FileWriter("dbc.txt");
		fw.write(modifiedFileData);
		fw.flush();
		
		br.close();
		fw.close();
		
		System.out.println("File is modified");
	}
}
