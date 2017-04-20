package ch_12_Generics_Enum_Annotation;

import java.util.*;

class Fruit { public String toString() { return "Fruit";}}
class Apple extends Fruit { public String toString() { return "Apple";}} 
class Grape extends Fruit { public String toString() { return "Grape";}} 
class Toy extends Fruit { public String toString() { return "Toy";}} 

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);}
	T get(int i) { return list.get(i); }
	int size () { return list.size(); }
	public String toString() { return list.toString(); }
	
}

public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<>();
		Box<Apple> appleBox = new Box<>();
		Box<Toy> toyBox = new Box<>();
//		Box<Grape> grapeBox = new Box<Apple>(); // ����. Ÿ�� ����ġ
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // Ok. void add(Fruit item)
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); ����. Box<Apple>���� Apple�� ���� �� ����
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple()); ����. Box<Toy>���� Apple�� ���� �� ����
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}
}
