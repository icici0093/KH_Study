package chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ChattingClient {
	public static void main(String[] args) {
		String serverIp = "127.0.0.1";
		int serverPort = 9999;
		Socket socket = null;
		OutputStream out = null;
		DataOutputStream dos = null;
		InputStream in = null;
		DataInputStream dis = null;
		String sendMsg = null;
		String recvMsg = null;
		try {
			System.out.println("서버에 연결중입니다.");
			socket = new Socket(serverIp, serverPort);
			System.out.println(socket.getInetAddress() + "채팅 서버에 접속하였습니다."); // IP 가져오는거
			out = socket.getOutputStream();
			dos = new DataOutputStream(out);
			in = socket.getInputStream();
			dis = new DataInputStream(in);
			System.out.println(clock() + "서버와의 채팅을 시작합니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				recvMsg = dis.readUTF();
				if(recvMsg.equals("exit")) break;
				System.out.println(clock() + "서버(상대) : " + recvMsg);
				
				System.out.print(clock() + "클라이언트(나) : " );
				sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				if(sendMsg.equals("exit")) break; 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(clock() + "채팅 서버를 종료합니다.");
		
		try {
			dis.close();
			dos.close();
			socket.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	static String clock() {
		Date getTime = new Date();
		String time = new SimpleDateFormat("[HH:mm:ss]").format(getTime);
		return time;
		
	}
}
