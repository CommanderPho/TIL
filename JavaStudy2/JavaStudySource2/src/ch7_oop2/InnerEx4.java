package ch7_oop2;

class Outer4{
	class InstanceInner{
		int iv = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod(){
		class LcalInner{
			int iv = 400;
		}
	}
}

public class InnerEx4 {
	public static void main(String[] args) {
		// �ν��Ͻ�Ŭ������ �ν��Ͻ��� �����Ϸ���
		// �ܺ� Ŭ������ �ν��Ͻ��� ���� �����ؾ� �Ѵ�.
		Outer4 oc = new Outer4();
		Outer4.InstanceInner il = oc.new InstanceInner();
		
		System.out.println(il.iv);
		System.out.println(Outer4.StaticInner.cv);
		
		// static ���� Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �Ⱦʵ� �ȴ�.
		Outer4.StaticInner si = new Outer4.StaticInner();
		System.out.println(si.iv);
	}
}
