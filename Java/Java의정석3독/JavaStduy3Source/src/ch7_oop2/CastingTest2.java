package ch7_oop2;
public class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
//		fe = (FireEngine)car; 
		// �� ���� ����� ����.
		/* ��������(car)�� �����ϰ� �ִ� �ν��Ͻ��� CarŸ���� �ν��Ͻ���
		 * ����Ÿ���� �ν��Ͻ��� �ڼ�Ÿ���� ���������� �����ϴ� ���� ������ �ʴ´�.
		 */
		car = new FireEngine();
		fe = (FireEngine)car;
		
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
