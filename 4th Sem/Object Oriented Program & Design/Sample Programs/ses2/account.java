package wims_2017.ses2;

public class account {
	
	int a;
	int b;
	
	public void setamt(int a, int b) {
		a=a;
		b=b;

		/*this.a=a;
		this.b=b;*/
		
	}

	public void showData() {
		System.out.println("Value of A is : " + a);
		System.out.println("Value of B is : " + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			account obj = new account();
			obj.setamt(10, 20);
			obj.showData();
				
		}
		
	}


