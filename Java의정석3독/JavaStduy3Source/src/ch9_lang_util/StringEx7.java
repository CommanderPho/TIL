package ch9_lang_util;

public class StringEx7 {
	public static void main(String[] args) {
		String fullName = "Hello.java";
		
		// fullName���� '.'��ġ�� ã�´�.
		int index = fullName.indexOf('.');
		
		// fullname�� ù��° ���ں��� '.'�� �ִ� ������ ���ڿ��� ����
		String fileName = fullName.substring(0, index);
		
		// '.'�� ���� ���ں��� �����ؼ� ���ڿ��� ������ ����
		// String ext = fullName.substring(index+1,fullname.length());�� ����� ����.
		String ext = fullName.substring(index+1);
		
		System.out.println(fullName + "�� Ȯ���ڸ� ������ �̸� " + fileName);
		System.out.println(fullName + "�� Ȯ���ڴ� " + ext);
	}
}
