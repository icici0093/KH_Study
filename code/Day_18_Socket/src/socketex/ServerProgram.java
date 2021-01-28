package socketex;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerProgram {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 7777;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println(port + " Port listen OK!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		while(true) {
			try {
				System.out.println(clock() + " 연결 요청을 기다립니다.");
				Socket socket = serverSocket.accept();
				
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				dos.writeUTF("[Notice] Test Message from Server!");
				System.out.println("데이터 전송 완료");
				
				dos.close();
				socket.close();
				System.out.println(clock() + " 연결을 종료하였습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	static String clock() {
		Date getTime = new Date();
		String time = new SimpleDateFormat("[HH:mm:ss]").format(getTime);
		return time;
	}
	
	
	
	
	
	
	
}
