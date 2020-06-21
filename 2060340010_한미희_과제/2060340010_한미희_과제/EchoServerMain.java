package kr.ac.kopo.day18.assignment;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class EchoThread extends Thread{
    private Socket client;
//  private ArrayList<Socket> clients = new ArrayList<Socket>();
//    private Map<String, Socket> clients = new Map<String, Socket>();
    private static HashMap<String, PrintWriter> clientpws = new HashMap<String, PrintWriter>();
    
    public EchoThread(Socket client){
        this.client = client;
    }

	@Override
	public void run() {
		
		try (
			// 클라이언트가 전송해준 메세지를 수신할 객체
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);		
			
			// 서버가 클라이언트에게 받은 메세지를 재전송할 객체
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
		)
		{

//			//닉네임 입력받아서 해당 client에게 출력할 통로인 printWriter와 함께 map에 저장
			String msg = br.readLine();
			clientpws.put(msg, pw);
			
			//사용자 접속 알림
			System.out.println("접속한 사용자의 아이디는 " + msg +"입니다");
			for(String key: clientpws.keySet()) {
				//클라이언트들에게 재전송
				clientpws.get(key).println("[" + msg + "]님이 접속했습니다");
				clientpws.get(key).flush();
			}
			
			//대화 메시지 입력 및 재전송
			while(true) {
				msg = br.readLine();
//				System.out.println(msg);
				
				if(msg == null) {
					System.out.println("[" + getKey(clientpws, pw) + "]님이 접속을 종료했습니다");
					client.close();
					break;
				}
				
				//귓속말 보낼 때
				if(msg.startsWith("/to")) {
//					System.out.println(msg);
					String[] strs = msg.split("\\s+", 3);
//					System.out.println(strs[0] + "/" +  strs[1] + "/" + strs[2]);
					clientpws.get(strs[1]).println("[" + getKey(clientpws, pw) 
												+ "님이 다음 귓속말을 보냈습니다] : " + strs[2]);
					clientpws.get(strs[1]).flush();					
				
				//일반 메세지 보낼 때
				}else {
					for(String key: clientpws.keySet()) {
						// 서버가 클라이언트에게 받은 메세지를 재전송할 객체
//						System.out.println(key);
						clientpws.get(key).println("[" + getKey(clientpws, pw) + "] : " + msg);
						clientpws.get(key).flush();
						
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	//value값으로 key값 얻기
	public <K, V> K getKey(HashMap<K, V> map, V value) {
        // 찾을 hashmap 과 주어진 단서 value
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}

public class EchoServerMain {

	public static void main(String[] args) {
		
		try {
			//애플리케이션 서버 구동
			ServerSocket server = new ServerSocket(10011);
			System.out.println("** 채팅 서버 시작 **");
			
			//클라이언트의 접속을 기다리기
			while(true) {
				Socket client = server.accept();
				EchoThread et = new EchoThread(client);
				et.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}	

