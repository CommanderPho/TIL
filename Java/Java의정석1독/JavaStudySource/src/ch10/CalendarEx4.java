package ch10;

import java.util.*;

public class CalendarEx4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2005,7,31);  // 2005�� 8�� 13��
		
		System.out.println(toString(date));
		System.out.println("= 1�� �� =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6�� �� =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("= 31�� ��(roll)=");  
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		// roll �ʵ尡 �ٸ� �ʵ忡 ������ ��ġ�� �ʴ´�.
		// �� '��'�ʵ尡 ���� �� ��, ���ʵ尡 ����Ǹ� ������ ��ĥ �� �ִ�.
		//CalendarEx5 ����
		
		
		System.out.println("= 31�� ��(date)=");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH)+1) 
							+ "�� " +date.get(Calendar.DATE)+"�� ";
	}
}
/*
	2005�� 8�� 31�� 
	= 1�� �� =
	2005�� 9�� 1�� 
	= 6�� �� =
	2005�� 3�� 1�� 
	= 31�� ��(roll)=
	2005�� 3�� 1�� 
	= 31�� ��(date)=
	2005�� 4�� 1�� 
*/
