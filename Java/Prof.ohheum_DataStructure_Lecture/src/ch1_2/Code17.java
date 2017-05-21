package ch1_2;

/*
 * 1���� 100_000 ������ �Ҽ��� ã�� ����Ѵ�.
 */
public class Code17
{
	public static void main(String [] args)
	{
		for(int i=0; i<100_000; i++)
		{
			if(isPrime(i))
				System.out.println(i);
		}
	}
	// �Ҽ� : ���� ����� 1�� �ڱ� �ڽ� ���� 1���� ū �ڿ���
	
	static boolean isPrime(int n)
	{
		
		if(n<2) return false;
		
		// i< = sqrt(n)�ε�
		// ������ �ϱ����� i*i<n���� ��
		// ����� ���� �̷�� ������
		// �������� �������� ū �� ������ �����ٺ��� ���� �ſ��� �̹� �ɷ��� ����
		
		for(int i=2; i*i<=n; i++)
		{
			if(n%i==0) return false;
		}
		return true;
	}
}
