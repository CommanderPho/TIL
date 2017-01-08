package ch6;

public class MemberCall {
	int iv = 10; //�ν��Ͻ� ����
	static int cv= 20; // Ŭ��������
	
	int iv2 = cv; //
//	static int vb2 = iv; // error, Ŭ���������� �ν��Ͻ� ������ ����� �� ����.
	static int cv2 = new MemberCall().iv; // ��ü�� �����ؾ� ��� ����.
	
	static void staticMethod1(){
		System.out.println(cv);
//		System.out.println(iv); // ����, Ŭ�����޼��忡�� �ν��Ͻ� ������ ��� �Ұ�.
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // ��ü�� ������ �Ŀ��� �ν��Ͻ������� ���� ����
	}
	void instanceMethod1()
	{
		System.out.println(cv);
		System.out.println(iv); //�ν��Ͻ� �޼��忡���� �ν��Ͻ������� �ٷ� ��밡��.
	}
	static void staticMethod2()
	{
		staticMethod1();
//		instanceMethod1(); // ����, Ŭ�����޼��忡���� �ν��Ͻ��޼��带 ȣ���� �� ����.
		new MemberCall().instanceMethod1(); // �ν��Ͻ��� ������ �Ŀ��� ȣ���� �� ����.
	}
	void instaceMethod2() // �ν��Ͻ��޼��忡���� �ν��Ͻ��޼���� Ŭ�����޼��� ��� 
	{                     // �ν��Ͻ� �������� �ٷ� ȣ���� �����ϴ�.
		staticMethod1();
		instanceMethod1();
	}
}