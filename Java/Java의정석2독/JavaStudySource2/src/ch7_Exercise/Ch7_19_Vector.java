package ch7_Exercise;

import java.util.Vector;

public class Ch7_19_Vector {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
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

class Buyer2{
	int money = 1000;
	Vector<Product> cart = new Vector<>();
	int i = 0;
	
	void buy(Product p){
		if( money < p.price){
			System.out.println("�ݾ��̺����Ͽ� " + p + "��/�� �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		cart.addElement(p);
		
	}
	
	void summary(){
		StringBuilder item = new StringBuilder();
		int sum=0;
		for(int i=0; i<cart.size(); i++){
			item.append(cart.get(i)+",");
			sum += cart.get(i).price;
		}
		System.out.println("������ ���� : " + item);
		System.out.println("����� �ݾ� : " + sum );
		System.out.println("���� �ݾ� : " + money);
	}
}
