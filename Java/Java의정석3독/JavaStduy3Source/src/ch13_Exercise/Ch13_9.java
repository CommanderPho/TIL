package ch13_Exercise;

import javax.swing.JOptionPane;

public class Ch13_9
{

	public static void main(String [] args)
	{
		Ch13_9_1 th = new Ch13_9_1();
		th.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳�");
		System.out.println("�Է��Ͻ� ���� " + input + " �Դϴ�.");
		th.interrupt();
	}

}

class Ch13_9_1 extends Thread
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
			{	// InterruptedException�� �߻��ǰ� �������� interrupted���´� false�� �ڵ� �ʱ�ȭ��
				// �׷��� interrupt�� �ٽ� �� �� ȣ���ؼ� interrupted���¸� true!
				interrupt();
			}
		}
		System.out.println("ī��Ʈ ����");
	}
}