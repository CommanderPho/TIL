package ch12;

public class CarFactroy extends AbstractFactory
{
	@Override
	protected void init()
	{
		System.out.println("�ڵ������� �ʱ�ȭ");
	}

	@Override
	protected void make()
	{
		System.out.println("�ڵ����� ����");
	}

	@Override
	protected void clear()
	{
		System.out.println("�ڵ��� ���� �ʱ�ȭ");
	}

}
