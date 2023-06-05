package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			 listener = new ServerSocket(9000);
			 System.out.println("연결을 기다립니다.....");
			 socket = listener.accept();
			 System.out.println("연결 되었습니다.");
			 
			 in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			 
			 while(true) {
				 String inMsg = in.readLine();
				 System.out.println(inMsg);
				 
				 System.out.print("보내기 >>> ");
				 String outMsg = scan.nextLine();
				 out.write(outMsg + "\n");
				 out.flush();
			 }
			 
			 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
				scan.close();
				socket.close();
				listener.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
