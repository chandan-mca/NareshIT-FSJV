import java.io.FileWriter;
import java.io.IOException;

public class Test09_FW {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("cbc.txt");
		
		fw.write('a');
		fw.write(98);
		fw.write(260);
		fw.write(65000);
		fw.write(66000);
		
		fw.write("Hari");
		
		fw.flush();
		fw.close();
		
		System.out.println("data is saved");
		
	}
}
