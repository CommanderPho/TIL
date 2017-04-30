package ch16_Netwoorking;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;


public class TcpIpServer4 implements Runnable{
	ServerSocket serverSocket;
	Thread[] threadArr;
	
	public TcpIpServer4(int num){
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime()+"������ �غ�ƽ��ϴ�.");
			
			threadArr = new Thread[num];
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void start(){
		for(int i=0; i<threadArr.length; i++){
			threadArr[i] = new Thread(this);
			threadArr[i].start();
		}
	}
	
	public void run(){
		while(true){
			try {
				System.out.println(getTime()+"�����û�� ��ٸ��ϴ�.");
				
				// ���������� Ŭ���̾�Ʈ�� �����û�� �� ������ ������ ���߰� ��� ��ٸ���.
				// Ŭ���̾�Ʈ�� �����û�� ���� Ŭ���̾�Ʈ ���ϰ� ����� ���մ� ������ ����
				Socket socket = serverSocket.accept();
				System.out.println(getTime()+socket.getInetAddress() + "�� ���� �����û�� ���Խ��ϴ�.");
				
				//������ ��½�Ʈ���� ��´�.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				// ���� ���Ͽ� �����͸� ������.
				dos.writeUTF("[Notice] Test message1 from Server.");
				System.out.println(getTime()+"�����͸� �����߽��ϴ�.");
				
				// ��Ʈ���� ������ �ݾ��ش�.
				dos.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		TcpIpServer4 server = new TcpIpServer4(5);
		server.start();
	}
	static String getTime(){
		String name = Thread.currentThread().getName();
		SimpleDateFormat df = new SimpleDateFormat("[hh:mm:ss]");
		return df.format(new Date()) + name;
	}
}
