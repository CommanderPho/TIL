package ch3_operator_Excercise;

/*
 * �Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ����� ���� ���ϴ� �ڵ�
 * ���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�, 13���� �ٱ��ϰ� �ʿ�
 */
public class ch3_2 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples/sizeOfBucket) + ((numOfApples%sizeOfBucket == 0) ? 0 : 1);
		
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);
	}
}
