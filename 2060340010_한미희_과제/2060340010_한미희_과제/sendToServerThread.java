package kr.ac.kopo.day18.assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class sendToServerThread extends Thread{
	
		Socket socket;
		String nickName;
		
		sendToServerThread(Socket socket, String nickName){
			this.socket = socket;
			this.nickName = nickName;
		}
		
		@Override
		public void run() {
			
			try (
				// 서버에 전송할 메세지를 키보드로 입력받는 객체
				BufferedReader keyboard 
						= new BufferedReader(new InputStreamReader(System.in));
	
				// 키보드로 입력받은 메세지를 서버에 전송할 객체
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				PrintWriter pw = new PrintWriter(osw);
//				BufferedWriter bw = new BufferedWriter(osw);
			)
			{
				//닉네임 보내기
				pw.println(nickName);
				pw.flush();
				
				while(true) {				
					String msg = keyboard.readLine();
					if(msg.equalsIgnoreCase("/quit")) {
						System.out.println("채팅방을 종료합니다");
							socket.close();
							break;
					}
					
					//키보드로 입력받은 메세지 서버에 전송
					pw.println(msg);
					pw.flush();
	
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
	
}
