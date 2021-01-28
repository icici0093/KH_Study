package chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ChattingServer {
	public static void main(String[] args) {
		ServerSocket chatServerSocket = null;
		int listenPort = 9999;
		OutputStream out = null;
		DataOutputStream dos = null;
		InputStream in = null;
		DataInputStream dis = null;
		String sendMsg = null;
		String recvMsg = null;
		
		try {
			System.out.println("채팅 서버를 구동 중입니다...");
			Thread.sleep(1000); // ms -> m = 1/1000, 1000 ms -> 1s
			
			chatServerSocket = new ServerSocket(listenPort);
			System.out.println("채팅 서버를 구동하였습니다.");
			Thread.sleep(1000);
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			Socket clientSocket = chatServerSocket.accept(); 
			System.out.println(clientSocket.getInetAddress() + "클라이언트가 접속하였습니다.");
			out = clientSocket.getOutputStream();
			dos = new DataOutputStream(out);
			in = clientSocket.getInputStream();
			dis = new DataInputStream(in);
			System.out.println(clock() + "채팅이 시작되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
			System.out.print(clock() + "서버(나) : ");
			sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
			if(sendMsg.equals("exit")) break;
			recvMsg = dis.readUTF();
			if(recvMsg.equals("exit")) break;
			System.out.println(clock() + "클라이언트(상대) : " + recvMsg);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(clock() + "채팅서버를 종료합니다.");
		
		try {
			dis.close();
			dos.close();
			chatServerSocket.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static String clock() {
		Date getTime = new Date();
		String time = new SimpleDateFormat("[HH:mm:ss]").format(getTime);
		return time;
		
	}
}
