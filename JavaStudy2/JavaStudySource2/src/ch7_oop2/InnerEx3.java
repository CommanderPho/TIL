package ch7_oop2;

public class InnerEx3 {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ������ ������ �� ����.
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod(){
		int lv = 0;
		final int LV = 0; // JDK1.8���� fianl ���� ����
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
//			�ܺ� Ŭ������ ���������� fianl�� ���� ����(���)�� ���ٰ���
			
			int liv3 = lv;      // JDK1.8 �������� ����
			int liv4 = LV;		// OK.
		}
	}
	public static void main(String[] args) {

	}
}
