package ch3_operator_Excercise;

/*
 * �������� �����ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.
 */

public class ch3_8 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		// byte c = a + b;
		// 'a+b' �� 'byte+byte'�̹Ƿ� 'int+int'�� ����ȯ�Ǽ� ����
		// ����� int���ε� int������ ������ ���� byte�������ϱ� ������
		// �Ʒ��� ���� �ؾߵ� byte�� ����(-128~127)�� ����� �� �ս� ����
		byte c = (byte)(a+b);
		
		char ch = 'A';
//		ch = ch +2;
		// char + int -> int + int -> int
		// ����� ����ȯ �ʿ�
		ch = (char)(ch+2);
				
//		float f = 3 / 2; // int/int�� �Ҽ��� �̾��� ��� ���� float�� �ؾ���.
		float f = 3f / 2;
		
//		long l = 3000 * 3000 * 3000; // int�����ε� int�� ������ �Ѿ�� �����Ⱚ�� ��� �ϳ� long���� �ؾ���
		long l = 3000 * 3000 * 3000L;
		

		float f2 = 0.1f;
		double d = 0.1;

		// boolean result = d==f2; // double�� float���� �񱳴� dobule�� float�� �ٲ㼭 �ؾ� ��.
		boolean result = (float)d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
}
