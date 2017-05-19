package ch1_1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �Է����� �� ���(p*q ��İ� q*r ���)�� �޾Ƽ� �� ����� ���Ѵ� ���α׷�
 * p�� q�� �־����� 
 * �̾����� p �ٿ��� q���� ������ �־�����.
 * �� ��° ����� ũ�� q�� r�־�����
 * ���������� �̾����� q�ٿ��� �� �ٸ��� r���� ������ �־�����.
 */

public class Task11
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		int q = s.nextInt();

		int[][] pq = new int [p][q];
		for ( int i = 0; i < p; i++ )
		{
			for ( int j = 0; j < q; j++ )
			{
				pq[i][j] = s.nextInt();
			}
		}

		q = s.nextInt();
		int r = s.nextInt();

		int[][] qr = new int [q][r];

		for ( int i = 0; i < q; i++ )
		{
			for ( int j = 0; j < r; j++ )
			{
				qr[i][j] = s.nextInt();
			}
		}
		
		int[][] sum = new int[p][r];
		
		for(int i=0; i<p; i++)
		{
			for(int j=0; j<r; j++)
			{
				for(int k=0; k<q; k++)
				{
					sum[i][j] += pq[i][k] * qr[k][j];
				}
			}
		}
		
		for(int i=0; i<sum.length; i++)
		{
			for(int j=0; j<sum[i].length; j++)
			{
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

	}
}
