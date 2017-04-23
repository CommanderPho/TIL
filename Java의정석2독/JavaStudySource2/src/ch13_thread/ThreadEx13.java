package ch13_thread;

import javax.swing.JOptionPane;

public class ThreadEx13 {
	public static void main(String[] args) {
		ThreadEx13_1 th1 = new ThreadEx13_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		th1.interrupt();
		System.out.println("isInterupted():"+th1.isInterrupted());
	}
}

class ThreadEx13_1 extends Thread{
	public void run(){
		int i = 10;
		
		while(i!=0 && !isInterrupted()){
			System.out.println(i--);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				interrupt();
			}
		}
		System.out.println("ī��Ʈ �ٿ� ����");
	}
}
