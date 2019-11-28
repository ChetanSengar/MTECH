package wims_2017.ses4;
import java.io.*;
 
/**
 * This program demonstrates how to copy a file using the
 * FileInputStream and FileOutputStream classes with a
 * byte array as a buffer.
 * @author www.codejava.net
 */
public class copyFile {
    private static final int BUFFER_SIZE = 4096;
 
    public static void main(String[] args) {
        /*if (args.length < 2) {
            System.out.println("Please provide input and output files");
            System.exit(0);
        }*/
 
        String inputFile = "D:\\fisDemo.txt";
        String outputFile ="D:\\file1_out.txt";
        
        //String outputFile = args[1];
 
 
        try (
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
 
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
 
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}