package ch13Exercise;

public class Ch13_6 {

	public static void main(String[] args) throws Exception {
		Thread4 th1 = new Thread4();
		th1.setDaemon(true);
		th1.start();
		
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {}
		
		throw new Exception("��~!!!");
		
		/*
		 * 1�ʸ��� 0~5���� ��ٰ�
		 * 5�� �� ��!!!�ϰ� ��
		 * th1�� main�����带 �����ִ� ���󾲷����̹Ƿ�
		 * main�����尡 ���� ��� ������ ���� ������.
		 */
	}

}
class Thread4 extends Thread{
	public void run(){
		for(int i=0; i< 10; i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}