package wims_2017.ses3;
import java.util.Arrays;
import wims_2017.ses2.*;
public class sortArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] my_array1 = {
							1789, 2035, 1899, 1456, 2013, 
							1458, 2458, 1254, 1472, 2365, 
							1456, 2165, 1457, 2165, 1457, 
							2456, 3124, 2345, 7865, 1212
							};
		String [] my_array2 = 
						{"Java", "Python", "PHP", 
						"C#", "C Programming", "C++"
						};
		
		// Sample Example for Creating Objects
		Bicycle bike1 = new Bicycle("BTWINN");
		Bicycle bike2 = new Bicycle("HERO");
		Bicycle bike3 = new Bicycle("ATLAS");
		Bicycle bike4 = new Bicycle("CONCORD");
		Bicycle bike5 = new Bicycle("HERCULES");
		
		
		
		Bicycle [] my_array3 = {bike1, bike2,bike3,bike4,bike5};
		System.out.println("\n =============================================================");
		System.out.println("Original Numeric Array :" + Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Sorted Numeric Array :" + Arrays.toString(my_array1));
		
		System.out.println("\n =============================================================");
		System.out.println("Original Character Array :" + Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("Sorted Character Array :" + Arrays.toString(my_array2));

		System.out.println("\n =============================================================");
		System.out.println("Original Object Array :" + Arrays.toString(my_array3));
		
		// Using the Extended For 
		System.out.println("Printing using Extended For ====================================");
		for (Bicycle mybikes: my_array3) {
			
			mybikes.printStates();
		}
		
		System.out.println("Printing using Normal For =======================================");
		for (int i=0; i< 5;i++) {
			my_array3[i].printStates();
		}
	}
	

}
