# 2020_06_09_JAVA_Thread & Network API

## 목표 : 멀티 스레드로 단체 채팅 프로그램 만들기

### Server & Thread class

```java
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



```

### Client class

```java
package kr.ac.kopo.day17.homework;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * java EchoClientMain 172.16.88.129 10001
 */

public class GruopEchoClientMain {

	public static void main(String[] args) {

		if(args.length != 2) {
			System.out.println("--------------------------------------");
			System.out.println("사용법이 잘못되었습니다");
			System.out.println("사용법 : java EchoClientMain 서버 IP 접속 Port 번호");
			System.out.println("--------------------------------------");
			System.exit(0);
		}

		String serverIP = args[0];
		int port = Integer.parseInt(args[1]);

		try {
			Socket socket = new Socket(serverIP,port);

			// 서버에 전송할 메세지 키보드로 입력 받는 객체 필요
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));


			// 키보드로 입력받은 메세지를 서버에 전송할 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			// 서버에서 보내준 메세지를 수신할 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);


			while(true) {
				System.out.println("전송할 메세지를 입럭하세요 (quit 입력시 종료) :");
				String msg = keyboard.readLine();

				//pw.println(msg);
				//pw.flush();
				//이런식으로 만들면 quit도 전달이 되니까 서버에서 종료할때 quit로 넣으면 됨?
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("서버와의 접속을 종료합니다.");
					socket.close();
					break; //System.exit(0);
				}

				pw.println(msg);
				pw.flush();

				String echoMsg = br.readLine();
				System.out.println("서버에서 재전송한 메세지 : [" + echoMsg + "]");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}



```

