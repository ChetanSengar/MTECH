package wims_2017.ses2;

public class staticClause {

	static int counter;
	// Initializer block starts.. 
    { 
        // This code is executed before every constructor. 
    	System.out.println("Common part of constructors invoked !!. Objects Created Count is : " + counter); 
        counter+=1;
    } 
    // Initializer block ends 
    
		static int i; 
		int j; 
		
		// start of static block 
		static { 
			i = 10; 
			System.out.println("static block called "); 
		} 
		
		// end of static block 
		// Let add a Constructor to make things more clear
		
		public staticClause() {
			System.out.println("Hello there, You Have reached the no-args Constructor");
		}
	
}
