package ch2_variable;

public class Test {
	public static void main(String[] args) {
		int i = 91234567; // 8�ڸ��� 10����
		float f = (float)i;  // int�� float�� ����ȯ
		int i2 = (int)f; // float�� �ٽ� int�� ����ȯ
		
		double d = (double)i; // int�� double�� ����ȯ
		int i3 = (int)d;  // double�� �ٽ� in�� ����ȯ
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.printf("i=%d\n",i);
		System.out.printf("f=%f i2=%d\n",f,i2);
		System.out.printf("d=%f i3=%d\n",d,i3);
		System.out.printf("(int)%f=%d\n",f2,i4);
		/*
		 *  i=91234567
			f=91234568.000000 i2=91234568
			d=91234567.000000 i3=91234567
			(int)1.666000=1
		 */
		
		// �ֹι�ȣ 13�ڸ��� ���ڷ� �Ϸ���
		// 123456 1234567 long
		
		long regNo = 1234561234567L; // L�� ���ٿ� ����� �� ���̸� int�� �ν�
		
		// ���ͷ� : 100, 100L, 3.14f
		// ���� : i, l
		// Ű���� : int long fianl float
		// ��� : PI
		
//		a,d,e,g
// 		������������ ���� ũ���� �⺻�� : 4byte�� �� : int float
	}
}
