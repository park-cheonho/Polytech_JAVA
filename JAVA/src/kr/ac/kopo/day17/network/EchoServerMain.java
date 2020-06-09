package kr.ac.kopo.day17.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
  java EchoServerMain 10001
 */

public class EchoServerMain {

	public static void main(String[] args) {

		if(args.length !=1) {
			System.out.println("-----------------------------------------");
			System.out.println("사용법 : java EchoServerMain port번호");
			System.out.println("-----------------------------------------");
			System.exit(0);	
		}

		int portNo = Integer.parseInt(args[0]);

		try {
			ServerSocket server = new ServerSocket(portNo);
			System.out.println("클라이언트의 접속을 기다립니다!");


			Socket client = server.accept();
			System.out.println("접속된 클라이언트 정보  : [" + client.getInetAddress() + " ]");


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

		//run -> runconfiguration -> EchoServerMain -> args -> 10001
		//System.out.println(args.length);
		//ServerSocket server = new ServerSocket();

	}
}
