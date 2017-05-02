package ch10_data_time_formatting;

import java.time.*;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

public class NewTimeEx3 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfgerTomorrow());
		
		p(today);
		p(date);
		
		p("���� ���� ù ��"+today.with(firstDayOfNextMonth()));	 // ���� ���� ù ��
		p("�� ���� ù�� "+today.with(firstDayOfMonth())); 		 // �� ���� ù ��
		p("�� ���� ������ ��"+today.with(lastDayOfMonth())); 		 // �� ���� ������ ��
		p("�� ���� ù��° ȭ����"+today.with(firstInMonth(TUESDAY)));    // �� ���� ù��° ȭ����
		p("�̴��Ǹ�����ȭ����"+today.with(lastInMonth(TUESDAY)));     // �̴��� ������ ȭ����
		
		System.out.println();
		
		p("���� �� ȭ����"+today.with(previous(TUESDAY)));		 // ���� �� ȭ����
		p("���� �� ȭ����(��������)"+today.with(previousOrSame(TUESDAY)));	 // ���� �� ȭ����(���� ����)
		
		p(today.with(next(TUESDAY)));			 // ���� �� ȭ����
		p(today.with(nextOrSame(TUESDAY)));		 // ���� �� ȭ����(���� ����)
		p(today.with(dayOfWeekInMonth(4,TUESDAY))); // �� ���� 4��° ȭ����
	}
	
	static void p(Object obj){
		System.out.println(obj);
	}
}

class DayAfgerTomorrow implements TemporalAdjuster{

	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(2,ChronoUnit.DAYS);
	}
	
}
