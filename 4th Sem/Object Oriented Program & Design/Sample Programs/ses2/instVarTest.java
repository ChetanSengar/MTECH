package wims_2017.ses2;

public class instVarTest {
	String myClassVar="Instance variable";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instVarTest svt1  = new instVarTest();
		instVarTest svt2 =  new instVarTest();
		instVarTest svt3  = new instVarTest();
		
		//Initial Check to print the class variable
		System.out.println("Before Changes");
		System.out.println(svt1.myClassVar);
		System.out.println(svt2.myClassVar);
		System.out.println(svt3.myClassVar);
		
		//Change the value of static variable using svt2
		
		svt2.myClassVar ="Changed Text";
		
		System.out.println("After Changes");
		System.out.println(svt1.myClassVar);
		System.out.println(svt2.myClassVar);
		System.out.println(svt3.myClassVar);
		
		
	}

}
