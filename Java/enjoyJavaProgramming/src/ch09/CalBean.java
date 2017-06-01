package ch09;

public class CalBean
{
	public static void main(String [] args)
	{
		int k = 6;
		int n = 0;
		try
		{
			System.out.println(cal.divide(k , n));
		}
		catch ( ParameterException | ArithmeticException e )
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("������ �߻��ߵ� �� �ߵ� ������ ����Ǵ� ����");
		}
		
	}
}

class cal
{
	public static int divide(int k, int n) throws ParameterException
	{
		if(n==0) throw new ParameterException("0���� ���� ��  �����.");
		
		return k/n;
	}
}

class ParameterException extends Exception
{
	public ParameterException(String msg)
	{
		super(msg);
	}
	
	public ParameterException(Exception e)
	{
		super(e);
	}
}