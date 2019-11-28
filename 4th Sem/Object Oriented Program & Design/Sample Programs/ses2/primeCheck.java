package wims_2017.ses2;
import java.util.*;
public class primeCheck {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long temp, i;
		boolean isprime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number");
		Long num=scan.nextLong();
		scan.close();
		
		for(i=(long) 2;i<num/2;i++);
		{
			temp=num%i;
			if(temp==0) 
				isprime =false;
		//break;		
		}
		if (isprime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
				
		
	}

}
