package ch8_exception;

public class FinallyTest3 {
	public static void main(String[] args) {
		method1();
		System.out.println("��");
	}

	static void method1(){
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1() finally���� ����ƽ��ϴ�.");
		}
	}
}
