package wims_2017.ses2;

public class BicycleDemo {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	//Declare Objects
		Bicycle mybike1, mybike2, mybike3;
		
	//Instantiate Objects
		mybike1 = new Bicycle();
		
	//Set Values for Bike1
		mybike1.setName("Hercules");		// No-args Constructor        
		mybike1.setGear(4);
		mybike1.setSpeedUp(10);
		//mybike.counter = 1;               // Incorrect way of accessing static variable
		//Bicycle.counter = 1;				// Correct way of accessing Static variable. 
											// Use the Parent reference not Obj Reference
		
	//Set Values for Bike2
		mybike2 = new Bicycle("Atlas");   	// Parameterized constructor
		//mybike2 = new Bicycle();
		mybike2.setName("Atlas");
		mybike2.setGear(2);
		mybike2.setSpeedUp(40);
		mybike2.setSpeedDn(10);
		
	//Assign bike2 to bike 3 (Sharing of Objects. Here both mybike2 & mybike3 refer to the same object)
		mybike3 = mybike2;
		
		mybike3.setName("BTWINN"); 			// A simple test to see what happens when we use object reference
											// We are changing the name of object mybike3, but since it is shared
											// Changes done here will be reflected in the mybike 2 object as well
	//Print the states of all objects 	
		mybike1.printStates();
		mybike2.printStates();
		mybike3.printStates();

		//mybike2.setName("Atlas");
		//System.out.println("Parameters for Object Bicycle 1 " + mybike1.toString() + "\n");
		//System.out.println("Parameters for Object Bicycle 2 " + mybike2.toString()+ "\n");
		//System.out.println("Parameters for Object Bicycle 3 " + mybike3.toString()+ "\n");
	}

}
