package basic;
/*
 * �Ҽ� ã��
 * �Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ�
 * 1�� �Ҽ��� �ƴմϴ�.
 * 10�� �Է¹޾Ҵٸ�, 1���� 10������ �Ҽ��� [2,3,5,7] 4���� �����ϹǷ� 4�� ��ȯ
 * 5�� �Է¹޾Ҵٸ�, 1���� 5������ �Ҽ��� [2,3,5]3���� �����ϹǷ� 3�� ��ȯ
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;

public class NumOfPrime {
	int numberOfPrime(int n) {
		int result = 0;
//		int checkCnt=0;
//		for(int i=2; i<=n; i++){
//			for(int j=1; j<=i; j++)
//				if(i%j==0) checkCnt++;
//			if(checkCnt==2) result++;
//			checkCnt=0;
//		}  4956... 4��...
//		--------------------------------------------
//		for(int i=2; i<=n; i++){
//			boolean check = true;
//			for(int j=2; j<i; j++){
//				if(i%j==0) {
//					check = false;
//					break;
//				}
//			}
//			if(check==true)
//				result++;
//		}  // 442 0.4��
//		
//		return result;
		
//	    �Է¹��� ������ ���� ���� �Ҽ��鸸 ������� �Ǵ� ��   // 83, 0.083��
		ArrayList<Integer> prime = new ArrayList<>();
		prime.add(2);
		for(int i=2; i<=n; i++)
		{
			for(int j=0, primeSize = prime.size(); j < primeSize; j++ ){
//				for(int i =0, length = array.length; i < length; i++){} // for���� ������ �Լ� nono ����� ��ó���ʱ�ȭ�� ���
				 
				if(i%prime.get(j)==0) break; // �Ҽ��� �ƴѰ��
				
				if(j+1==prime.size()) // �Ҽ��� ��
					prime.add(i);
			}
		}
		System.out.println(prime);
		return prime.size();
		
//		// �����佺�׳׽��� ü�˰��� int�迭��� 2, 0.002��
//		int[] arr = new int[n+1];
//
//		for(int i=2; i<=n;i++){
//			arr[i]=i;
//		}
//		for(int i=2; i*i<=n; i++){
//			if(arr[i]==0) continue;
//			for(int j=i+i; j<=n; j+=i){
//				arr[j] = 0;
//			}
//		}
//		for(int i=2; i<=n; i++){
//			if(arr[i]!=0)
//				result++;
//		}
//		return result++;
	}
	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		long start = System.currentTimeMillis();
		System.out.println( prime.numberOfPrime(6) );
		long end = System.currentTimeMillis();
		System.out.println(end-start);

	}
}