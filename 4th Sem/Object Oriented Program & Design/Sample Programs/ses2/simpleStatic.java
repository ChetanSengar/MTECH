package wims_2017.ses2;

public class simpleStatic {
	static int i; 
	int j; 
	
	// start of static block 
	static { 
		i = 10; 
		System.out.println("Simple static block called "); 
	} 
}
