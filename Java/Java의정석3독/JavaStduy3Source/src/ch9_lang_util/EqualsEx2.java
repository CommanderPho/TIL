package ch9_lang_util;

public class EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if (p1 == p2) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�."); // v
		}
		
		if(p1.equals(p2))
			System.out.println("p1�� p2�� ���� ����Դϴ�."); // v
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
	}
}
