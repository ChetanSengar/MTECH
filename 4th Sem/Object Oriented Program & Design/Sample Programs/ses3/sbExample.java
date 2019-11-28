package wims_2017.ses3;

public class sbExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println("After Insert Operation : ==> " + sb);//prints ??
		
		//Append Method
		
		sb.insert(1,"Java");//now original string is changed  
		System.out.println("After Append Operation : ==> " + sb);//prints ??
		
		// Replace Method
		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints ?? 
	}

}
