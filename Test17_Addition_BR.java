import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test17_Addition_BR {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter FNO: ");
		int a = Integer.parseInt(br.readLine()); //"10" => 10
		
		System.out.print("Enter SNO: ");
		int b = Integer.parseInt(br.readLine()); //"20" => 20
		
		int c = a + b;
		System.out.println("Result: " + c);
	}
}
