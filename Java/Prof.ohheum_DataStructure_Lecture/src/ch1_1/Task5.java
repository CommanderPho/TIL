package ch1_1;

import java.util.Scanner;

/*
 * ����ڷκ��� 4���� ������ �޾Ƽ� �ִ밪�� �ּҰ����ϰ�
 * �� 2���� �� ��
 * �Է������� Task3�� ����
 */

public class Task5
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int max = 0;
		int min = 0; 
		int input = 0;
		max = min = s.nextInt();
		
		for(int i=0; i<n-1; i++)
		{
			input = s.nextInt();
			if(input>max)
				max = input;
			if(input < min)
				min = input;
		}
		
		s.close();
		
		System.out.println(max-min);
	}
}
