package ch13_thread;

import javax.swing.JOptionPane;

public class ThreadEx14 {
	public static void main(String[] args) {
		ThreadEx14_1 th1 = new ThreadEx14_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		th1.interrupt();
		System.out.println("isInterupted():"+th1.isInterrupted());
	}
}
class ThreadEx14_1 extends Thread{
	public void run(){
		int i = 10;
		
		while(i!=0 && !isInterrupted()){
			System.out.println(i--);
			for(long x=0; x<250_0000_000L; x++);
		}
		System.out.println("ī��Ʈ �ٿ� ����");
	}
}