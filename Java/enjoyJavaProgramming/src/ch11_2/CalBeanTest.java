package ch11_2;

import ch11.CalBean;

public class CalBeanTest
{
	public static void main(String [] args)
	{
		// �ν��Ͻ��� ���� �� ����� ����
		// ������ �ν��Ͻ��� �����ž� �ϱ� ����
		// ����� ���� class�� �ִ�. class�� �ν��Ͻ��� Ʋ
		// �׷��� �� �ν��Ͻ��� �ϳ��� ����� �ʹ�. ���� �� ������ ����
		// �� �� ���� �� singleTon���� ex) CalBean.java
		
//		CalBean cal = new CalBean();
		System.out.println("------------------------");
		CalBean bean = CalBean.getInstance();
		CalBean bean2 = CalBean.getInstance();
		System.out.println("------------------------");
		if(bean == bean2)
			System.out.println("bean==bean2 ? yes");
		else
			System.out.println("bean==bean2 ? no");
		
		int value = bean.plus(5 , 10);
		System.out.println(value);
	}
}
