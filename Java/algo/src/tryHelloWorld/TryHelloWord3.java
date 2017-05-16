package tryHelloWorld;

import java.util.Arrays;

/*
 * Level 2 �ּҰ� �����
 * 
 * �ڿ����� �̷���� ���̰� ���� ���� A,B�� �ֽ��ϴ�. 
 * �ּڰ� ������ A, B���� ���� �� ���� ���ڸ� �̾� �� ���� ���� ���� �����Ͽ� ���մϴ�. 
 * �̷��� ������ ������ ���̸�ŭ �ݺ��Ͽ� ���������� ������ ����
 *  �ּҰ� �ǵ��� ����� ���� ��ǥ�Դϴ�.

���� ��� A = [1, 2] , B = [3, 4] ���
1. A���� 1, B���� 4�� �̾� ���Ͽ� ���մϴ�.
2. A���� 2, B���� 3�� �̾� ���Ͽ� ���մϴ�.

������ ���̸�ŭ �ݺ��Ͽ� �ּڰ� 10�� ���� �� ������, �� 10�� �ּڰ��� �˴ϴ�.
���� A,B�� �־��� ��, �ּڰ��� ��ȯ���ִ� getMinSum �Լ��� �ϼ��ϼ���.
 */

class TryHelloWord3 {
	public int getMinSum(int[] A, int[] B) {
		int answer = 0;

		for (int i = 0; i < A.length - 1; i++) {
			boolean changed = false;
			for (int j = 0; j < A.length - 1 - i; j++) {
				if (A[j] > A[j + 1]) {
					int tmp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = tmp;
					changed = true;
				}
			}
			if(changed == false) break;
		}
		
		for (int i = 0; i < B.length - 1; i++) {
			boolean changed = false;
			for (int j = 0; j < B.length - 1 - i; j++) {
				if (B[j] < B[j + 1]) {
					int tmp = B[j];
					B[j] = B[j + 1];
					B[j + 1] = tmp;
					changed = true;
				}
			}
			if(changed == false) break;
		}
		

		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[i];
		}

		return answer;
	}
	


	public static void main(String[] args) {
		TryHelloWord3 test = new TryHelloWord3();
		int[] A = { 1693, 5498, 8075, 7522, 3528, 7319, 5286, 6937, 8913, 1035 };
		int[] B = { 6079, 924, 1679, 2646, 3968, 5513, 8056, 5708, 5547, 1017 };
		System.out.println(test.getMinSum(A, B));
	}
}
