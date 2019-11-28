package wims_2017.ses2;

public class errEx {
	private int var;
	
	public errEx(int num) {
		var=num;
	}
	public int getValue() {
		return var;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		errEx errX = new errEx(3);
		System.out.println("Value of var is " + errX.getValue());
	}

}
