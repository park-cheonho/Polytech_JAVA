package kr.ac.kopo.day17.network;

import java.net.InetAddress;


public class InetAddressMain {

	public static void main(String[] args) {
		
		try {
		 	InetAddress localhost = InetAddress.getLocalHost();
		 	
		 	System.out.println("내 컴퓨터 이름 : " + localhost.getHostName());
		 	System.out.println("내 컴퓨터 IP : " + localhost.getHostAddress());
		 	
		 	InetAddress addr = InetAddress.getByName("www.naver.com");
		 	System.out.println("naver IP 정보 : " + addr);
		 	
		 	InetAddress[] addrs = InetAddress.getAllByName("www.naver.com");
		 	System.out.println("------------------------------------------");
		 	System.out.println("\t네이버 IP 정보");
		 	System.out.println("------------------------------------------");
		 	for(InetAddress address : addrs) {
		 		System.out.println(address);
		 	}
		 	System.out.println("------------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
