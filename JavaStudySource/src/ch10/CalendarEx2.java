package ch10;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		// ������ 1���� �����ϱ� ������, DAY_OF_WEEK[0]�� ����д�.
		final String[] DAY_OF_WEEK = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//month�� ��� 0���� �����ϱ� ������ 8���� ���, ����
		//date1.set(2015,Calendar.AUGUST,15);�� ���� �� �� �� �ִ�
		date1.set(2015,7,15); // 2015�� 8�� 15�Ϸ� ��¥ ����
		System.out.println("date1�� "+toString(date1)
							+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"�����̰�,");
		
		System.out.println("����(date2)�� "+toString(date2)
					+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"�����Դϴ�.,");
		
		//�� ��¥���� ���̸� ��������, getTimeInMillis() õ���� ���� ������ ��ȯ�ؾ� �Ѵ�.
		
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		
		System.out.println("�� ��(date1)���� ���� (date2) ���� "+difference +"�ʰ� �������ϴ�.");
		
		System.out.println("��(day)�� ����ϸ� "
		+difference/(24*60*60)+"���Դϴ�."); // 1�� = 24 * 60 * 60
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH)+1) 
							+ "�� " +date.get(Calendar.DATE)+"�� ";
	}
	
	
	/*
		 * date1�� 2015�� 12�� 15�� ������̰�,
			����(date2)�� 2017�� 12�� 25�� �������Դϴ�.,
			�� ��(date1)���� ���� (date2) ���� 45705600�ʰ� �������ϴ�.
			��(day)�� ����ϸ� 529���Դϴ�.

	 */
	 /*
	  * �ð����� ���ĸ� �˰� ���� ���� �� ��¥���� ���̰� ������� ���������� �Ǵ��ϰų�
	  * boolean after(Object when)�� boolean befero(Object wen)�� ���
	  */
}
