package ch4_Exercise;

/*
 * Math.random()�� �̿��ؼ� 1���� 6������ ������ ������ ���� value�� �����ϴ� �ڵ带 �ϼ�
 */

public class ch4_7 {
	public static void main(String[] args) {
		int value = (int)(Math.random()*5) + 1;
		System.out.println("value:"+value);
	}
}
