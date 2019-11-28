package wims_2017.ses5;

public class Sal extends Emp {
	
	public float salary; //Annual salary
	
	public float computePay()
	{
		System.out.println("Computing salary pay for " + name);
		return salary/52;
	}
}
