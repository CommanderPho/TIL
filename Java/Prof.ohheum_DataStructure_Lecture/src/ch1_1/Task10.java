package ch1_1;

import java.util.Scanner;

/*
 * ����ڷκ��� �ϳ��� ���� ���� n�� �Է¹ް�
 * �̾ n���� ������ �Էµȴ�.
 * �׷� ���� �ٽ� �ϳ��� ���� K�� �Էµȴ�.
 * 
 * n���� ������ �߿��� 2���� ������ ������ �� ����  K�� �Ǵ� ����� ���� ī��Ʈ
 * 5
 * 1 2 3 4 5 
 * 3
 * 
 * ���� ���� �ߺ� ���� X  
 * ��� ���� �� ���ؾ� �ϳ�?
 * 
 */

public class Task10
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
//		����ڷκ��� �ϳ��� ���� ���� n�� �Է¹ް�
		int n = s.nextInt();
		int[] data = new int[n];
//		 �̾ n���� ������ �Էµȴ�.
		for(int i=0; i<n; i++)
			data[i] = s.nextInt();
//		 �׷� ���� �ٽ� �ϳ��� ���� K�� �Էµȴ�.
		int k = s.nextInt();
		
		int count = 0;
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=i; j<n-1-i; j++)
			{
				if((data[j]+data[j+1]) == k)
					count++;
					
			}
		}
		
		System.out.println("count " + count);

	}
}
