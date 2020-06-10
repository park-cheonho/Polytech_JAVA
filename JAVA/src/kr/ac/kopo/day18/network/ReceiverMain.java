package kr.ac.kopo.day18.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiverMain {

	public static void main(String[] args) {
		
		try {
			DatagramSocket socket = new DatagramSocket(10002);
			System.out.println("[수신 시작]");
			
			//datagrampacket으로 받음
			//byte로 오는 것 받을려면 객체 필요
			byte[] buf = new byte[100];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			
			while(true) {
			socket.receive(packet);
			String msg = new String(packet.getData());
			System.out.println("[수신된 메세지 내용] : " + msg);
			//수신된 내용을 가지고 있는 것은 buf라는 byte 배열? -? -> Arrays.toString
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
