package ch7_oop2;

import java.util.ArrayList;

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();

		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	ArrayList<Product> item = new ArrayList<>();

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ׺���");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}

	void refund(Product p) {
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		} else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}

	void summary() {
		int sum = 0;

		StringBuffer itemList = new StringBuffer();
		
		if(item.isEmpty()){
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}

		for (int i = 0, size = item.size(); i < size; i++) {
			Product p = (Product)item.get(i);
			sum+=p.price;
			itemList.append( i==0 ? ""+p : ","+p );
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}

}