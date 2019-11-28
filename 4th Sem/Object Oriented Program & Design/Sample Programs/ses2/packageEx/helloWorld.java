package wims_2017.ses2.packageEx;

public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int cntr =1 ;
		while (flag){
			System.out.println("Hello World This is a First Output:" + cntr);	
			cntr+=1;
			if (cntr > 100) {
				flag=false;
			}
		}
}
}