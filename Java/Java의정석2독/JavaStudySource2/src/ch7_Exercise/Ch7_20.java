package ch7_Exercise;

class Parent20{
	int x = 100;
	
	void method(){
		System.out.println("Parent Method");
	}
}

class Child20 extends Parent20{
	int x = 200;
	
	void method(){
		System.out.println("Child Method");
	}
}

public class Ch7_20 {
	public static void main(String[] args) {
		Parent20 p = new Child20();
		Child20 c = new Child20();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c. = " + c.x);
		c.method();
		/*
		 * ������ �ߺ��� ��� ����Ÿ�Կ� ����
		 * �޼ҵ尡 �ߺ��� ��� �����ν��Ͻ��� ����
		 * ���� p.x = 100  c.x = 200
		 * p.method, c.method  = CHildMethod
		 */
	}
}
