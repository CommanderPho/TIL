package ch8;

public class ExceptionEx11 {
	public static void main(String[] args) {
		throw new RuntimeException();
		// ������ ������ ���� �ʴ´�.
		// RuntimeExceptionŬ������� �� �ڼ� Ŭ������ �ش��ϴ� ���ܴ� 
		// ���α׷��Ӱ� �Ǽ��� �߻��ϴ� �͵��̱� ������ ����ó���� �������� �ʴ´�.
		
		/*
		 * �����Ϸ��� ����ó���� Ȯ������ �ʴ� RuntimeExceptionŬ�������� 'unchecked����'��� �θ���
		 * ����ó���� Ȯ���ϴ� ExceptionŬ�������� 'checked����'��� �θ���.
		 * 
		 * Error�� �� �ڼյ� unchecked�����̴�. try - catch������ ó���� �� ���� ����
		 */
	}
}
