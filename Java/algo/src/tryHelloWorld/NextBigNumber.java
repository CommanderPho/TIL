package tryHelloWorld;
/*
 * � �� n(1<= n <=1,000,000)�� �־����� ��, N�� ���� ū ���ڴ� ������ �����ϴ�.
 * N�� ���� ū ���ڴ� N�� 2������ �ٲپ��� ���� 1�� ������ ���� ������ �̷���� ��
 * 1��° ������ �����ϴ� ���ڵ� �� N���� ū �� �߿��� ���� ���� ���� ã�ƾ� �Ѵ�.
 * ���� ��� 78�� 2������ �ٲٸ� 1001110�̸�, 78�� ���� ū ���ڴ�
 * 83���� ������ 1010011�Դϴ�.
 * 
 *      int postPattern = n & -n, smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
        return n + postPattern | smallPattern;
 */

public class NextBigNumber {
	static int nextBigNumber(int n){
		int countOne = Integer.bitCount(n);
		while( 1<=n && n<= 1_000_000){
			++n;
			if(countOne==Integer.bitCount(n))
			      return n;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int n = 78;
		System.out.println(nextBigNumber(n));
		System.out.println(Integer.toBinaryString(-n));
	}
}
