package ch8;

public class FinallyTest3 {
	
	static void method1(){
		try {
			System.out.println("method1()�� ȣ��ƽ��ϴ�.");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("method1()�� finally���� �����");
			/*
			 * try������ return���� ����ǵ� finally���� ������� ���� ����� �Ŀ�, 
			 * ���� ���� ���� �޼��带 ����
			 */
		}
	}
	
	public static void main(String[] args) {
		method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼���� ���ƿ���");
	}

}
