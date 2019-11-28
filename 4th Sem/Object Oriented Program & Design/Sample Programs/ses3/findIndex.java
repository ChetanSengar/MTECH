package wims_2017.ses3;
import java.util.Arrays;
public class findIndex {

	public static int fndIdx(int[] my_array, int t) {
		if (my_array == null ) return -1;
		int len = my_array.length;
		int i = 0;
		while (i< len) {
			if (my_array[i] == t) return i;
			else i=i+1;
			
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array = { 1,5,7,11,23,25,28,33,36,39,40,43,45,35,50,60,100};
		System.out.println("Index position of 25 is : " + fndIdx(my_array, 25));
		System.out.println("Index position of 101 is : " + fndIdx(my_array, 101));
		}

	}

