package ch6_oop1_Exercise;
/*
 * SutdaCardŬ������ �� ���� �����ڿ� info()�� �߰��ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.
 * 
 * 3
 * 1K
 */
public class ch6_2 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}	
}
