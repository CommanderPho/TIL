package ch7;

public class ClassCastingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car; 
		// ����, ���� ���� car�� �����ϰ� �ִ� �ν��Ͻ��� CarŸ��
		// ����Ÿ���� �ν��Ͻ��� �ڼ�Ÿ���� ���������� �����Ѵ� ���� ������ �ʴ´�.
		// Car car = new FireEngine(); �̶�� �ϸ� ������ �� ����.
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
