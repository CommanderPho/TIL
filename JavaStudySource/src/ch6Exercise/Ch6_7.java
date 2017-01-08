package ch6Exercise;

//Ch6_6���� �ۼ��� Ŭ�����޼��� getDistance()�� 
//MyPoint Ŭ������ �ν��Ͻ� �޼���� ����

class MyPoint{
	int x;
	int y;
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	double getDistance(int x1, int y1)
	{	
		// ��Ʈ( (x-x1) * (x-x1) + (y-y1) * (y-y1) )
//		return Math.sqrt( (x-x1) * (x-x1) + (y-y1) * (y-y1));
		return Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2));
		
		// Math.pow ���� �޼��带 ȣ���ϴ� ���� �������꺸�� ����� ���� ��� �۾�!!!
	}
	
}

public class Ch6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		//p�� (2,2)�� �Ÿ��� ���Ѵ�.
		System.out.println(p.getDistance(2,2));
	}

}
