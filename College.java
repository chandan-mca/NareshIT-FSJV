//College.java
class College {
	public static void main(String[] args) {
		
		Student s1 = new Student();			
		System.out.println("Student object1 is created");
		System.out.println("\ns1 object values before initialization");
		s1.display(); //0 null null 0.0
     
	    s1.setSno(101);					//s1 object initialization
		s1.setSname("HK");				//via setter methods
		s1.setCourse("CJ");
		s1.setFee(2500);

		System.out.println("\ns1 object values after initialization");
		s1.display(); //101  HK   CJ   2500.0

		System.out.println();
	////////////////////////////////////////////////////////////////////////////////////////
		Student s2 = new Student(102, "Balayaa", "Acting", 3500);			
		System.out.println("Student object2 is created with passed values");
	
		System.out.println("\ns2 object values");
		s2.display(); //102 Balayya Acting 3500

		s2.setCourse(s2.getCourse() + ", Politics");
		s2.setFee(s2.getFee() + 5000);

		System.out.println("\ns2 object values after modification");
		s2.display(); //102 Balayya Acting, Politics 8500


	}
}
