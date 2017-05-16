package basic;

/*
 *  �ִ������� ������ ã�� �� �ִ� �˰���
 *  �� ���� m, n�̶�� �� ��,
 *  1. r = m % n���� ���� �������� r�̶� �� ��,
 *  r == 0 ? r�� 0�̸� �ִ� ������� �ȴ�.
 *  r != 0 ? r�� 0�� �ƴ϶�� m = n, n = r�� �ؼ� 1���� �ݺ�
 */
public class Euclideans_Algoritm {
	// static int gcd(int a, int b){
	// // a�� ū ����
	// if(a<b){
	// int tmp = a;
	// a = b;
	// b = tmp;
	// }
	// int r;
	// while(true){
	// r = a % b;
	// if(r==0) return b;
	// else{
	// a=b;
	// b=r;
	// }
	// }
	// }

	// ���ȣ�� ��ȿ������ ��... a<b������ �Ź�������ϰ�...
	// �ݺ����� ���� �˾ƺ��� ���� �͵� �ƴϰ�
	// static int gcd(int a, int b){
	// int result = 0;
	// if(a<b){
	// int tmp = a;
	// a = b;
	// b = tmp;
	// }
	// int r = a % b;
	// if(r==0) result = b;
	// else gcd(b,r);
	//
	// return result;
	// }

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	// a * b == gcd(a,b) * lcm(a,b);
	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static void main(String[] args) {
		System.out.println(Euclideans_Algoritm.gcd(87, 61));
		System.out.println(Euclideans_Algoritm.lcm(87, 61));
	}

}
