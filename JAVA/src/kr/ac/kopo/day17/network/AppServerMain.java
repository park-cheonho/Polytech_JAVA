package kr.ac.kopo.day17.network;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//server의 serversocket 학습용

public class AppServerMain {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(10000);
			System.out.println("어플리케이션 서버 구동!");
			//client의 요청을 기달려야함
			
			//이미 포트 사용중이라 종료하고 다시 시작해야함
			//client를 기다림
			Socket client = server.accept();
			System.out.println("접속된 client 정보 : " + client);
			System.out.println("server socket port : " + client.getLocalPort());
			System.out.println("client socket port : " + client.getPort());
			System.out.println("client socket ip : " 
								+ client.getInetAddress());
			
			String msg = "접속을 환영합니다";
			
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(msg);
			dos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
}
