package wims_2017.ses5;

public class Emp {
	
	public String name;
	public String address;
	public int SSN;
	public int number;
	public float salary;
	
	
	public void mailCheck()
	{
		System.out.println("Mailing a check to " + name + " " + address);
	//	System.out.println("Inside Employee mailCheck: " + (String) super.toString());
	//	System.out.println("Mailing a check to " + this.name + " " + this.address);
	}

}
