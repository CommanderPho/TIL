package ch10;

public class MemberTest
{
	public static void main(String [] args)
	{
		// new Member : Member�ν��Ͻ��� ���������.
		// Member(String) : �����ڰ� ȣ��ȴ�.
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�Ѹ�");
		
		System.out.println(m1.getName());
		System.out.println(m2.getName());
	}
}
