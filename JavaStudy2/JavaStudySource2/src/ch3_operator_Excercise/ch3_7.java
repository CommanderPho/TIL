package ch3_operator_Excercise;

/*
 * ȭ���� ������ ��ȯ
 * C = 5/9 * (F-32)
 * �Ҽ��� �¤��ڸ����� �ݿø�
 * Math.round()�� ������� �ʰ�
 */

public class ch3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (float)5/9 * (fahrenheit - 32);
		
		// 3777.778  + 0.5
		// 3778.278
		float ceciusRound = (int)(celcius * 100 +0.5f) / 100f;
		
//		float celciusRound = (celcius * 100 +0.5)/100;
		
		System.out.println("Fahrenhit:"+fahrenheit);
		System.out.println("Celcius:"+ceciusRound);
		
	}
}
