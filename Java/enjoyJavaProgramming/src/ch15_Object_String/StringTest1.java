package ch15_Object_String;

public class StringTest1
{
	public static void main(String [] args)
	{
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		if(str1 == str2)
		{
			System.out.println("str1 == str2");
		}
		if(str1 == str3)
		{
			System.out.println("str1 == str3");
		}
		if(str3 == str4)
			System.out.println("str3==str4");
		
		/*
		 * new�� ������
		 * str1�� str2�� "hello"�� ����Ŵ. "hello"�� ����� ���Ǯ
		 * new�� ����ϸ� "hello"�� ���޸𸮿� ����
		 * 
		 * str1 str2 �� "hello"
		 * str3�� "hello"
		 * str4�� "hello"
		 */
		
	}
}
