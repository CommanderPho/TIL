package ch15_Object_String;

public class StringTest2
{
	public static void main(String [] args)
	{
		/*
		 * String �Һ�Ŭ���� String��
		 * � �޼ҵ�� ���� ���� �������� �ʰ�
		 * ���ο� ���ڿ��� ��ȯ
		 */
//		String helloWorld = "Hello World!!!";
//		String str = helloWorld.substring(5);
//		System.out.println(helloWorld);
//		System.out.println(str);
//		
//		String str3 = "hello " + "world";
//		// String str3 = new StringBuffer().append("hello ").append("world").toString();
		
		long start1 = System.nanoTime();
		String str2 = "";
		for(int i=0; i<100; i++)
		{
			str2 = str2 + "*";
			// str2 = new StringBuffer().append(str2).append("*").toString();
			// ����ؼ� �ν��Ͻ� ��� -> ������ �޸� ����
			// ���ڿ��� for���� +�� ���� StringBuffer()�� Builder Builder�� not thread safe
		}
		long end1 = System.nanoTime();
//		System.out.println(str2);
		System.out.println(end1-start1);  // 106053
		
		long start2 = System.nanoTime();
		StringBuilder str3 = new StringBuilder();
		for(int i=0; i<100; i++)
		{
			str3.append("*");
		}
		long end2 = System.nanoTime();
//		System.out.println(str3.toString());
		System.out.println(end2-start2); // 9836
		
	}
}
