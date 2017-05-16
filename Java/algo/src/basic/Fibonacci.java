package basic;

public class Fibonacci {
//	for�� ����
//	public long fibonacci(int num) {
//		long answer = 0;
//		long indexSecond = 0;
//		long indexFirst = 1;
//		for(int i=2; i<=num; i++){
//			answer = indexFirst + indexSecond;
//			indexSecond = indexFirst;
//			indexFirst = answer;
//		}
//		return answer;
//	}
	
//	for�� �迭
	public long fibonacci(int num) {
		long answer = 0;
		long[] fiboArray = new long[num+1];
		fiboArray[0] = 0;
		fiboArray[1] = 1;
		
		for(int i=2; i<=num; i++){
			fiboArray[i] =fiboArray[i-2] + fiboArray[i-1];
		}
		answer = fiboArray[num];
		return answer;
	}
	
//	//����Լ�
//	public long fibonacci(int num) {
//		if(num == 1 || num == 2)
//			return 1;
//		else{
//			return fibonacci(num-1) + fibonacci(num-2);
//		}
//	}

  // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 5;
		System.out.println(c.fibonacci(testCase));
	}
}