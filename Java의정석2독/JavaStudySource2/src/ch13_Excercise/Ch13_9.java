package ch13_Excercise;

import javax.swing.JOptionPane;

public class Ch13_9 {
	public static void main(String[] args) {
		Ch13_9_1 th1 = new Ch13_9_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է°�:"+input);
		th1.interrupt();
		System.out.println("isInterrupted():"+th1.isInterrupted());
	}
}

class Ch13_9_1 extends Thread{
	public void run(){
		int i = 10;
		
		while(i!=0 && !isInterrupted()){
			System.out.println(i--);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				interrupt();
			}
		}
		System.out.println("ī��Ʈ�� ����");
	}
}