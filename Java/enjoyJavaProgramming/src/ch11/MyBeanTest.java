package ch11;

public class MyBeanTest
{
	public static void main(String [] args)
	{
		// ���� ��Ű������ defalut, protected, public
		MyBean bean = new MyBean();
		MyBean bean2 = new MyBean();
		bean.defaultInt = 100;
		bean.protectedInt = 1000;
		bean.publicInt = 100;
		
		if(bean == bean2)
			System.out.println("bean==bean2 ? yes");
		else
			System.out.println("bean==bean2 ? no");
	}
}
