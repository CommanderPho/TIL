package etc;

public class ProductMatrix {
	public int[][] productMatrix(int[][] A, int[][] B) {
		
		//����� ���ϱ� ���ؼ� ���� ����� ���� ������ ���� ����� ���� ������ ���ƾ� �մϴ�
		// ���� ����� ���� ������ ���� ����� ���� ������ ���� ������ return null;
		if( A[0].length != B.length)
			return null;
		
		final int ROW = A.length;     // ��������� ���� ����
		final int COL = B[0].length;  // ��������� ���� ����
		final int B_ROW = B.length;   // ��������� ���� ����

		int[][] answer = new int[ROW][COL];  // ����� ������ ��������� [���Ǳ���] ��������� [���Ǳ���]�� ���ο� �迭�� ������

		for (int i = 0; i < ROW; i++) 
			for (int j = 0; j < COL; j++) 
				for (int k = 0; k < B_ROW; k++)
					answer[i][j] += A[i][k] * B[k][j];
		
		// ������
		for(int i=0; i<ROW; i++){
			for(int j=0; j<COL; j++){
				System.out.printf("%3d ",answer[i][j]);
			}
			System.out.println();
		}

		return answer;
	}

	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
		int[][] a = { { 1, 2 }, { 2, 3 }};
		int[][] b = { { 3, 4 }, { 5, 6 } };
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("����� ���� : " + c.productMatrix(a, b));

	}
}