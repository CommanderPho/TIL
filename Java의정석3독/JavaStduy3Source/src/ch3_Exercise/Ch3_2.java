package ch3_Exercise;

public class Ch3_2 {
	public static void main(String[] args) {
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = numOfApples / sizeOfBucket + (numOfApples%sizeOfBucket != 0 ? 1 : 0);
//				int numOfBucket = numOfApples / sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);

		
		System.out.println(numOfBucket);
	}
}
