package ch1_1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * n���� ���� �Է¹ް�
 * ���� �ٸ��鼭 ���̰� ���� ���� �� ���� ã�� ��
 * n=5 
 * 8 1 6 9 6
 * ���̰� �ּ��� ���� 8�� 9�̴�.
 * 
 * 
 * ���� �ϰ� ������ �͵��� ���� ���ϸ�
 * 0 1 2 3 4 index
 * 1 6 6 8 9 
 *  5 0 2 1
 *  0 1 2 3 index
 */

public class Task7
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] data = new int[n];
		int[] diffArr = new int[n-1];
		int minindex = 0;
		int min = 0;
		
		for(int i=0; i<n; i++)
		{
			data[i] = s.nextInt();
		}
		
		Arrays.sort(data);
		
		for(int i=0; i<n-1; i++)
		{
			diffArr[i] = Math.abs(data[i] - data[i+1]);
		}
		
		min = diffArr[0];
		for(int i=1; i<n-1; i++)
		{	
			if( diffArr[i] < min && diffArr[i] !=0)
			{
				min = diffArr[i];
				minindex = i;
			}
		}
		System.out.println(data[minindex] + " " +data[minindex+1]);
	}
}
