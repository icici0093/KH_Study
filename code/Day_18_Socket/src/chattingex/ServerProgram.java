package chattingex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		// 서버 
		// ServerSocket => accept => Socket
		try {
			serverSocket = new ServerSocket(4885);
			System.out.println("연결 기다림...");
			// 통신에 필요한 객체 생성 
			Socket socket = serverSocket.accept();
			System.out.println("연결 수락함!");
			
			byte [] bytes = null;
			String message = null;
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes); //is.read(int )
			message = new String(bytes, 0, readByteCount);
			System.out.println("데이터 받기 성공 : " + message);
			
			OutputStream os = socket.getOutputStream();
			message = "Hello Client";
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("데이터 보내기 성공");
			
			is.close();
			os.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
