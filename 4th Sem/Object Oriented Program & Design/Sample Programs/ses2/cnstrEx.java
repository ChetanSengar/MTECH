package wims_2017.ses2;

public class cnstrEx {
	int age ;
	String name ;

	//This is the default constructor (no-args)
	
	cnstrEx() {
		this.name="Arun Vadekkedhil";
		this.age= 25;
		
	}
	
	//Parameterized Constructor
	cnstrEx(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lets Construct
		
		cnstrEx cex1 = new  cnstrEx();
		cnstrEx cex2 = new cnstrEx("Shyam Gopal", 35);
		
		System.out.println(cex1.name + " " + cex1.age);
		System.out.println(cex2.name + " " + cex2.age);
	}

}
