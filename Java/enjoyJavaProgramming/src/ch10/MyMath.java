package ch10;

public class MyMath
{
	/*
	 * �����ڰ� private�ϸ�, �����ڴ� ������
	 * �ܺο��� ȣ�� �Ұ�
	 * �ܺο��� �����ڸ� �̿��Ͽ� �ν��Ͻ��� ���� ���Ѵ�.
	 * static�� �޼��带 �����ϸ� Ŭ������ �޼���� ��밡��
	 */
	private MyMath()
	{
		
	}
	
	public static int abs(int value)
	{
		if(value<0)
			return value * -1;
		else
			return value;
	}
}
