package ch05;

public class MyBeanTest
{
	public static void main(String [] args)
	{
		// ���� package�� �ִ� Ŭ������ import�� �ʿ䰡 ����.
		
		// MyBean�� ������ �ִ� Ŭ�������� ����� �� �ֵ���
		// �̸� �޸𸮿� �ö󰣴�.
		// ���� Ŭ������ ��ũ���� �� �� ���� �о���δ�.
		// �� �� �о���� Ŭ���� ������ �޸𸮿� �ö� �ְ�,
		// �� ��° ���ʹ� �޸𸮿� �ִ� Ŭ���� ������ ����Ѵ�.
		// 1) MyBean.staticValue�� �̸� �޸𸮿� �ö󰣴�.
		// 2) MyBean�ν��Ͻ��� ��������� �� �ν��Ͻ��� ����� �� �ִ�
		// bean1���������� ���������.
		MyBean bean1 = new MyBean();
		
		// 3) MyBean�ν��Ͻ��� ��������� �� �ν��Ͻ��� ����� �� �ִ�
		// bean2���������� ���������.
		MyBean bean2 = new MyBean();
		MyBean.staticValue = 5;
		System.out.println(MyBean.staticValue);
		bean1.instanceValue = 100;
		System.out.println(bean2.instanceValue);
		System.out.println(bean2.instanceValue);
	}
}
