package ch9;

public class HashCodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
//		StringŬ������ equals�� ������ ���ϱ� ������ true
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
//		StringŬ������ hashCode�� ���ڿ��� ������ ������, 
//		������ �ؽ��ڵ帣 ��ȯ�ϵ��� �������̵� �ƴ�.
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
//		System.indetifyHashCode�� ObjectŬ������ hashCode�޼���ó�� ��ü�� �ּҰ�����
//		�ؽ��ڵ带 �����ϱ� ������ ��� ��ü�� ���� �׻� �ٸ� �ؽ��ڵ尪�� ��ȯ
		
	}
}
