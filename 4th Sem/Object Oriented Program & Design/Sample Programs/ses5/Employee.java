package wims_2017.ses5;

public class Employee {
	
	public String name;
	public String address;
	public int SSN;
	public int number;
	public float salary;
	
	
	public void mailCheck()
	{
	System.out.println("Mailing a check to " + name + " " + address);
	}
	
	/* 
	 * What about employees who are paid by the hour, or contractors who are paid by the day, 
	 * or those in 	other situations where an employee is not paid by n annual salary? 
	 * Perhaps 	the Employee class needs further analysis.
	*/
	
	public float computePay()
	{
	return (float) ((float) salary/52.0);
	};
	
	/* 
	 * tempting fix for this situation is to add a Boolean field to the Employee class named 
	 * isSalary that is true for salary employees and false for hourly employees.
	 */
	
	public float computePay(boolean isSalary) {
	if(isSalary)
	{
	//Perform arithmetic for salaried employee
	}
	else
	{
	//Perform arithmetic for hourly employee
	}
	return 1;
	}
	
	/* 
	 * If you use a field to determine the type of an object, your end result is a class that looks object-oriented but is really procedural. 
	 * For example, an Employee object will need to check this added Boolean field just to know what type of object it is, causing the design of 
	 * the program to not be focused on objects
	 */

}
