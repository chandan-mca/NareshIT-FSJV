import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test05_DIS {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		DataInputStream dis = 
				new DataInputStream(new FileInputStream("data.txt"));
		
		System.out.println(dis.read());
		System.out.println(dis.readByte());
		
		System.out.println(dis.readByte());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readUTF());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readUTF());
		
		DataInputStream dis2 = 
				new DataInputStream(new FileInputStream("abc.txt"));
		
		System.out.println(dis2.readLine());
		System.out.println(dis2.readLine());
		System.out.println(dis2.readLine());
		
	}
}
