package ch8_Exception;

public class FinallyTest3 {
	public static void main(String[] args) {
		method1();
		System.out.println("��");
	}
	static void method1(){
		try {
			System.out.println("method1()�� ȣ��ƽ��ϴ�.");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1() finally���� ���صƽ��ϴ�.");
		}
	}
	
	/*  retrun�� ���� ������ �޼ҵ尡 �ٷ� ������� �ʰ� finally�ȿ� �ִ� ������� ������ �� ���� �ȴ�.
	 *  method1()�� ȣ��ƽ��ϴ�.
		method1() finally���� ���صƽ��ϴ�.
		��
	 */
}
