package ch1_1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ����ڷκ��� n���� ������ �Է¹޴´�.
 * ������ �ϳ��� �Էµ� �� ���� 
 * ������� �Էµ� �������� ������������ �����Ͽ� ���
 * ������ ��
 */

public class Code15_2
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] data = new int[n];
		
		// i�� �Է¹޴� ���� �� 1���� n
		for(int i=1; i<=n; i++)
		{
			int input = s.nextInt();
			
			// �ڿ��� ���� �� 
			// �� �� index�� ����-1�̱� ������
			int j = i-1;
			
			// �Է°��� index 0 ���� ���ϸ鼭 input������ ���� �� ã��
			// �׷��ϱ� j�� 0���� ũ�ų� �����鼭 data[j] > tmp�� �� ���ٰ� ������
			// ���� �� ã���Űų�  0���� ã�Ҵµ� ���� ��(input���� ���� �� ����)
			while(j>=0 && data[j] > input)
			{
				// input���� ũ�� �� ĭ�� �ڷ� �б�
				data[j+1] = data[j];
				j--;
			}
			// 
			data[j] = input;
			
			//���
			System.out.println(Arrays.toString(data));
//			for(int k=0; k<=i; k++)
//				System.out.print(data[k] + " ");
//			System.out.println();
			
		}
	}
}
