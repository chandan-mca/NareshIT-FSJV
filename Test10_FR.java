import java.io.FileReader;
import java.io.IOException;

public class Test10_FR {
	public static void main(String[] args) throws IOException {
		
		FileReader fr  = new FileReader("cbc.txt");
		int data;
		while((data=fr.read()) != -1) {
			System.out.println(data   + "  " + (char)data  );
		}
	}
}
