package ch9_Exercise;

import java.util.Arrays;

public class Ch9_6 {
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}
	public static String fillZero(String src, int length){
		//1. src�� ���̰ų� src.length()�� length�� ������ src�� �״�� ��ȯ�Ѵ�.
		if(src==null || src.length() == length) {
			return src;
		//2. length�� ���� 0���� ���ų� ������ �� ���ڿ�("")�� ��ȯ�Ѵ�
	    } else if(length <= 0 ){
	    	return "";
		//3. src�� ���̰� length�� ������ ũ�� src�� length��ŭ �߶� ��ȯ
	    } else if(src.length() > length) {
			return src.substring(0, length);
	    }
		
//		//4. ���̰� length�� char�迭�� �����Ѵ�.
//		char[] c = new char[length];
//		
//		//5. 4���� ������ char�迭�� '0'���� ä���.
//		Arrays.fill(c, '0');
//		
//		//6. src���� ���ڹ迭�� �̾Ƴ��� 4���� ������ �迭�� �����Ѵ�.
//		int len = src.toCharArray().length;
//		System.arraycopy(src.toCharArray(), 0, c, length - len, len);
//			
//		return String.valueOf(c);
		// ���˻�� 5�� -> 2��
		int srcInt = Integer.parseInt(src);
		return String.format("%0"+length+"d",srcInt);
	}
}
