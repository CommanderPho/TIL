package ch1_1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ����ڷκ��� n���� ������ �Է¹޴´�.
 * ������ �ϳ��� �Էµ� �� ���� 
 * ������� �Էµ� �������� ������������ �����Ͽ� ���
 */

public class Code15
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] data = new int[n];
		
		for(int i=0; i<n; i++)
		{
			data[i] = s.nextInt();
			
			// ����
			for(int j=i; j>0; j--)
			{
				if(data[j-1] > data[j])
				{
					int tmp = data[j-1];
					data[j-1] = data[j];
					data[j] = tmp;
				}
			}
			//���
			System.out.println(Arrays.toString(data));
//			for(int k=0; k<=i; k++)
//				System.out.print(data[k] + " ");
//			System.out.println();
			
		}
	}
}
