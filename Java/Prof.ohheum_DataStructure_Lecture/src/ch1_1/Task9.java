package ch1_1;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  ����ڷ��� n���� ������ �Է¹޾� �迭�� ������ �� ¦�� �ε����� ����� ���� �״�� �ΰ�
 *  Ȧ�� �ε����� ����� ������ ������������ ������ ����ϴ� ���α׷��� �ۼ��϶�.
 *  ���� ��� �Էµ� ��������
 *  1 7 4 12 5 10 9 7�̶��
 *  ����� 1 7 4 7 5 10 9 12
 *  
 *  index 1 3  5  7 ...
 *        7 12 10 7 ... �� ����
 *        7 7  10 12 ...
 */

public class Task9
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] data = new int[n];
		for(int i=0; i<n; i++)
		{
			data[i] = s.nextInt();
		}
		
		s.close();
		
		for(int i=1; i<n; i+=2)
		{
			for(int j=1; j<n-i; j+=2)
			{
				if(data[j] > data[j+2])
				{
					int tmp = data[j];
					data[j] = data[j+2];
					data[j+2] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}
}
