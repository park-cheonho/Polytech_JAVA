package kr.ac.kopo.day17.network;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class AppClientMain {

	public static void main(String[] args) {
		// client가 컨택하려는 서버의 ip와 port번호가 필요함
		
		
		try {
			System.out.println("서버와의 접속을 시도합니다");
			
			Socket socket = new Socket("localhost", 10000); // 127.0.0.1 내 컴이라고  172.16.88.146
			// java.net.ConnectException: Connection refused: connect 서버 안열린 상태로 실행하면 나오는 에러
			
			System.out.println("socket port : " + socket.getLocalPort());
			//System.out.println("socket port : " + socket.get());
			
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			String msg = dis.readUTF();
			System.out.println("서버에서 전송된 메세지 입니다. : " + msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
