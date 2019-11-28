package wims_2017.ses3;

public class strChk {

	String s1 = "Cat";
	String s2 = "Cat";
	String s3 = new String ("Cat");
	String s4 = new String();
	String s5 = new String();
	
	String av1 = "Arun";
	String av2 ="arun";
	String av3 = "ArUn";
	String av4 = "Arun";
	
	void strcpr() {
		
		
		System.out.println("STRING COMPARISON USING compareTo() (LEXICAL COMPARISON)");
		
		System.out.println("AV1 Compares to AV2 : " + av1.compareTo(av2));
		System.out.println("AV1 Compares to AV2 : " + av2.compareTo(av3));
		System.out.println("AV1 Compares to AV4 : " + av1.compareTo(av4));
		
		System.out.println("s1 Compares to s2 : " + s1.compareTo(s2));
		System.out.println("s1 Compares to s3 : " + s1.compareTo(s3));
		
		System.out.println("s2 Compares to s3 : " + s2.compareTo(s3));
		System.out.println("s4 Compares to s5 : " + s1.compareTo(s2));
	}
	
	 void strCmp() {
			
		System.out.println("STRING COMPARISON USING == (REFERENCE COMPARISON)");
		System.out.println("s1==s2 : " + (s1==s2));
		System.out.println("s1==s3 : " + (s1==s3));
		System.out.println("s2==s3 : " + (s2==s3));
		System.out.println("s4==s5 : " + (s4==s5));
	}
	
	void strEq() {
	 
		System.out.println("STRING COMPARISON USING .EQUALS (EQUALITY COMPARISON)");
		System.out.println("s1 EQUALS s2 : " + (s1.equals(s2)));
		System.out.println("s1 EQUALS s3 : " + (s1.equals(s3)));
		System.out.println("s2 EQUALS s3 : " + (s2.equals(s3)));
		System.out.println("s5 EQUALS s4 : " + (s5.equals(s4)));
		System.out.println("s4 EQUALS s5 : " + (s4.equals(s5)));
	}
	
	
	public void strProc() {
		
		strCmp();
		strEq();
		strcpr();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Use the == Operator
		strChk sobj1 = new strChk();
		sobj1.strProc();
		
			
		//Another example
		
		String s = "Sachin";
		System.out.println("Now the value of String Object s is : " + s);
		//s.concat(" Tendulkar ");
		s = s.concat(" Tendulkar ");
		System.out.println("After Concatenation, value of s is : " + s);
		//System.out.println("After Concatenation, value of s4 is : " + s4);
		
		}

}
