package tryHelloWorld;

import java.util.Arrays;

public class ReverseStr {
	public String reverseStr(String str){
		// String�� ���ڿ��� ��ȯ
		char[] charStr = str.toCharArray();
		// ��������
		for(int i=0; i<charStr.length; i++){
			boolean changed = false;
			for(int j=0; j<charStr.length-1-i; j++){
				if(charStr[j] < charStr[j+1]){
					char tmp = charStr[j];
					charStr[j] = charStr[j+1];
					charStr[j+1] = tmp;
					changed = true;
				}
			}
			if(!changed) break;
		}
		return new String(charStr);
		
		/*
		 * char[] charStr = str.toCahrArray();
		 * Arrays.sort(sol);  ���� �ͺ��� ū ������ ����
		 * return new StringBuider(new String(sol)).reverse.toString();   
		 * // char[]�� String���� �ٽ� StringBuider�� 
		 * ���� �ͺ���  ū ������ ���ĵ� �ִ� ���� �ݴ��(reverse) �� String���� ����
		 */
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}