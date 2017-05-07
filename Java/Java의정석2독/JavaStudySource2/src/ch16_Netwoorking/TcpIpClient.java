package ch16_Netwoorking;

import java.net.*;
import java.io.*;

public class TcpIpClient {
	public static void main(String[] args) {
		
		String serverIp = "172.30.1.60";

		try(Socket socket = new Socket(serverIp, 7777);
			DataInputStream dis = new DataInputStream(socket.getInputStream())) {
			
			System.out.println("������ �������Դϴ�. ����IP : " + serverIp);
			// ������ �����Ͽ� ���� ��û
//			Socket socket = new Socket(serverIp, 7777);
			
			// ������ �Է� ��Ʈ���� ��´�.
//			InputStream in = socket.getInputStream();
//			DataInputStream dis = new DataInputStream(in);
			
			// �������� ���� ���� �����͸� ���
			System.out.println("�����κ��� ���� �޽��� : " + dis.readUTF());
			System.out.println("������ �����մϴ�.");
			
			// ��Ʈ���� ������ �ݴ´�.
//			dis.close();
//			socket.close();
			System.out.println("������ ����ƽ��ϴ�.");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
