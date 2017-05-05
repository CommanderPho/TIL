package ch12_Generics_Enum_Annotation;

import java.util.*;

public class FruitBoxEx2
{
	public static void main(String [] args)
	{
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		// FruitBox2<Grape2> grapebox = new FruitBox2<Toy2>(); // ����. Ÿ�� ����ġ
		// FruitBox2<Toy2> toyBox = new FruitBox2<Toy2>(); // toy�� �� �� <T
		// extends Fruit & Eatable>���� ����
		// toyŬ������ Fruit�� ��ӹ��� �ʾҰ� Eatable�� �������� �ʾ���

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		// appleBox.add(new Grape()); // ����. Grape2�� Apple�� �ڼ��� �ƴ�
		grapeBox.add(new Grape());

		System.out.println("fruitBox-" + fruitBox);
		System.out.println("appleBox-" + appleBox);
		System.out.println("grapebox-" + grapeBox);
	}
}
