package ch10_date_time_formatting;

import java.util.Calendar;

public class CalendarEx5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2015, Calendar.JANUARY,31);
		System.out.println(CalendarEx2.toString(date));
		date.roll(Calendar.MONTH, 1);
		System.out.println(CalendarEx2.toString(date));
		
		date.set(2015, Calendar.JANUARY,31);
		date.add(Calendar.MONTH, 1);
		System.out.println(CalendarEx2.toString(date));
	}
}
/*
 * 2015�� 1�� 31�Ͽ� ���� roll()�� ȣ���ؼ� �� �ʵ带 1 ���������� ��,
 * �� �ʵ�� 2���� �Ǵµ� 2������ 31���� ���� ������ 2���� ������ 28�Ϸ� �ڵ� ����
 * abb()�� ��������
 */
//2015�� 1�� 31�� 
//2015�� 2�� 28��