package ch1_1;

import java.util.Scanner;

public class Code13_2
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] data = new int [n];

		for ( int i = 0; i < n; i++ )
		{
			data[i] = s.nextInt();
		}
		
		s.close();

		int max = 0;
		for ( int i = 0; i < n; i++ )
		{
			StringBuilder sumString = new StringBuilder();
			for ( int j = i; j < n; j++ )
			{
				//  �׳� ��ġ��
				// n�� Ŀ���� �����÷ο� �߻��� �� ����
				// int : �� 20�� ( 21_4748_3647 ) 
				int sum = 0;
				for(int k=i; k<=j; k++)
					sum = sum * 10 + data[k];
				
				// �Ҽ����� �Ǻ��ϰ�
				boolean isPrime = true;
				for ( int k = 2; isPrime && k * k < sum; k++ )
				{
					if ( sum % k == 0 )
						isPrime = false;
				}
				
				// 1�� �Ҽ��� �� ���� �ؾ���
				if ( sum > 1 && isPrime && sum > max )
					max = sum;
			}
		}
		if ( max > 0 )
			System.out.println(max);
		else
			System.out.println("no");
	}
}
