package ��ſ��ڹ�;

public class Test2 {
	public static void main(String[] args) {
		���ɻ��� box = new ���ɻ���();
		
		���� b = new ����();
		
		box.set(b);
		
		//����ȯ
		// box���� ���� ���� ����������
		//Object�� ������ �ִ� �޼��常 ��밡��
		
		Object o2 = box.get();
		
		//����ȯ�Ͽ� ������
		//���� �־��� ���� ������ ����!
		���� b2 = (����)box.get();
	}
}
