package ch16_Netwoorking;

import java.net.*;
import java.io.*;

public class UdpClient {
	public void start() throws Exception{
		DatagramSocket datagramSocket = new DatagramSocket();
		InetAddress serverAddress = InetAddress.getByName("172.30.1.60");
		
		// �����Ͱ� ����� �������� byte�迭�� ����
		byte[] msg = new byte[100];
		
		DatagramPacket outPacket = new DatagramPacket(msg, 1,serverAddress,7777);
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		datagramSocket.send(outPacket); // Datagrampacket�� ����
 		datagramSocket.receive(inPacket); // Datagrampacket�� ����
 		
 		System.out.println("current sever tiem : " + new String(inPacket.getData()));
 		
 		datagramSocket.close();
	}
	public static void main(String[] args){
		try {
			new UdpClient().start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
