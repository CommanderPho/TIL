package ch4_Exercise;
/*
 * ȸ������ ���ϴ� ���α׷�
 * ȸ���� : ���ڸ� �Ųٷ� �о ������ �д� �Ͱ� ���� ��
 * �� '12321' �̳� '13531'
 * ��Ʈ : ������ ������ �̿�
 */
public class ch4_15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		while(tmp!=0){
//			result*=10;
//			result += tmp % 10;
			result = result *10 + tmp%10;
			tmp /= 10;
		}
		System.out.println(result);
		if(number == result)
			System.out.println( number + "�� ȸ���� �Դϴ�.");
		else
			System.out.println( number + "�� ȸ���簡 �ƴմϴ�.");
	}
}
