package ch4_Exercise;

/*
 * 1+(-2)+3+(-4)+...�� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.
 */

public class ch4_4 {
	public static void main(String[] args) {
		int sum = 0; // ����
		int num = 0;
		for(int i=1; sum < 100; i++){
			if(i%2!=0)  // Ȧ�� �� ��
				sum+=i;
			else       // ¦�� �� ��
				sum+=-i; 
			
			num = i;
		}
		System.out.println(num+" ���� ���ؾ� ������ 100�̻�"+sum);
		
		sum = 0;
		int s = 1; // ��ȣ
		num = 0;
		
		for(int i=1;sum<100; i++, s=-s){
			num = s * i;
			sum += num;
		}
		System.out.println(num+" "+sum);
	}
}
