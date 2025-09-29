/*
Q) What is the target of functional programming?
 A)	Passing a mathematical function directly as an argument to a method without 
	creating explicit class and without creating explicit object.

Q) To pass function as an argument to a method or to store function directly in 
   a variable what is required ?
 A) Functional interface 

Q) What are the different functional interfaces combinations 
   we need to develop a mathematical operation?
 A) To develop a mathematical operation we need inputs and return output 
   so the total combinations can be    
	1. without parameter and with void return type 
	2. with parameter and with void return type 
	3. without parameter and with non-void return type 
	4. with parameter and with non-void return type 
	5. with multiple parameters with void return type 
	6. with multiple parameters with non-void return type 
	
Q) Sample functional interfaces within above combination?

	@FunctionalInterface
	interface I1 {
		void m1();	
	}

	@FunctionalInterface
	interface I2 {
		void m1(int i);	
	}

	@FunctionalInterface
	interface I3 {
		int m1();	
	}
	
	@FunctionalInterface
	interface I4 {
		int m1(int i);	
	}
	
	@FunctionalInterface
	interface I5 {
		void m1(int i1, int i2);	
	}

	@FunctionalInterface
	interface I6 {
		int m1(int i1, int i2);	
	}

Q) By using above functional interfaces combinations can be perform any 
   mathematical operation , is there any limitation ?
	Yes, there is a limitation with above functional interfaces, 
	they can work with only int type argument int type return type 

Q) Then how many FIs we must define to work with different Java data types?
	We must use generic functional interface

		@FunctionalInterface
		interface I1{ 
			void m1();	
		}
		
		@FunctionalInterface
		interface I2<T>{ 
			void m1(T t);	
		}

		@Functionalnterface
		interface I3<T>{ 
			T m1();	
		}

		@FunctionalInterface
		interface I4<T>{ 
			T m1(T t);	
		}

		@FunctionalInterface
		interface I5<T, R>{ 
			R m1(T t);	
		}

		@FunctionalInterface
		interface I6<T>{ 
			void m1(T t1, T t2);	
		}

		@FunctionalInterface
		interface I7<T, U>{ 
			void m1(T t, U u);	
		}

		@FunctionalInterface
		interface I8<T, R>{ 
			R m1(T t1, T t2);	
		}

		@FunctionalInterface
		interface I9<T, U, R>{ 
			R m1(T t, U u);	
		}

Q) Are these 9 functional interfaces must be created by every developer in 
   every project in every company, is it a good programming practice ?
 A) No, These nine standard functional interfaces must be provided by Java 
   designers as part of Java software library 

Predefined functional interfaces 
=================================
 1. As part of Java 8 version for supporting functional programming, 
    common to all projects 43 predefined functional interfaces are provided 
	as part of Java library  

 2. All these 43 defined functional interfaces are provided in a package 
    called 'java.util.function' 
	
 3. The most important functional interfaces are 

	  ================================================================= 
		1. Consumer<T>	-> Parameterized     and void functional interface 
		2. Supplier<T>	-> Non-parameterized and non-void functional interface 
		3. Function<T,R>-> Parameterized     and non-void functional interface 
		4. Predicate<T>	-> Parameterized     and boolean functional interface 
	  ================================================================= 
		5. BiConsumer<T,U>	
		6. BooleanSupplier	
		7. BiFunction<T,U,R>
		8. BiPredicate<T,U>	
	  ================================================================= 
		9. UnaryOperator<T>	
	   10. BinaryOperator<T>
	  ================================================================= 
	   11. IntUnaryOperator      19. LongUnaryOperator    27. DoubleUnaryOperator   
	   12. IntBinaryOperator	 20. LongBinaryOperator   28. DoubleBinaryOperator  
	   
	   13. IntConsmer			 21. LongConsmer          29. DoubleConsmer         
	   14. IntSupplier			 22. LongSupplier         30. DoubleSupplier        
	   15. IntFunction<R>		 23. LongFunction<R>      31. DoubleFunction<R>        
	   16. IntPredicate			 24. LongPredicate        32. DoublePredicate       
	   
	   17. IntToLongFunction	 25. LongToIntFunction    33. DoubleToIntFunction  
	   18. IntToDoubleFunction	 26. LongToDoubleFunction 34. DoubleToLongFunction
	========================================================================
	   35. ToIntFunctaion<T>	 37. ToLongFunctaion<T>     39. ToDoubleFunctaion<T>    
	   36. ToIntBiFunctaion<T,U> 38. ToLongBiFunctaion<T,U>	40. ToDoubleBiFunctaion<T,U>
	========================================================================
	   41. ObjIntConsumer<T>     42. ObjLongConsumer<T>     43. ObjDoubleConsumer<T> 
	========================================================================

 4. Below program explains implementing functional interface 
    Consumer, Supplier, Function, Predicate
	
*/
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;

