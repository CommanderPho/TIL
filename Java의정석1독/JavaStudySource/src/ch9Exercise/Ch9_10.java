package ch9Exercise;

public class Ch9_10 {

	public static String format(String str, int length, int alignment)
	{
		//1 length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ
		int diff = length - str.length();
		if(diff<0) return str.substring(0, length);
		
		//1�� ��찡 �ƴϸ�, lengthũ���� char�迭�� �����ϰ� �������� ä���.
		char [] source = str.toCharArray();  // ���ڿ��� char�迭�� ��ȯ
		char[] result = new char[length];
		for(int i=0; i<result.length; i++)
			result[i]=' ';
		
		switch(alignment){
			case 0:
			default:
				System.arraycopy(source,0, result, 0, source.length);
				break;
			case 1:
				System.arraycopy(source,0, result, diff/2, source.length);
				break;
			case 2:
				System.arraycopy(source,0, result, diff, source.length);
				break;
		}
		return new String(result);
	}
	public static void main(String[] args) {
		String str = "������";
		
		System.out.println(format(str,7,0));
		System.out.println(format(str,7,1));
		System.out.println(format(str,7,2));
	}

}
