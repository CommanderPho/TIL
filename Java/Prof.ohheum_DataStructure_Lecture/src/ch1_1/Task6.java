package ch1_1;

import java.util.Scanner;

/*
 * ����ڷκ��� �ϳ��� ���� ���� n�� �Է¹޴´�. n ���� ũ�ų� �����鼭
 * ���� ���� 2�� �ŵ��������� ã�Ƽ� ����ϴ� ���α׷�
 * n=12 2�� 4���� 16
 */
public class Task6
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int count = 0;
		int squareOfTwo = 1;
		while(n > squareOfTwo)
		{
			squareOfTwo*=2;
			count++;
		}
		
		System.out.printf("2�� %d���� %d�Դϴ�.",count,squareOfTwo);
	}
}
