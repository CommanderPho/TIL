package ch16_Netwoorking;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TcpIpServer3 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime()+"������ �غ�ƽ��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true){
			try {
				System.out.println(getTime()+"�����û�� ��ٸ��ϴ�.");
				
				// ��û���ð��� 5�ʷ� ����
				// 5�ʵ��� ���ӿ�û�� ������ SocketTimeoutException�� �߻�
				serverSocket.setSoTimeout(5*1000);

				// ���������� Ŭ���̾�Ʈ�� �����û�� �� ������ ������ ���߰� ��� ��ٸ���.
				// Ŭ���̾�Ʈ�� �����û�� ���� Ŭ���̾�Ʈ ���ϰ� ����� ���մ� ������ ����
				Socket socket = serverSocket.accept();
				System.out.println(getTime()+socket.getInetAddress() + "�� ���� �����û�� ���Խ��ϴ�.");
				
				//������ ��½�Ʈ���� ��´�.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				// ���� ����(remote socket)�� �����͸� ������.
				dos.writeUTF("[Notice] Test message1 from Server.");
				System.out.println(getTime()+"�����͸� �����߽��ϴ�.");
				
				// ��Ʈ���� ������ �ݾ��ش�.
				dos.close();
				socket.close();
			} catch(SocketTimeoutException e){
				System.out.println("������ �ð����� ���ӿ�û�� ��� ������ ����");
				System.exit(0);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static String getTime(){
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
