import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test16_ReadLineFromKB_BR {
	public static void main(String[] args) throws IOException {
		
		//BufferedReader br = new BufferedReader(System.in); 
								//BR can not connect to InputStream directly
								//because BR takes 1 byte as 2 bytes range value 
								//System.in returns 1 byte as 1 byte range value
								//we need a converted or bridge class
								//InputStreamReader class
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter data: ");
		String data = br.readLine();
		System.out.println(data);
		
	}
}
