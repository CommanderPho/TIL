package ch4_Exercise;

/*
 * ���ڷ� �̷���� ���ڿ� str�� ���� ��, ���ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ�
 * ���� ���ڿ��� "12345"���, "1+2+3+4+5"�� ����� 15�� ����� �ž� �Ѵ�.
 * StringŬ������ charAt(int i)�� ���
 */

public class ch4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++){
			sum+=Character.getNumericValue(str.charAt(i));
//			sum+=str.charAt(i)-'0';
		}
		System.out.println("sum="+sum);
	}
}
