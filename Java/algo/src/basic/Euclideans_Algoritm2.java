package basic;

public class Euclideans_Algoritm2 {
	// ĭ��ī���� ��Ŭ����, Ȯ����Ŭ����˾ƺ���
	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static void main(String[] args) {
		System.out.println(Euclideans_Algoritm2.gcd(87, 61));
		System.out.println(Euclideans_Algoritm2.lcm(24, 14));
	}

}
