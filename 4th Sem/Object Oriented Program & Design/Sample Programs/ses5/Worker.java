package wims_2017.ses5;

abstract class Worker {
	private String name;
	private double salaryRate;

	Worker(String name, double rate) {
		this.name = name;
		this.salaryRate = rate;
	}

	public String getName() {
		return name;
	}

	public double getRate() {
		return salaryRate;
	}

	
	public String toString() {
		return "Worker [name = " + name + ", salaryRate = " + salaryRate + "]";
	}

	public abstract double computePay();

}
