package ch4_Exercise;
/*
 * intŸ���� ���� num�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ�
 * ���� ���� num�� ���� 12345���, '1+2+3+4+5'�� ����� 15�� ���
 * ���ڿ��� ��ȯ x ���ڷθ�
 */
public class ch4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(num>0){
			sum+=num%10;
			num/=10;
		}
		System.out.println("sum="+sum);
	}
}
