package ch2_variable;

public class CastingEx4 {
	public static void main(String[] args) {
		int i = 91234567; // 8�ڸ��� 10����
		float f = (float)i; // int�� float�� ����ȯ
		int i2 = (int)f;
		
		double d = (double)i; // int�� double�� ����ȯ  // double d = i;
		int i3 = (int)d;
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.printf("i=%d\n",i);  // i=91234567
		System.out.printf("f=%f i2=%d\n",f,i2);  // =9123 4568.000000 i2=91234568 
		// float�� 10������ 7�ڸ��� ���е��� int 8�ڸ� �̻��� double�� �ؾ���
		
		System.out.printf("d=%f i3 = %d\n",d,i3);
		System.out.printf("(int)%f=%d\n",f2,i4);
	}
}
