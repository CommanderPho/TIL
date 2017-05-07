package ch6;

public class RecursiveCallFactorial {
	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}
	static int factorial(int n)
	{	//��ȿ���˻� 0���� ������ x / 12���� ũ�� int�� ��ȿ������ ����
		if(n<=0 || n>12) return -1;
		
		if(n==1) return 1;

		return n*factorial(n-1);
	}
}
