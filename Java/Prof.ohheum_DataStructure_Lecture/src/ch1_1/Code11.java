package ch1_1;

import java.util.Scanner;

/*
 * ���� n�� �Է¹���
 * n���� ������ �Է¹޾� ������� �迭�� ����
 * �ߺ��� ���� ���� ������ ī��Ʈ�Ͽ� ���
 * ���� ��� n=6�̰� 2,4,2,4,5,2�̸� �ߺ��� ��������
 * (2,2) (2,2), (2,2) (4,4) 4���̴�.
 * 
 */
public class Code11
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
		
		// index 0 -> 1���� n���� ��
		// index 1 -> 2���� n���� ��
		// n-1���� �ϸ鼭 ������ count++;
		
		int count = 0;
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(data[i]==data[j])
					count++;
			}
		}
		
		System.out.println(count);
	}
}
