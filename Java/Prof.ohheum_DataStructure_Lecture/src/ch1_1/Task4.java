package ch1_1;

import java.util.Scanner;
/*
 * ���� ���� n�� �Է¹޴´�.
 * �׷� ���� ������ ���� n���� �߷��ϴ�
 * 1
 * 12
 * 123
 * 1234
 */

public class Task4
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		
		int input = s.nextInt();
		
		s.close();
		
		for(int i=1; i<=input; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
