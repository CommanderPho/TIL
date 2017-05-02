package ch10_Exercise;

import java.time.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class Ch10_1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.of(2010, 1, 1);

		for (int i = 0; i < 11; i++) {
			today = today.plusMonths(1);
			System.out.println(today.with(dayOfWeekInMonth(2, SUNDAY)));
		}
		
		Calendar date = Calendar.getInstance();
		date.set(2010, Calendar.JANUARY, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.");
		

		for(int i=0; i<12; i++){
			// ��1 ��2 ȭ3 ��4 ��5 ��6 ��7
			// 1���� �������̸� 14   ������(2) - > 14    16���� 1�Ͽ� ������ ���� ��
			// 1���� ������̸� 11  ��(5)
			// �� 1���� ������̸� 9
			int dow = date.get(Calendar.DAY_OF_WEEK);
			int secondSunday = dow==7 ? 9 : 16-dow;
			date.set(Calendar.DATE, secondSunday);
			Date d = date.getTime();
			System.out.println(sdf.format(d));
			date.add(Calendar.MONTH, 1);
			date.set(Calendar.DATE, 1);
		}
		
	}
}
