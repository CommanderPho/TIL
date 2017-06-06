package ch11;

// MyBean�� ch11 ��Ű���� ���� �ִ�.
// package�ȿ� Ŭ������ ����ٸ� �ݵ�� ù ��° �ٿ�
// package �ش� Ŭ������ �����ִ� ��Ű������ �־�� �Ѵ�.
// package��  �ִ� �ҽ��� �������� �� -d �ɼ��� ����Ѵ�
// javac -d ��Ű���������ɰ�� �ҽ���
// javac -d c:/tmp �ҽ���.java
// tmp�Ʒ��� ch11�� ����� Ŭ���� ������ �����

// JVM�� CLASSPATH�� �����ִ� Ŭ�������� ����� �� �ִ�.
// CLASSPATH�� ch11������ �ִ� ��ΰ� ������ �־�� JVM���� ����� �� �ִ�.
public class MyBean
{
	protected int protectedInt; // �ʵ�, �ν��Ͻ� ����
	public int publicInt;
	private int privateInt;
	int defaultInt;
	public MyBean()
	{
		this.privateInt = 100;
		// �ߺ��� �̸��� ���ٸ�
//		privateInt = 100;
	}
	
	/*
	 * public : ��𼭵� ���� ����
	 * protected : ���� package, �ٸ� package���� ��ӹ��� �ڽ�
	 * default : ���� ��Ű��
	 * private : �ش� Ŭ���� �ȿ�����
	 * �ʵ峪 �޼ҵ� � ���� �� �ִ�.
	 */
	
	
}
