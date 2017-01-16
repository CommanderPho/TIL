package ch7;

public class InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	
	//�ν��Ͻ���� ������ ���� ���� ������ ����
	InstanceInner iv = new InstanceInner();
	//static ��� ������ ���� ���� ������ �����ϴ�.
	static StaticInner cv = new StaticInner();
	
	static void staticMethod(){
		//static����� �ν��Ͻ������ ���� ������ �� ����.
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		// ���� �����Ϸ��� �Ʒ��� ���� ��ü�� �����ؾ��Ѵ�.
		// �ν��Ͻ�Ŭ������ �ܺ� Ŭ������ ���� �����ؾ߸� �Ѵ�.
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void myMethod(){
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
	
	void instanceMethod(){
		//�ν��Ͻ��޼��忡���� �ν��Ͻ������ static��� ��� ���� ����
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//�޼��� ���� ���������� ����� ���� Ŭ������ �ܺο��� ������ ��  ����
//		LocalInner lv = new LocalInner();
	}
}
