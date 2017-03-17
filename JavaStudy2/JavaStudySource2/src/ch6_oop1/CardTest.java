package ch6_oop1;

class Card{
	String kind;               // ī���� ���� - �ν��Ͻ�����
	int number;                // ī���� ���� - �ν��Ͻ� ����
	static int width = 100;    // ī���� �� - Ŭ���� ����
	static int height = 250;   // ī���� ���� - Ŭ���� ����
}

public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
//		                                                                           Ŭ���� ������ ����� ���� Ŭ�����̸�.Ŭ���������� �ϱ�
		System.out.printf("c2�� %s, %d�̸�, ũ��� (%d, %d)%n",c2.kind, c2.number, Card.width, Card.height);
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.printf("c2�� %s, %d�̸�, ũ��� (%d, %d)",c2.kind, c2.number, c2.width, c2.height);
	}
}
