/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserverchatbox;

import java.io.*;
import java.net.Socket;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author CH954245
 */

public class Client
{
  public static void main(String[] args) throws Exception
  {
     Socket sock = new Socket("127.0.0.1", 3000); //sock will never be close as it'll be a continuous communication.
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss , dd/MM/yyyy");
     LocalDateTime now = LocalDateTime.now();                          
     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));// reading from keyboard.                         
     OutputStream ostream = sock.getOutputStream(); // sending to client.
     PrintWriter pwrite = new PrintWriter(ostream, true);                    
     InputStream istream = sock.getInputStream();// receiving from server.
     BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
     System.out.println(dtf.format(now) + " >> ");
     String receiveMessage, sendMessage;               
     while(true)
     {
        sendMessage = keyRead.readLine();  // keyboard reading
        pwrite.println(sendMessage);       // sending to server
        pwrite.flush();                    // flush the data
        if((receiveMessage = receiveRead.readLine()) != null) //receive from server
        {
            System.out.println("Server: "+receiveMessage); // displaying message.
        }         
      }               
    }                    
}        
