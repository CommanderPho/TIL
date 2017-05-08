package ch13_thread;

import javax.swing.JOptionPane;

public class ThreadEx14
{
	public static void main(String [] args)
	{
		ThreadEx13_1 t = new ThreadEx13_1();
		t.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳��Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		t.interrupt();
		System.out.println("isInterrupted() : " + t.isInterrupted());
	}
}

class ThreadEx14_1 extends Thread
{
	@Override
	public void run()
	{
		int i = 10;
		
		while(i!=0 && !isInterrupted())
		{
			System.out.println(i--);
			try
			{
				Thread.sleep(1000);
			}
			catch ( Exception e )
			{
				interrupt();
			}
		}
		System.out.println("ī��Ʈ�� ����ƽ��ϴ�.");
	}
}
