package ch6_oop1_Exercise;

class MemberCall{
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;  // static������ �ν��Ͻ����� ��� ����
	
	static void staticMethod1(){
		System.out.println(cv);
//		System.out.println(iv); // static�޼��� �ν��Ͻ� ���� ��� ����
	}
	
	void instanceMethod1(){
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2(){
		staticMethod1();
//		instanceMethod1(); static�޼��� �ν��Ͻ� �޼��� ��� ����
	}
	
	void instanceMethod2(){
		staticMethod1();
		instanceMethod1(); 
	}
	/*
	 * static������ �޼���� �ν��Ͻ� ������ �޼��� ��� ���� static�� ������ �� �ν��Ͻ��� �������� ���� �� ����.
	 * �� ����Ϸ��� ��ü�� ���� �� ���.
	 */
}

public class ch6_18 {

}
