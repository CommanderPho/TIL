package ch12;

public class BusFactory extends AbstractFactory
{

	@Override
	protected void init()
	{
		System.out.println("���� ���� �ʱ�ȭ");
	}

	@Override
	protected void make()
	{
		System.out.println("���� �����");
	}

	@Override
	protected void clear()
	{
		System.out.println("��������û��");
	}

}
