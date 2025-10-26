/*
 * Java 15v new feature: Text Block Triple quotes("""   lines  """)
 * 
 * Details article by Oracle Corporation
 * 	https://openjdk.org/jeps/378
 */

public class Test07_newFeature_TextBlock {
	public static void main(String[] args) {
				
		//Before Java 13v
		String s1 = "one line of text";
		System.out.println(s1);
		
		String s2 = 
					"line1" +
					"line2" +
					"line3"; 
		System.out.println(s2);
	
		s2 = 
					"line1\n" +
					"line\n" +
					"line3\n"; 
		System.out.println(s2);
								
		String s3 = 
					"SELECT * FROM EMP WHERE eno=101 AND ename='HK' course='CJ'";
		System.out.println(s3);
				
		String s4 = 
				"SELECT * "			+
				"FROM EMP "			+
				"WHERE eno=101 "	+
				"AND ename=\"HK\" "	+
				"AND course='CJ'"	;
		System.out.println(s4);
		
		String s5 = 
				"<HTML>" +
						"<HEAD>" + 
							"<TITILE>HKProgrammignWorld</TITILE>"+
						"</HEAD>" +	
							
						"<BODY>"  +
							"Welcome to HKProgrammingWorld" +
							"Enjoy Learning Progrmming" +
						"</BODY>" +
				"</HTML>";
		System.out.println(s5);
			
		String s6 = 
				"<HTML>\n" +
						"\t<HEAD>\n" + 
							"\t\t<TITILE>HKProgrammignWorld</TITILE>\n"+
						"\t</HEAD>\n\n" +	
						
						"\t<BODY>\n"  +
							"\t\tWelcome to HKProgrammingWorld\n" +
							"\t\tEnjoy Learning Progrmming\n" +
						"\t</BODY>\n" +
				"</HTML>";
		System.out.println(s6);
		
		
		System.out.println();
		//=======================================================
		//From Java 13v onwards we got new style creating String literal
		//that be Text Block  -> """ multiple lines """
		
		//In Java 13v and 14v it is a 'preview' feature
		//From Java 15v onwards it is made as permanent
		//we can use it in project.
		
			String s7 =
				"""
				Multiple lines
				""";
			System.out.println(s7);	
						
			String s8 = 
					"""
					SELECT eno, ename, sal, dept 
					FROM EMP 			
					WHERE eno=101 	
					AND ename="HK" 	
					AND course='CJ'
					""";
			System.out.println(s8);	

			String s9 = 
					"""
					<HTML>
						<HEAD> 
							<TITILE>HKProgrammignWorld</TITILE>
						</HEAD> 	
								
						<BODY>
							Welcome to HKProgrammingWorld
							Enjoy Learning Progrmming
						</BODY>
					</HTML>
					""";	
			System.out.println(s9);
			
			
			String s10 = 
					"""
						''
					""";
			String s11 = 
					"""
						""
					""";
			
//			String s12 = 
//					"""
//						"""
//					""";
			
//					String s13 = 
//					"""
//						"""
//						"""
//					""";
					
					
//			String s14 = """   """;
					
				
//			String s13 = """  \n """;

			String s13 = """  
					
					 	""";

			System.out.println();
			System.out.println();
			System.out.println();

			String s14 = 
					"""
					<HTML>
						<HEAD> 
							<TITILE>HKProgrammignWorld</TITILE>
						</HEAD> 	
								
						<BODY>
							Welcome to HKProgrammingWorld
							Enjoy Learning Progrmming
						</BODY>
					</HTML>
					""";	
			
			java.util.stream.Stream<String> lines = s14.lines();
			lines.forEach( line -> System.out.println(line) );
			System.out.println();
			
			s14.lines()
				.filter(line -> !line.contains("<") )
				.forEach(line -> System.out.println(line.trim()) );
/**/			
	} 
}