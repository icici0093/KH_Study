package socketex;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientProgram {
	public static void main(String[] args) {
		
		String serverIpAddress = "127.0.0.1";
		int serverPort = 7777;
		Socket socket = null;
		
		try {
			System.out.println(clock() + " 서버에 연결 요청 중입니다. 서버IP : " + serverIpAddress);
			socket = new Socket(serverIpAddress, serverPort);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버로부터 받은 메시지 : " + dis.readUTF());
			System.out.println("연결을 종료합니다.");
			dis.close();
			in.close();
			System.out.println(clock() + " 연결을 종료하였습니다.");
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