class Test08_Predefined_FIs {
	public static void main(String[] args) {
		
		Consumer<Integer> c1 = value -> System.out.println(value);	
		Consumer<Double>  c2 = value -> System.out.println(value);	
		Consumer<String>  c3 = value -> System.out.println(value);	
		
		Consumer<Integer> c4 = System.out::println;
		Consumer<Double>  c5 = System.out::println;	
		Consumer<String>  c6 = System.out::println;	
		
		Consumer<int[]>  c7 = value -> {
			
			for(int i=0; i<value.length; i++){
				System.out.println(value[i]);
			}
		};	

		c1.accept(10);
		c2.accept(10.0);
		c3.accept("HK");

		c4.accept(20);
		c5.accept(20.0);
		c6.accept("NiT");
		
		c7.accept(new int[]{5, 6, 7, 8, 9});
		System.out.println();
	//===========================================================
		Supplier<Integer> s1 = () -> 5;
		Supplier<Double>  s2 = () -> 6.7;
		Supplier<String>  s3 = () -> "HK";
		Supplier<int[]>   s4 = () -> new int[]{50, 60, 70, 80, 90};
		
		int		res1 = s1.get(); System.out.println(res1);
		double	res2 = s2.get(); System.out.println(res2);
		String  res3 = s3.get(); System.out.println(res3);
		int[]	res4 = s4.get(); System.out.println(java.util.Arrays.toString(res4));
		System.out.println();
	//===========================================================
		Function<Integer, String> f1 = (i) -> "function res1: "+ i;
		Function<String, Integer> f2 = (s) -> s.length();
		
		String  res5 = f1.apply(10); System.out.println(res5);
		int		res6 = f2.apply("HK"); System.out.println(res6);
		System.out.println();
	//===========================================================
		Predicate<Integer> p1 = (i) -> i<0;
		Predicate<Integer> p2 = (i) -> i%2==0;
		
		System.out.println(p1.test(-10));
		System.out.println(p1.test(10));
		
		System.out.println(p2.test(10));
		System.out.println(p2.test(15));/*
		
	//============================================================
	
		/*
		   1. Develop a LE to take an array of integers
		      add all those integers and return sum
		   
		   2. Develop a LE to take an array of integers
		      check whether it contains atleast one even number,
			  if available return true, else return false
			  
		   3. Develop a LE to return 5 Student objects
		   
		   4. Develop a LE to print sum of the fee paid by those 
		      returned 5 student objects 
		*/
	/*	
		Function<int[], Integer> sumFunction = 
								(ia) -> {
									int sum = ia[0];
									for(int i=1; i<ia.length; i++){
										sum += ia[i];
									}
									return sum;
								};
		int sum = sumFunction.apply(new int[]{5, 6, 7, 8, 9});
		System.out.println(sum);
	
	//==============================================================
		Predicate<int[]> evenPredicate = 
							(ia) -> {
								for(int i=0; i<ia.length;i++){
									if(ia[i]%2==0)
										return true;
								}
								return false;
							};
		System.out.println(evenPredicate.test(new int[]{5, 6, 7, 8, 9}));					
		System.out.println(evenPredicate.test(new int[]{5, 7,  9}));					
							
	//==============================================================
							
		Supplier<Student[]> studentSupplier = 
							() -> { 
								return new Student[] {
									new Student(101, "S1", "CJ", 3500), 	
									new Student(102, "S2", "Oracle", 2500), 	
									new Student(103, "S3", "HTML", 2500), 	
									new Student(104, "S4", "AJ", 4500), 	
									new Student(105, "S5", "Python", 4500) 	
								};
							};					
		Student[] students = studentSupplier.get();
		for(Student student: students){
			System.out.println(student);
		}
		
	//==============================================================
		Consumer<Student[]> consumer =
							(studentArray) -> {
								double totalFee = 0;
								for(int i=0; i<studentArray.length; i++) {
									totalFee += studentArray[i].getFee();	
								}
								System.out.println(totalFee);
							};
		consumer.accept(students);
							/**/
	}//main close
	
}
/*
	Develop user defined methods with FIs as parameters 
	to take LEs a arguments
*/

class Example {
	
	//this method gives values to you (method caller)
	 void m1(Consumer c){
		c.accept(5);
	}
	
	//this method taking values from you(method caller)
	void m2(Supplier s) {
		Object obj = s.get();
	}
	
	//this method gives value to you and, takes result from you 
	void m3(Function f){
		Object value = f.apply(5);	
	}
	
	//this method gives values to you and takes boolean result from you
	void m4(Predicate f){
		boolean bo = f.test(5);	
	}

}


