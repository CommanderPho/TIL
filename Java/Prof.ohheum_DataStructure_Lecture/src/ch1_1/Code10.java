package ch1_1;

/*
 * 1~100_000 ������ ��� �Ҽ����� ã�Ƽ� ����ϴ� ���α׷�
 */

public class Code10
{
	public static void main(String [] args)
	{
		for(int i=2; i<100_000; i++)
		{
			boolean isPrime = true;
			for(int j=2; isPrime && j*j<i; j++)
			{
				if(i%j==0)
					isPrime=false;
			}
			if(isPrime)
				System.out.println(i);
		}
	}
}
