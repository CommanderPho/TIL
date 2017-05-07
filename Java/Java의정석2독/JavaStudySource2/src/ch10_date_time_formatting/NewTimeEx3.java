package ch10_date_time_formatting;

import java.time.*;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;  // Enum
import static java.time.temporal.TemporalAdjusters.*;


public class NewTimeEx3 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfterTomorrow());
		
		System.out.println(today); // 2017-04-16
		System.out.println(date);	// 2017-04-18
		
		p(today.with(firstDayOfNextMonth()));	 // ���� ���� ù ��
		p(today.with(firstDayOfMonth())); 		 // �� ���� ù ��
		p(today.with(lastDayOfMonth())); 		 // �� ���� ������ ��
		p(today.with(firstInMonth(TUESDAY)));    // �� ���� ù��° ȭ����
		p(today.with(lastInMonth(TUESDAY)));     // �̴��� ������ ȭ����
		p(today.with(previous(TUESDAY)));		 // ���� �� ȭ����
		p(today.with(previousOrSame(TUESDAY)));	 // ���� �� ȭ����(���� ����)
		p(today.with(next(TUESDAY)));			 // ���� �� ȭ����
		p(today.with(nextOrSame(TUESDAY)));		 // ���� �� ȭ����(���� ����)
		p(today.with(dayOfWeekInMonth(4,TUESDAY))); // �� ���� 4��° ȭ����
	}
	
	static void p(Object obj){
		System.out.println(obj);
	}
}

class DayAfterTomorrow implements TemporalAdjuster{

	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(2,ChronoUnit.DAYS);
	}
}
