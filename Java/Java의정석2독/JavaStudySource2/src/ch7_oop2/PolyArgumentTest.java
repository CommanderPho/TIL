package ch7_oop2;

import java.util.Vector;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new TvP());
		b.buy(new ComputerP());

		System.out.println("���� ���� ����" + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ� ������ " + b.bonusPoint + "���Դϴ�.");
	}
}

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	Product() {
	}
}

class TvP extends Product {
	TvP() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class AudioP extends Product {
	AudioP() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class ComputerP extends Product {
	ComputerP() {
		super(200);
	}

	public String toString() {
		return "computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Vector<Product> item = new Vector<>();

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void refund(Product p){
		if(item.remove(p)){
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		} else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}

	void summary() {
		int sum = 0;
		String itemList = "";
		
		if (item.isEmpty()){
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		for (int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? ""+p : ", " + p;
		}
		System.out.println("�����Ͻ� ������ �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}