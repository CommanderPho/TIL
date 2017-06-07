package ch13_interface;

import java.lang.reflect.Method;

public class DiceTest
{	
	// main�޼ҵ� �ڿ� throws Exception�̶�� ������ Exception���� ���ѱ��
	public static void main(String [] args) throws Exception
	{
		// �������̽��� ����type�� �� �� �ִ�.
		Dice dice1 = new Dice6();
		Dice dice2 = new Dice9();
		
		// Dice type���� ������ �����ϴ� ����
		// �ش� �������̽��� �����ϰ� �ִ� Ŭ������ �����̵��� ���� �̿� ����
		System.out.println(dice1.get());
		System.out.println(dice2.get());
		
		// ���÷���
		// Ŭ�����̸��� ���ڿ��̴ϱ� ���������̳� �ܺηκ��� �� �پ��� ��ηκ��� ���� �� �ִ�.
		String className ="ch13_interface.Dice9";
		// ClassLoader�� �̿��Ͽ� className�� �ش��ϴ� Ŭ������ ������ �о�鿩��
		// �޸𸮿� �ø��� �� Ŭ���� ������ ������ clazz��� ������ ����
		// clazz������ �̿��ϸ� Ŭ�����̸�, �ʵ�����, �޼ҵ� ���� ���� ���� �� �ִ�.
		Class clazz = Class.forName(className);
		Method[] methods = clazz.getMethods();
		for(int i=0; i<methods.length; i++)
		{
			System.out.println(methods[i].getName());
		}
		
		// clazz.newInstance(); clazz�� ������ �ִ� ������ �̿��Ͽ� �ν��Ͻ��� ������
		// new Dice9();
		Dice dice3 = (Dice)clazz.newInstance();
		Dice dice4 = (Dice)clazz.newInstance();
		System.out.println("dice3 : "+dice3.get());
	}
}
