package wims_2017.ses5;

public abstract class Bike {

	//Constructor
	Bike(){
			System.out.println("bike is created");
		}  
	
		//Abstract Method
	   abstract void run();  
	   
	   //Regular Method
	   void changeGear(){
		   	System.out.println("gear changed");
		   	}  
}
