package ch9;

public class WrapperEx3 {
	public static void main(String[] args) {
		int i = 10;
		
		//�⺻���� ���������� ����ȯ (����ȯ ��������)
		Integer intg = (Integer)i; // Integer intg = Integer.valueOf(i);
//		Integer intg = i;
		
		Object obj = (Object)i; // Object obj = (Object)Integer.valueOf(i);
				
		Long lng = 100L; // Long lng = new Long(100L);
		
		int i2 = intg + 10; // �������� �⺻������ ���� ����
		long l = intg + lng; // ������ ���� ������ ����
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2; // �������� �⺸������ ����ȯ�� ����(����ȯ ��������)
		
		Integer intg3 = intg2 + i3;
		
		System.out.println("i\t="+i);
		System.out.println("intg\t"+intg);
		System.out.println("obj\t"+obj);
		System.out.println("lng\t"+lng);
		System.out.println("intg + 10\t"+i2);
		System.out.println("intg + lng \t"+l);
		System.out.println("intg2\t"+intg2);
		System.out.println("i3\t"+i3);
		System.out.println("intg2+i3\t"+intg3);
	}
}
