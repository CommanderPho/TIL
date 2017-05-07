package ch12Exercise;

class Box3<T extends Fruit>{
	T item;
	void setItem(T item){this.item = item;}
	T getItem() {return item;}
}

class Fruit{}
class Apple extends Fruit{}
public class Ch12_3 {

	public static void main(String[] args) {
//		Box3<?>      b = new Box3();    
		// ok. Box<?>�� Box<? extends Object>, ��ü ������ ���׸� Ÿ���� ������ ���� �ʾ����� ������ ����.
		// new Box3() ��� new Box3<>()�� ����ϴ� ���� ����.
		
//		Box3<?>      b2 = new Box3<>(); 
		// Ok. Box<?> b = new Box<Fruit>();�� ����
		
//		Box3<?>      b3 = new Box3<Object>();  
		// ����. Object�� Furit�� �ڽ��� �ƴϱ� ����
		
		
//		Box3<Object> b4 = new Box3<Fruit>();
		// ����. Ÿ�Ժ���ġ
		
//		Box3         b5 = new Box3<Fruit>();
		// ok. �׷��� Box3<?> b���� ��� �ٶ�����
		
//		Box3<? extends Fruit>  b6 = new Box3<Apple>(); 
		// ok
		
//		Box3<? extends Object> b7 = new Box3<? extends Fruit>();
		// new�����ڿ��� ���ϵ� ī�� ��� �ȵ�
	}

}
