package ch9_lang;

public class StringEx6 {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal+ "";
		
		// ���ڿ� �յ� ���� ���� trim() ���������� ���ִ� ���� �߿� ���ڿ� �յ� ������ ���� �� ��ȯ�ϸ� ���ܹ߻�
		// NumberFormatException
		// '+'�� '.' , 'f' �� ���
		double sum = Integer.parseInt("+"+strVal.trim()) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}
}
