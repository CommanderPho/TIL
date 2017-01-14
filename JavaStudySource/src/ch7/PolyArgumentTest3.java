package ch7;

import java.util.Arrays;
import java.util.Vector;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
class ProductTv extends Product{
	ProductTv(){
		super(100);
	}
	public String toString(){
		return "ProductTv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString(){
		return "Computer";
	}
}
class Audio extends Product{
	Audio(){
		super(50);
	}
	public String toString(){
		return "Audio";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	void summary(){
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()){
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i=0; i<item.size();i++){
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? ""+p : ","+p;
			}
		
			System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
			System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
		
	}
	void refund(Product p){
		if(item.remove(p)){
			money += p.price;
			bonusPoint -=p.bonusPoint;
			System.out.println(p+"��/�� ��ǰ�ϼ̽��ϴ�.");
		}
		else{
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
}

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Computer com = new Computer();
		
		b.buy(new ProductTv());
		b.buy(com);
		b.buy(new Audio());
		b.summary();
		
		b.refund(com);
		b.summary();
		
		System.out.println("���� ���� ����"+b.money+"�����Դϴ�.");
		System.out.println("���� ���ʽ������� "+b.bonusPoint+"�Դϴ�.");
		
	}
	
}
