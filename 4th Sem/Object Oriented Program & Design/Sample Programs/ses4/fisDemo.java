package wims_2017.ses4;
import java.io.*;

public class fisDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int size;
		InputStream in = new FileInputStream("D:\\fisDemo.txt");
		
		//Print the Size of the file
		
		System.out.println("Total Available Bytes: " + (size = in.available()));
		
		int n = size/40; // Lets read n bytes at a time 
		
		System.out.println("First " + n + " bytes of the file one read() at a time");
		for (int i=0; i < n; i++) {
			System.out.print((char) in.read());
			
		}
		
		//Check the remaining  bytes available
		System.out.println("\n Still Available Bytes: " + (in.available()));
		
		//Read Next using bytes
		System.out.println("First " + n + " bytes of the file one readb[] at a time");
		
		byte [] b = new byte[n];
		if (in.read(b) !=n) {
			System.err.println("Couldn't Read : " + n + " bytes");
		}
		
		System.out.println("This is the O/P of Bytes Read : " + new String (b,0,n));
		
		//Check the remaining  bytes available
		System.out.println("Still Available Bytes: " + (size = in.available()));
		
		//Skipping half
		in.skip(size/2);
		
		System.out.println("Still Available Bytes (After Skip) : " + (in.available()));
		
		System.out.println("Reading " +  n/2 + " into the byte array");
		
		if (in.read(b, n/2,n/2) !=n/2) {
			System.err.println("Couldn't Read : " + n/2 + " bytes");
		}
		
		System.out.println("This is the O/P of n/2 Bytes Read : " + new String (b,0,b.length));
		
		//Check the remaining  bytes available
		System.out.println("Still Available Bytes: " + (size = in.available()));	
		in.close();
				
	}
	
	

}
