package ch8;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			try {} catch (Exception e2) {}
		} catch (Exception e) {
//			try {} catch (Exception e) {} // ����. ���� e�� �ߺ� ����
		}
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
