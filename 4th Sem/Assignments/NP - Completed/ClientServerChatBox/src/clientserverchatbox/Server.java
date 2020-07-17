/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserverchatbox;

import java.io.*;
import java.net.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author CH954245
 */

public class Server
{
  public static void main(String[] args) throws Exception
  {
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss , dd/MM/yyyy");
      LocalDateTime now = LocalDateTime.now();
      ServerSocket ssocket = new ServerSocket(3000); //ssocket will never be close as it'll be a continuous communication.
      System.out.println(dtf.format(now) + " >> ");
      Socket socket = ssocket.accept( );                          
      BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
	    // sending
      OutputStream ostream = socket.getOutputStream(); 
      PrintWriter pwriter = new PrintWriter(ostream, true);
 
      // receiving.                        
      InputStream istream = socket.getInputStream();
      BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
      String receiveMessage, sendMessage;               
      while(true)
      {
        if((receiveMessage = receiveRead.readLine()) != null)  
        {
           System.out.println("Client : "+receiveMessage);         
        }         
        sendMessage = breader.readLine(); 
        pwriter.println(sendMessage);             
        pwriter.flush();
      }               
    }                    
}                        
