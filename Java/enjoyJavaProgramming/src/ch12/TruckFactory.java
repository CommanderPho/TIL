package ch12;

public class TruckFactory extends AbstractFactory
{

	@Override
	protected void init()
	{
		System.out.println("Ʈ�������ʱ�ȭ");
	}

	@Override
	protected void make()
	{
		System.out.println("Ʈ�������");
		
	}

	@Override
	protected void clear()
	{
		System.out.println("Ʈ������û��");
		
	}

}
