package wims_2017.ses5;

public class Salary {

	public String name;
	public String address;
	public int SSN;
	public int number;
	public float salary;
	
	public void mailCheck()
	{
	System.out.println("Mailing a check to " + name 	+ " " + address);
	}
	public float computePay()
	{
	return (float) salary/52;
}
}
