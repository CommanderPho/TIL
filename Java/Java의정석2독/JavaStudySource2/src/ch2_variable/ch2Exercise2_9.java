package ch2_variable;

public class ch2Exercise2_9 {

	public static void main(String[] args) {
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		/*
		 * a. b = (byte)i;  int -> byte : ū �ſ��� �����ŷ�����ȯ�Ϸ��� ������������������
		 * b. ch = (char)b; byte -> char : �� -> ū ������ byte -128~127, char 0~645535�̹Ƿ� �ٸ��� ���� �����
		 * c. short s = (short)ch; char -> short : 2byte�� �������� char0~65535�̰� short�� -32,768~32767���� �ٸ��� ���� ���������
		 * d. float f = (float)l;  long -> float : long(8byte) float(4byte)������ ������ float�� �� Ŀ�� ���� ����.
		 * e. i = (int)ch;  char -> int : ��������
		 * 
		 * d.e

		 *
		 *11. a,b,c,f
		 *12. abce
		 */
	}

}
