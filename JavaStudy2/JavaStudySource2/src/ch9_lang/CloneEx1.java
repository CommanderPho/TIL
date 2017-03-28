package ch9_lang;

class Point implements Cloneable{
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "x=" + x + ", y=" + y;
	}
//	public Object clone(){
//  ����ȯ��ȯŸ��. ����Ŭ������ ��ȯŸ���� �ڼ�Ŭ������ Ÿ������ ������ �� ����
//	���ŷο� ����ȯ ��������
	public Point close(){  
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {}
		
//		return obj;
		return (Point)obj;
	}
}

public class CloneEx1 {
	public static void main(String[] args) {
		Point original = new Point(3,5);
//		Point clone = (Point)original.clone();
		Point clone = original.close();
		System.out.println(original);
		System.out.println(clone);
	}
}
