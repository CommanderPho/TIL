package ch8;

public class Exception_re_throwing {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("���� �޼��忡�� ���ܰ� ó���ƽ��ϴ�.");
		}
	}
	static void method1() throws Exception{
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("�޼���1���� ���ܰ� ó���ƽ��ϴ�.");
			throw e;
		}
		
	}

}
