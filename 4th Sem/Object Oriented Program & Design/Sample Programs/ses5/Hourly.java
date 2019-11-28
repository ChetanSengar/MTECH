package wims_2017.ses5;

public class Hourly {

	public String name;
	public String address;
	public int SSN;
	public int number;
	public float hourlyRate;
	public float hoursWorked;
	public void mailCheck()
	{
	System.out.println("Mailing a check to " + name  + " " + address);
	}
	public float computePay()
	{
	return (float) hoursWorked * hourlyRate;
	}
}
