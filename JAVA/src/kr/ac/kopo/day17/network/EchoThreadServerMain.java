package kr.ac.kopo.day17.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class EchoThread extends Thread {

	private Socket socket;
	
	public EchoThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	// 소켓 client와 서버소켓 server
	public void run() {
		InetAddress client = socket.getInetAddress();
		System.out.println("[" + client + "] 이 접속 하셨습니다.");
		
		try (
				InputStream is = socket.getInputStream();
				InputStreamReader isr	= new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				PrintWriter pw = new PrintWriter(osw);
				
		) {
			
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					System.out.println("[" + client + "] 님이 접속을 해제 하셨습니다.");
					socket.close();
					break;
				}
				pw.println(msg);
				pw.flush();
				
				String echoMsg = br.readLine();
				System.out.println("서버에서" + client + "님에게 제전송한 메세지 입니다." + "[" + echoMsg + "]");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}


public class EchoThreadServerMain {


	public static void main(String[] args) {
		
		System.out.println("EchoServer is working!!");
		
		try {
			ServerSocket server = new ServerSocket(10001);
			
			while(true) {
			Socket client = server.accept();
			System.out.println(client);
			
			EchoThread et = new EchoThread(client);
			et.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
