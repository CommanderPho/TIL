package ch6_Exercise;

public class Ch6_19 {
	public static void change(String str){
		str += "456";
	}
	public static void main(String[] args){
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);
		/*
		 * ABC123
		   After change: ABC123
		   ���ڿ��� ������ ������ �� ���� ������ 
		   		str += "456"; ���⼭ ���ο� ���ڿ��� �����ȴ�.
		   		change�޼��� �ȿ� str���������� ���ο� ���ڿ��� ����Ŵ
		 */
	}
}
