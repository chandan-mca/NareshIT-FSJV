/**
 * 26. Develop a program to read object data from the file 
 * 
 * 
 * De-serialization
 * ================
 * 1. The process of reading object data from the file restoring in the object inside JVM 
 *     is called deserialization
 *     
 * 2. The deserialization operation is performed by ObjectInputStream class readObject() method
 * 
 * 3. The ois.readObject() method performs deserialization by falling below steps
 * 		1. It reads the class name from the serialized file
 *         and loads this class into the JVM
 *   
 * 		2. It compares the serialVersionUID number of this loaded class 
 *         with the serialVersionUID number available in the .ser file
 *         
 *      3. If both are not same it throws exception InvalidClassException
 *         and terminates deserialization process
 *         
 * 		4. If both values are same, it creates object from this loaded class with 
 *         all non static fields available in this loaded class
 *         
 *      5. It reads field name available in the object, searches this field in the .ser file, 
 *             if found, reads its value from the file and stores in this object
 *             if not found, stores default value based on this field type     
 *               
 * 4. Rule: To complete deserialization the .class file byte code must be equal to the 
 *    .class file byte code which was used for serialization. After a serialization if we 
 *    modify the class either by add new fields or methods (or) removing existing fields 
 *    or methods, new serialVersionUID is generated, the deserialization process is failed
 *    
 * 5. To continue deserialization  even though we adding or removing the class members,
 *    we must add serialVersionUID variable in the Student class by ourserlf
 *    
 * 6. Rule: If a class is implementing Serializable interface, this class must contain 
 *    serialVersionUID variable to allow adding or removing this class members and to continue 
 *    deserialization. If we donot create serialVersionUID variable, not CE, but we will get
 *    exception InvalidClassException in deserizalization if we modify the class after 
 *    serialization.  
 *       
 *            
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test08_OIS {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//connecting to object.ser file
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
		
		//reading object (performing de-serialization)
		Object obj = ois.readObject();
		System.out.println("Student object is constructed its data is restored\n");
		
		System.out.println(obj);
		
		Student s1 = (Student)obj;
		System.out.println(s1.getFee());
	}
}
