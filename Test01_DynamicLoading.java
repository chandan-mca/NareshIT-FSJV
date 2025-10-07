import java.util.Scanner;
class Test01_DynamicLoading {
	public static void main(String[] args) 
						throws ClassNotFoundException,
								InstantiationException,
							   	IllegalAccessException {

		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter class name: ");
		String clsName = scn.next();	//here, the class name is reading 
										//and storing in program as String object
		
		Class cls = Class.forName(clsName);		//here, ClassLoader 
		System.out.println();				//1. searches given class's .class file
										//2. if found, creates class Class instance, 
								//3. loads given class bytecode in this Class instance, 
							//4. executes SVs and SBs from this loaded class and 
						//5. makes this class ready to be instantiated and executed.
					//6. then finally java.lang.Class instance reference is 
				//returned and stored in cls variable.

		Object obj = cls.newInstance();		//1. here, the loaded class 
		System.out.println();				//object is created
								//2. NSV memory is allocated, instance blocks 
								//and No-param constructor are executed	
						//3. then this loaded class's newly created object 
						//reference is returned and stored in obj variable

		System.out.println(obj);						
	}
}


//Rules: 
   //#1: We must compile the loading class explicitly, else 
   //Class.forName(-) throws ClassNotFoundException, because
   //auto compilation will not work here, because the loading class name 
   //is not used explicitly inside this Test class, 
   //hence compiler will not compile it, we must compile it explicitly
			//-> TestCase #1: Delete A.class then run Test class

   //#2: The loading class must contain no param constuctor or 
   //default constructor, else newInstnace() method throws 
   //InstantiationExcepiton, becuase it internally invokes  
   //no-param constructor for creating object.
			//-> Test Case #2: In class A comment no-param constructor, 
			//					then run Test class

   //#3: The no-param constructor must be visible, means must not be private. 
   //if it is declared as private, newInstance() method throws IllegalAccessException, 
   //becuase it internally invokes no-param constructor for creating object.
			//-> Test Case #3: In class A uncomment no-param constructor
							   //declare it as private, then run Test class
