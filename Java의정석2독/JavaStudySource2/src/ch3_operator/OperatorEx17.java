package ch3_operator;

public class OperatorEx17 {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = (int)(pi*1000+0.5) / 1000.0;  // �Ҽ� ��°�ڸ����� �ݿø�
		double shortPi2 = Math.round(pi*1000) / 1000.0;
		
		System.out.println(shortPi);
		System.out.println(shortPi2);
	}
}
      