package ch8_Exception;

public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			throw new Exception("���� �߻���Ű��");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
