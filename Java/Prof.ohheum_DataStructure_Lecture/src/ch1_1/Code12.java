package ch1_1;

import java.util.Scanner;

/*
 * n���� ������ �Է¹޾� �迭�� �����Ѵ�.
 * �̵� �߿��� 0�� �̻��� ���ӵ� �������� ���Ͽ� ���� �� �ִ� �ִ밪�� ���Ͽ�
 * ����ϴ� ���α׷��� �ۼ���
 */

public class Code12
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

		int max = 0;
		for ( int i = 0; i < n; i++ )
		{
			int sum = 0;
			for ( int j = i; j < n; j++ )
			{
				sum += data[j];
				if ( sum > max )
					max = sum;
			}
		}
		System.out.println(max);
	}
}
