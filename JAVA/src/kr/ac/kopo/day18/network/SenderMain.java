package kr.ac.kopo.day18.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class SenderMain {

	public static void main(String[] args) {
		
		try {
			DatagramSocket socket = new DatagramSocket();
			
			System.out.println("[송신 시작]");
			
			for(int i = 1; i <= 10; i++) {
				String msg = "메세지 - " + i + "자기 암시 박수 합시다";
				byte[] bytes = msg.getBytes();
				
				SocketAddress addr = new InetSocketAddress("172.16.88.129", 10002);
				
				//항상 packet은 바이트 단위로 그리고 길이
				DatagramPacket packet = new DatagramPacket(bytes, bytes.length, addr);
				
				Thread.sleep(1000);
				socket.send(packet);
				
				System.out.println("전송한 데이터 크기 : " + bytes.length);
				//비연결성 10002번 포트가 준비 되었는지 중요하지 않음 그냥 보내기만
							
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
