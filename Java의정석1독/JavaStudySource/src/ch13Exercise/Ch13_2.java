package ch13Exercise;

public class Ch13_2 {

	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		t1.run();
		for(int i=0; i<10; i++)
			System.out.print(i);
		System.out.println("main");
		/*
		 * start�� �ƴ϶� run�̶� 0����9���� ���ڰ� �������
		 * run�ϸ� �׳� main�����忡�� ���ư��°� �Լ�ȣ���ϵ���
		 * start�ؾ� �ٸ�  �����忡�� ���ư��°Ű�
		 */
	}

}
class Thread2 extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.print(i);
		}
	}
}