package ch7Exercise;
/*
 * ���� Ŭ�������� �ܺ� Ŭ������ �ν��Ͻ������ static����� ��� ������ �� ������,
 * ���������� fianl�� ���� ����� ������ �� �ִ� ������ �����ΰ�?
 * 
 * 
 * �޼��尡 ������ ���ļ� ���������� �Ҹ�� ��������, ���� Ŭ������ �ν��Ͻ��� �Ҹ��
 * ���������� �����Ϸ��� ��찡 �߻��� �� �ֱ� ����
 * 
 * �Ʒ��� ����  main�޼��尡 ����� �Ŀ��� �������� VALUE�� ���� ����ϰ� �ִٴ� ���� �� �� �ִ�.
 * ���������� �޼��尡 ����Ǹ� �Բ� ���������, ����� ��� �̹� ������Ʈ Ǯ(constant pool, ����� ���� ��Ƽ� ������ ���� ��)��
 * ����� �ֱ� ������ ����� �� �ִ� ���̴�.
 */
public class Ch7_29 {
	public static void main(String[] args) {
		final int VALUE = 10;
		
		Thread t = new Thread(new Runnable(){  // �͸�Ŭ����

			@Override
			public void run() {
				for(int i=0; i<10; i++){
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){}
					System.out.println(VALUE);  // �ܺ�Ŭ������ ���������� ���
				}
			}
			
		});
		t.start();
		System.out.println("main() ����");
	}
}
