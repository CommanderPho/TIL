package ch1_1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ����ڷκ��� n���� ������ �Է¹��� �� ������������
 * ����(sort)�Ͽ� ����ϴ� �ڵ��̴�.
 */

public class Code14
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int [] data = new int [input];

		for ( int i = 0; i < input; i++ )
			data[i] = s.nextInt();

		s.close();
		
		// ��������
		for ( int i = input-1; i>0; i-- )
		{
			boolean isChanged = false;
			for ( int j = 0; j < i; j++ )
			{
				if ( data[j] > data[j + 1] )
				{
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
					isChanged = true;
				}
			}
			if(!isChanged)
				break;
		}
		System.out.println("����"+Arrays.toString(data));
	}
}
