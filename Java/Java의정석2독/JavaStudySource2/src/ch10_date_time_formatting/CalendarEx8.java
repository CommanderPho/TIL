package ch10_date_time_formatting;

public class CalendarEx8 {
	public static void main(String[] args) {
		String date1 = "201508";
		String date2 = "201405";
		
		// ��� �� ������ ����̶��, 
		// ���� Calendar�� ������� �ʰ� ��ó�� ������ ó���ص� ����.
		// ��� ���� substring���� �߶� ������ ��ȯ�Ѵ�.
		// �⿡ 12�� ���ؼ� ���� ��ȯ�� ������ ������ �ϸ� �������� ���� �� �ִ�.
		int month = Integer.parseInt(date1.substring(0, 4))*12
				+ Integer.parseInt(date1.substring(4));
		int month2 = Integer.parseInt(date2.substring(0, 4))*12
				+ Integer.parseInt(date2.substring(4));
		
		System.out.printf("%s�� %s�� ���̴�  %d���� �Դϴ�.",date1,date2,Math.abs(month-month2));
	}
}
