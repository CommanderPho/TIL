package ch1_1;

import java.util.Scanner;

/*
 * ����ڷ� ���� n���� ������ �޾Ƽ� �� �� ��� ¦���� ���� ����
 * ��� Ȧ���� �� ���� ����� ���
 * ¦���� ���ϰ� Ȧ���� ����
 */

public class Task3
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int input = 0;

		for ( int i = 0; i < n; i++ )
		{
			input = s.nextInt();
			if ( input % 2 == 0 )
				sum += input;
			else
				sum -= input;
		}
		
		System.out.println(sum);
	}
}
