package ch3_operator_Excercise;

/*
 * �Ҵ빮�ں���
 */

public class ch3_10 {
	public static void main(String[] args) {
		char ch = 'A';
		//             �빮�ڸ� �ҹ��ڷ�
		char lowerCase =  ('A'<=ch && ch<'Z') ? (char)(ch+32) : ch;
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}
