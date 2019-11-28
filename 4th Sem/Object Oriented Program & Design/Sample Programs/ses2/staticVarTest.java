package wims_2017.ses2;

public class staticVarTest {
	public static String myClassVar="class or static variable";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVarTest svt1  = new staticVarTest();
		staticVarTest svt2 =  new staticVarTest();
		staticVarTest svt3  = new staticVarTest();
		
		//Initial Check to print the class variable
		
		System.out.println(svt1.myClassVar);
		System.out.println(svt2.myClassVar);
		System.out.println(svt3.myClassVar);
		
		//Change the value of static variable using svt2
		
		svt2.myClassVar ="Changed Text";
		
		System.out.println(svt1.myClassVar);
		System.out.println(svt2.myClassVar);
		System.out.println(svt3.myClassVar);
		
		
	}

}
