package ch7;

class CardFinalTest{
	final int NUMBER;        //������� ����� �Բ� �ʱ�ȭ  ���� �ʰ�
	final String KIND;          //�����ڿ��� �� �ѹ��� �ʱ�ȭ�� �� �ִ�.
	static int width = 100;
	static int height = 250;
	
	CardFinalTest(String kind, int num)
	{
		KIND = kind;                //�Ű������� �Ѱܹ��� ������ ��� KIND�� NUMBER�� �ʱ�ȭ�Ѵ�.
		NUMBER = num;
	}
	CardFinalTest(){
		this("HEART",1);
	}
	public String toString(){
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {
	public static void main(String[] args) {
		CardFinalTest c = new CardFinalTest("HEART",15);
//		c.NUMBER=5; // ����!!!
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // System.out.println(c.toString());
	}

}
