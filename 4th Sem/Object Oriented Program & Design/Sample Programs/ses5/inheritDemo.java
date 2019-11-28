package wims_2017.ses5;

public class inheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Instantiating an Regular Employee");
			Emp e = new Emp();
			e.name = "Arun Vadekkedhil";
			e.address = "Baner, Pune";
			e.SSN = 111009798;
			e.number = 1;
		
		System.out.println("Instantiating a Salaried Employee");
			Sal s = new Sal();
			s.name = "Jane Smith";
			s.address = "222 Oak Drive";
			s.SSN = 111009999;
			s.number = 2;
			s.salary = 100000.00F;
			
		System.out.println("Instantiating an Hourly Employee");
			Hour h = new Hour();
			h.name = "George Washington";
			h.address = "333 Espresso Lane";
			h.SSN = 111990000;
			h.number = 3;
			h.hourlyRate = 120.75F;
			h.hoursWorked = 50;
			
		System.out.println("Paying employees");
			//e.computePay(); //Does not compile!
			System.out.println(s.number + " " + s.computePay());
			System.out.println(h.number + " " + h.computePay());
			
			System.out.println("Mailing checks");
				e.mailCheck();
				s.mailCheck();
				h.mailCheck();
		}
		
	}


