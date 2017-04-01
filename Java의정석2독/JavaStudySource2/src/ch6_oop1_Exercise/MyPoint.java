package ch6_oop1_Exercise;

public class MyPoint {
	int x;
	int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//�ν��Ͻ��� �� ����
	double getDistance(int x1, int y1) {
		return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
	}

}
