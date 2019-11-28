package wims_2017.ses5;

public class TestWorker {
	public static void main(String[] args) {
		
		Worker hrWorker1 = new HourlyWorker("Shaina",150);
		Worker hrWorker2 = new HourlyWorker("Dennis", 250);
		System.out.println(hrWorker1);
		System.out.println(hrWorker2);
		hrWorker1.computePay();
	}
}
