package wims_2017.ses2;
/**
 * @author Arun Vadekkedhil
 * Sample program to introduces classes & Objects
 * Also covers constructors
 */
public class Bicycle {
	String name = "New Bicycle";
	int speed = 0;
	int gear = 0;
	static int counter = 0;
			
	/**
	 ** @param None
	 ** @return Default Bicycle Object
	 *  No-args constructor
	 *  Used if you want to create a bicycle object with default values only.
	 */
	//public Bicycle() {
		counter+= 1;
		System.out.println("Object ID : " + this.name + " - Creation Sequence : " + counter);
	}
	
	/**
	 * @param String "Name of the Bicycle"
	 * @return Bicycle with a name
	 * Parameterized Constructor 
	 * Used to create bicycle object with a name of users choice
	 */
	public Bicycle(String name) {
		this.name = name;
		counter+= 1;
		System.out.println("Object ID : " + this.name + " - Creation Sequence : " + counter);
	}
	
	public void setName(String name) {
		this.name= name;
		String lclVar;
		lclVar = "from SetName " + counter;
		//System.out.println("Local Variable is " + lclVar);
	}
	
	public void setSpeedUp(int newspeed) { this.speed = speed + newspeed;}
	public void setGear(int gear) {this.gear = gear;}
	public void setSpeedDn(int newspeed) {this.speed = speed - newspeed;}
	
	public void printStates() {
		System.out.println("The Current Parameters for Object ID : " + this.toString() + 
				" are as follows: \n\t Name\t\t= " + name + "\n\t Speed\t\t= " + speed + "\n\t Gear\t\t= "+ gear + "\n\t Counter\t= "+ counter + "\n");
		//counter = counter+1;
	//System.out.println("Local Variable is " + lclVar);
		
	}
	
}
 