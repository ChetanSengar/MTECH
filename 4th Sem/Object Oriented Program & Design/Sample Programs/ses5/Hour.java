package wims_2017.ses5;

public class Hour extends Emp {

	public float hourlyRate; //Pay rate
	public float hoursWorked; //Weekly hours worked
	
	public float computePay()
	{
		System.out.println("Computing hourly pay for " + name);
		float pay = 0.0F;
	
		if(hoursWorked <= 40)
		{
			pay = hourlyRate * hoursWorked;
		}
		else //Need to compute overtime
		{
			pay = (hourlyRate * 40) +
			(hourlyRate * (hoursWorked - 40) * 1.5F);
		}
		return pay;
	}
}
