package ch8_exception;

public class ExceptionEx14 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main�޼��忡�� ���ܰ� ó���ƽ��ϴ�.");
			e.printStackTrace();
		}
	}
	static void method1() throws Exception{
		throw new Exception();
	}
}
