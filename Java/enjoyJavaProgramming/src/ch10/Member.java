package ch10;

public class Member
{
	// �̸��� ������
	// private�� �ܺο����� ���� �Ұ�, �ش� Ŭ�������� ��밡��
	// name : �Ӽ�, �ʵ�, �ν��Ͻ�����
	private String name;

	// name : �׳� parameter
	// this.name : �ش� �ν��Ͻ��� ������ �Ӽ�(�ʵ�)
	public Member(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
	
	// public�޼ҵ�� ��𿡼��� ȣ�Ⱑ��
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	
}
// �����ϵǸ� Member.class ������ ���������.
// jad�� �̿��Ͽ� ������ �Ͽ���.
//public class Member
//{
//	public Member()
//	{
//		
//	}
//}
