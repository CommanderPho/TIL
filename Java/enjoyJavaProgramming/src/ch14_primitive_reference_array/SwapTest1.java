package ch14_primitive_reference_array;

public class SwapTest1
{
	public static void main(String [] args)
	{
		int x = 5;
		int y = 10;
		System.out.printf("������ , x : %d, y : %d\n",x,y);
		swap(x,y);
		System.out.printf("������ , x : %d, y : %d\n",x,y);
	}
	
	public static void swap(int x, int y)
	{
		int tmp = x;
		x = y;
		y = tmp;
		System.out.printf("���Ҹ޼��� �ȿ���, x : %d, y : %d\n",x,y);
	}
}
