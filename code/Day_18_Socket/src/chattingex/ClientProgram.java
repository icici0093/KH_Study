package chattingex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientProgram {
	public static void main(String[] args) {
		Socket socket = null; // null로 초기화 
		
		try {
			System.out.println("연결 요청");
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("연결 성공!");
			
			byte [] bytes = null;
			// 보낼 메세지를 담을 변수
			String message = null;
			
			// 생성된 소켓 객체에서 아웃풋스트림을 가져옴
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("데이터 보내기 성공");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes); // 읽은 길이
			message = new String(bytes, 0, readByteCount);
			System.out.println("데이터 받기 성공 : " + message);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 소켓이 열려있으면 닫아줌 
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
