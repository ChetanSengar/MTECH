package wims_2017.ses4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyBytes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("C:\\Users\\vadek\\OneDrive\\Documents\\AVEES-Local\\workspace\\WIMS\\src\\wims_ses4\\wims.txt");
			out = new FileOutputStream("C:\\Users\\vadek\\OneDrive\\Documents\\AVEES-Local\\workspace\\WIMS\\src\\outagain.txt");
			int c;
			
			while ((c = in.read())!= -1) {
				out.write(c);
			}
					
		}finally {
			if (in != null) {
				in.close();
			}
			if(out !=null) {
				out.close();
				
			}
		}
				

	}

}
