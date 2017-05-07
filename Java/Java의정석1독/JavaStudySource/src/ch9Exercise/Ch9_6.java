package ch9Exercise;

public class Ch9_6 {
	public static String fillZero(String src, int length){
		
		//src�� ���̰ų� src.length()�� length�� ������ src�� �״�� ��ȯ�Ѵ�.
		if(src == null && src.length() ==0)
			return src;
		
		//length�� ���� 0���� ���ų� ������ �� ���ڿ�("")�� ��ȯ�Ѵ�.
		else if( length <= 0 )
			return "";
		
		//src�� ���̰� length�� ������ ũ�� src�� length��ŭ �߶� ��ȯ
		else if( src.length() > length )
			return src.substring(0, length);
		
		//���̰� length�� char�迭�� ����
		char[] tmp = new char[length];
		
		//�� �迭�� '0'���� ä���.
		for(int i=0; i<tmp.length; i++)
			tmp[i] = '0';
		
		//src���� ���ڹ迭�� �̾Ƽ� ���� ������ �迭�� ����
		System.arraycopy(src.toCharArray(), 0, tmp, length-src.length(), src.length());
		
		//���� ������ �迭�� String�� �����ؼ� ��ȯ
		return new String(tmp);
	}
	
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}
}
