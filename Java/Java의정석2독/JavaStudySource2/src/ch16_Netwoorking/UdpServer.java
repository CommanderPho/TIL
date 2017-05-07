package ch16_Netwoorking;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class UdpServer {
	public void statr() throws IOException{
		DatagramSocket socket = new DatagramSocket(7777);
		DatagramPacket inPacket, outPacket;
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		while(true){
			// �����͸� �����ϱ� ���� ��Ŷ�� ����
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			
			// ��Ŷ�� ���� �����͸� �����Ѵ�.
			socket.receive(inPacket);
			
			// ������ ��Ŷ���� ���� client�� IP�ּҿ� Port�� ��´�.
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			// ������ ���� �ð��� �ú��� ���·� ��ȯ
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes(); // time�� byte�迭�� ��ȯ
			
			// ��Ŷ�� �����ؼ� client���� ����
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
			socket.equals(outPacket);
		}
	}
	public static void main(String[] args) {
		try {
			new UdpServer().statr();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
