package ch4_Exercise;

/*
 * 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
 */
public class ch4_2 {
	public static void main(String[] args) {
		int sum=0;  // ����
		
//		for(int i=1; i<21; i++)  {  // 1���� 20���� �ݺ�
//			if(i%2==0 || i%3==0)
//				continue;
//			System.out.println(i);
//			sum+=i;
//		}
		for(int i=1; i<21; i++)
		{
			if(i%2!=0 && i%3!=0){
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
		
	}
}
