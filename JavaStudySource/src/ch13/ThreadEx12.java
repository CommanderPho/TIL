package ch13;

public class ThreadEx12 {

	public static void main(String[] args) {
		ThreadEx12_1 th1 = new ThreadEx12_1();
		ThreadEx12_2 th2 = new ThreadEx12_2();
		
		th1.start();
		th2.start();
		
		try {
			th1.sleep(2000);
//			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.print("<<main ����>>");
		//th1.sleep(2000)�������� th1�� ���� ����
		//sleep()�� �׻� ���� �������� �����忡 ���� �۵��ϱ� ������
		//th1.sleep(2000)�� ������ main�����忡 �����
		//�׷��� sleep()�� static���� ����� ����
		//���� Thread.sleep(2000)����
		//yield()�� static���� ����� �ִ� �͵� sleep()�� ���� ����
	}

}

class ThreadEx12_1 extends Thread{
	public void run(){
		for(int i=0; i< 300; i++){
			System.out.print("-");
		}
		System.out.print("<<th1 ����>>");
	}
}
class ThreadEx12_2 extends Thread{
	public void run(){
		for(int i=0; i< 300; i++){
			System.out.print("|");
		}
		System.out.print("<<th2 ����>>");
	}
}