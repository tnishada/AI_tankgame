/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tank_client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author N
 */
public class Tank_client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO code application logic here
        
        BufferedWriter write;

Socket serversoc = new Socket("127.0.0.1", 6000);
       
write = new BufferedWriter(new OutputStreamWriter(serversoc.getOutputStream()));
write.write("JOIN#");
      
write.close();

 BufferedReader read;
ServerSocket clientserversoc = new ServerSocket(7000);


while(true){

Socket clientsoc = clientserversoc.accept();
read = new BufferedReader(new InputStreamReader(clientsoc.getInputStream()));
System.out.println(read.readLine()); // do the job, I just print out the msg
read.close();
}
    }
}
