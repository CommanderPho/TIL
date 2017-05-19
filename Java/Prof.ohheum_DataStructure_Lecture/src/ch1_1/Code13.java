package ch1_1;

import java.util.Scanner;

/*
 * n���� ���� �ƴ� �� �ڸ� ������ �Է¹޾� �迭�� �����Ѵ�.
 * �̵� �߿� 1�� �̻��� ���ӵ� �������� ���Ͽ� ���� �� �ִ�
 * �Ҽ��� �߿��� �ִ밪�� ���Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
 * 
 * 1 9 4 0 7 1 3 6 2 3
 * 7 1 3���� �ؼ�
 * 
 * i = 0 ~ n-1
 * j = i ~ n-1
 * ���ϴ� �� �ƴ϶� ���ļ� �Ҽ����� �Ǻ��ϰ�
 * �Ҽ��� �ƴϸ� continue;
 * �Ҽ��̸� max�� ���ؼ� ũ�� max�� ����
 */

public class Code13
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
				sumString.append(data[j]); // ���ļ�
				int sum = Integer.parseInt(sumString.toString()); // int�� �ٲٰ�
				// �Ҽ����� �Ǻ��ϰ�
				boolean isPrime = true;
				for ( int k = 2; isPrime && k * k < sum; k++ )
				{
					if ( sum % k == 0 )
						isPrime = false;
				}
				// 1�� �Ҽ��� �� ����
				// ���ڰ� Ŀ���� int�� ���� ����
//				�Ҽ��̸鼭 max���� ũ�� �ٲ�
				if ( isPrime && sum > max )
					max = sum;
			}
		}
		if ( max > 0 )
			System.out.println(max);
		else
			System.out.println("no");
	}
}
