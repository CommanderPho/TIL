package ch10_data_time_formatting;

import java.util.*;

public class CalendarEx4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2005, Calendar.AUGUST, 31);
		System.out.println(toString(date));
		System.out.println("= 1�� �� = ");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6�� �� =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		// �ٸ� �ʵ忡 ������ ��ġ�� ����
		System.out.println("= 31�� ��(roll) = ");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("= 31�� �� (add) = ");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		// ���Ϸ� ����
		date.set(Calendar.MONTH, Calendar.JANUARY);
		date.set(Calendar.DATE,date.getActualMaximum(Calendar.DATE));
		System.out.println("���Ϸμ����� : " + toString(date));
		// ���� ���� �� ���� ���������� ��, ���� �ٲٸ� ���� �ٲ� �� �ִ�. 
		// ����(31,30, 28,29)
		
		System.out.println("= 1�� ��  (roll) = ");
		date.roll(Calendar.MONTH, 3);
		System.out.println(toString(date));
	}

	private static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "��  " + (date.get(Calendar.MONTH)+1)+"�� "
				+ date.get(Calendar.DATE)+ "��";
	}
}
