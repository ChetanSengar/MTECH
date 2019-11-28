package wims_2017.ses2;

public class passObjs {
	int a,b;
	
	passObjs(int i, int j) {
		a = i;
		b=j;			
				
	}
	
	//retrun true if o is equal to the invoking object
	boolean equalTo(passObjs o) {
		if (o.a==a && o.b==b) return true;
		else return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		passObjs ob1 = new passObjs(100, 22);
		passObjs ob2 = new passObjs(100, 22);
		passObjs ob3 = new passObjs(-1, -1);
		
		System.out.println("ob1== ob2 " + ob1.equalTo(ob2));
	}
	

}
