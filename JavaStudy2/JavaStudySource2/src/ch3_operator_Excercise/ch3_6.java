package ch3_operator_Excercise;
/*
 * num������ ũ�鼭�� ���� ����� 10�� �������
 * ���� num�� ���� �� ���� ���ϴ� �ڵ�
 * ex) 24�� ũ�鼭�� ���� ����� 10�� ����� 30�̴�.
 * 30���� 24�� ���� 6
 */
public class ch3_6 {
	public static void main(String[] args) {
		int num = 81;
		//�ϴ� num�� ������ ũ�鼭�� ���� ����� 10�� ���
		int tmp = (num / 10 +1) * 10;
		System.out.println(tmp-num);
		
		
		//hint�� ������������ ����϶��...
		//�׳� 10���� num�� 1���ڸ����� ���� �Ǵ� �ſ���...
		//3�������� ���߱�...
		System.out.println(10 - num%10);
	}
}
