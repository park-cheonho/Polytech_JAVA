package kr.ac.kopo.day17.homework;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
  java EchoServerMain 11005
  	//run -> runconfiguration -> EchoServerMain -> args -> 11005
	//ServerSocket server = new ServerSocket();
 */

public class GruopEchoServerMain {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(11005);
			System.out.println("클라이언트의 접속을 기다립니다!");

			while(true) {
				Socket client = server.accept();
				System.out.println("접속된 클라이언트 정보  : [" + client.getInetAddress() + " ]");

				GruopEchoThread gruopechothread = new GruopEchoThread(client);
				gruopechothread.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class GruopEchoThread extends Thread{

	Socket client;

	public GruopEchoThread(Socket client) {
		this.client = client;
	}
	
	@Override
	public void run() {

		try {
			// 클라이언트가 전송해준 메세지를 수신할 객체가 필요함 inputstream 필요
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			// 수신한 메세지를 클라이언트에게 재전송할 객체
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			while(true) {
				String msg = br.readLine();

				if(msg == null) {
					System.out.println("클라이언트 [" + client.getInetAddress() + "] 과의 접속 해제");
					client.close();
					break; // System.exit(0);
				}
				System.out.println("[" + client.getInetAddress() + "] : " + msg);
				pw.println(msg);
				pw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	


