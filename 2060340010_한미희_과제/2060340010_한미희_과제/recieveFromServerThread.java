package kr.ac.kopo.day18.assignment;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class recieveFromServerThread extends Thread{

	Socket socket;
	
	recieveFromServerThread(Socket socket){
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try (
			// 서버에서 보내준 메세지를 수신할 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
		)
		{
			while(true) {
				//서버에서 재전송한 메세지 출력
				String echoMsg = br.readLine();
				System.out.println(echoMsg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	
	
}
