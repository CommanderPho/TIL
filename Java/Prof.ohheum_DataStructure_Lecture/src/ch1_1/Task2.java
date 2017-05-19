package ch1_1;

/*
 * 1~100000 ������ ������ �߿� ���� ���� 50���� �Ҽ��� ã�� 
 * �� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
 * ���� �Ҽ��� ������ 50�� �̸��̶�� ��� �Ҽ��� ���� ���
 * 
 * �ϴ� 1~100_000 �� ������ 9657���ϱ� 50 �̸��ϸ��� ����
 * ���� ���� 50���� �Ҽ��� ����... ���� 50�� �ΰ� 2 3 5 ... 50���ɶ����� ���ϴ� �ǰ�?
 */

public class Task2
{
	public static void main(String [] args)
	{
		int primeSum = 0;
		int count = 0;
		
		outer :
		for(int i=2; i<100_000; i++)
		{
			boolean isPrime = true;
			for(int j=2; isPrime && j*j<i; j++)
			{
				if(i%j==0)
					isPrime = false;
			}
			
			if(isPrime)
			{
				primeSum += i;
				count++;
				if(count==50)
					break outer;
			}
		}
		
		System.out.println("primeSum : " + primeSum);
		System.out.println(count);
	}
}
