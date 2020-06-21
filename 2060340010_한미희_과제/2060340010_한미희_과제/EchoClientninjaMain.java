package kr.ac.kopo.day18.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;



public class EchoClientninjaMain {

	public static void main(String[] args) {

		if(args.length != 2) {
			System.out.println("----------------------------------------------------");
			System.out.println("  사용법이 잘못되었습니다");
			System.out.println("  사용법 :  java EchoClientMain  닉네임	서버IP");
			System.out.println("----------------------------------------------------");
			System.exit(0);
		}

	
		String nickName = args[0];
		String serverIP = args[1];

		try {
			Socket socket = new Socket(serverIP, 10011);
			sendToServerThread st = new sendToServerThread(socket, nickName);
			recieveFromServerThread rt = new recieveFromServerThread(socket);
			st.start();
			rt.start();
			
		} catch(Exception e) {
			e.printStackTrace();

		}

	}
	
}
