package wims_2017.ses5;

class HourlyWorker extends Worker {
	private int hoursWorked;

	public HourlyWorker(String name, int hoursWorked) {
		super(name, hoursWorked);
		this.hoursWorked = hoursWorked;
	}

	public double computePay() {
		return super.getRate() * hoursWorked;
	}


	public String toString() {
		return super.toString() + " ---> " + "HourlyWorker [hoursWorked = " + hoursWorked + "]" + " Payment received = "
				+ computePay();
	}
}

