package ch1_1;

import java.util.Arrays;
import java.util.Scanner;


/*
 * n���� ������ �Է¹޾� ������� �迭�� �����Ѵ�.
 * �׷� ���� ��� �������� �� ĭ�� ���������� �̵�
 * ������ ������ �迭�� ù ĭ���� �̵�
 */
public class Code9
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] num = new int[n];
		
		for(int i=0; i<n; i++)
			num[i] = s.nextInt();
		s.close();
		
		int lastToFirst = num[n-1];
		for(int i=n-2; i>=0; i--)
		{
			num[i+1] = num[i];
		}
		num[0] = lastToFirst;
		
		System.out.println(Arrays.toString(num));
	}
}
