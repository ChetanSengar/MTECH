/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserverchatbox;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.*;

/**
 *
 * @author CH954245
 */
public class Server
{
  public static void main(String[] args) throws Exception
  {
      ServerSocket ssocket = new ServerSocket(3000);
      System.out.println("Server  ready for chatting");
      Socket socket = ssocket.accept( );                          
                              // reading from keyboard (breader object)
      BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
	                      // sending to client (pwrite object)
      OutputStream ostream = socket.getOutputStream(); 
      PrintWriter pwriter = new PrintWriter(ostream, true);
 
                              // receiving from server ( receiveRead  object)
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
