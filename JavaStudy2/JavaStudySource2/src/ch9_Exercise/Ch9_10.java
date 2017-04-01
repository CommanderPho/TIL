package ch9_Exercise;

import java.util.Arrays;

public class Ch9_10 {
	public static String format(String str, int length, int aligment){
		// length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ
		
		int diff = length - str.length();
		
		if( diff < 0){
			return str.substring(0, length);
		} else {
			int strLen = str.length();
			char[] srtCharArray = str.toCharArray();
			
			// 1�� ��찡 �ƴϸ�, lengthũ���� char�迭�� �����ϰ� ��������ä���.
			char[] c = new char[length];
			
			// ���� ���ǿ� ���� ���ڿ�(str)�� ������ ��ġ�� �����Ѵ�. (System.arrycopy()���)
			if(aligment == 0) // ��������
				System.arraycopy(srtCharArray, 0, c, 0, strLen);
			else if(aligment == 1)  // ��� ����
				System.arraycopy(srtCharArray, 0, c, diff/2, strLen);
			else if(aligment ==2)  // ������ ����
				System.arraycopy(srtCharArray, 0, c, diff, strLen);

			return String.valueOf(c);
		}
	}
	
	public static void main(String[] args) {
		String str = "������";
		
		System.out.println(format(str,7,0)); // ���� ����
		System.out.println(format(str,7,1)); // ��� ����
		System.out.println(format(str,7,2)); // ������ ����
	}
}
