package ch9_lang;

public class HashCodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));              // true
		System.out.println(str1.hashCode());                // 96354
		System.out.println(str2.hashCode());	            // 96354
		System.out.println(System.identityHashCode(str1));  // 366712642
		System.out.println(System.identityHashCode(str2));  // 1829164700
		
		/*
		 * StringŬ������ ���ڿ��� ������ ������, 
		 * ������ �ؽ��ڵ带  ��ȯ�ϵ��� hashCode�޼��尡 �������̵� �� �ִ�.
		 * 
		 * �ݸ� System.identityHashCode(Object x)�� ObjectŬ������ hashCode�޼���ó��
		 * ��ü�� �ּҰ����� �ؽ��ڵ带 ����.
		 */
	}
}
