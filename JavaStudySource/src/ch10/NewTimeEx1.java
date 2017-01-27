package ch10;

import java.time.*;
import java.time.temporal.*;

public class NewTimeEx1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();  // ���ó�¥
		LocalTime now = LocalTime.now();   // ���� �ð�
		
		LocalDate birthDate = LocalDate.of(1999,12, 31); // 1999�� 12�� 31��
		LocalTime birthTime = LocalTime.of(23,59,59); // 23�� 59�� 59��
		
		System.out.println("today="+today);
		System.out.println("now="+now);
		System.out.println("bithDate="+birthDate);   // 1999-12-31
		System.out.println("birthTime="+birthTime);  // 23:59:59
		
		System.out.println(birthDate.withYear(2000)); //2000-12-31
		System.out.println(birthDate.plusDays(1));	      //2000-01-01
		System.out.println(birthDate.plus(1,ChronoUnit.DAYS)); // 2000-01-01
		
		//23:59:59 -> 23 : 00
		System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));
		
		//Ư�� ChronoField�� ������ �˾Ƴ��� ���
		System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());  //1-24
		System.out.println(ChronoField.HOUR_OF_DAY.range());      // 0-23
	}
	/*
	 * today=2017-01-27
		now=20:27:27.360
		bithDate=1999-12-31
		birthTime=23:59:59
		2000-12-31
		2000-01-01
		2000-01-01
		23:00
		1 - 24
		0 - 23
	 */
}
