package ch7_Exercise;

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;

	void buy(Product p) {
		// �������� ������ ������ ���ؼ� ���� ���� ������ �޼��� ����
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� " + p + "��/�� ��  �� �����ϴ�.");
			return;
		} 
			money -= p.price;
			add(p);
		
		// ���� ���� ����ϸ�, ��ǰ�� ������ ���� ������ ����
		// ��ٱ��Ͽ� ������ ��´�. (add�޼��� ȣ��)

	}

	void add(Product p) {
		// 1.1 i�� ���� ��ٱ��� ũ�⺸�� ���ų� ũ��
		if (i >= cart.length) {
			// 1.1.1 ������ ��ٱ��Ϻ��� 2�� ū ���ο� �迭 ����
			Product[] tmp = new Product[cart.length * 2];
			// 1.1.2 ������ ��ٱ��ϴ��� ������ ���ο� �迭�� ����
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			// 1.1.3 ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�.
			cart = tmp;
		} 
		
		cart[i++] = p;
		
		// 1.2 ������ ��ٱ���(cart)�� ���� �׸��� i�� �� 1 ����
	}

	void summary() {
		StringBuffer sb = new StringBuffer();
		int sum = 0;

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break;
			sb.append(cart[i].toString() + ",");
			sum += cart[i].price;
		}
		System.out.println(sb);
		System.out.println(sum);
		System.out.println(money);
		// ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ���
		// ��ٱ��Ͽ� ��� ���ǵ��� ��� ����
		// money

	}
}

class Product {
	int price;

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

public class Ch7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();
	}
}
