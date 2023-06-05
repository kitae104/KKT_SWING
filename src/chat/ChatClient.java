package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) {
		Socket socket = null;
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			
			 socket = new Socket("localhost", 9000);
			
			 in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			 
			 while(true) {
				 System.out.print("보내기 >>> ");
				 String outMsg = scan.nextLine();
				 out.write(outMsg + "\n");
				 out.flush();
				 
				 String inMsg = in.readLine();
				 System.out.println(inMsg);
			 }
			 
			 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
				scan.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
