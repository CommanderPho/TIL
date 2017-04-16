package ch10_date_time_formatting;

import java.text.*;
import java.util.*;

public class SimpleDateFormatEx2 {
	public static void main(String[] args) {
		/*
		 * Date �ν��Ͻ��� format�޼��忡 ���� �� �ֱ� ������
		 * Calendar�ν��Ͻ��� ����� ��� Date�ν��Ͻ��� ��ȯ�ؾ� �Ѵ�.
		 */
		Calendar cal = Calendar.getInstance();
		cal.set(2005, Calendar.OCTOBER, 3);
		
		Date day = cal.getTime();
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy-MM-dd E����");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		
		System.out.println(sdf1.format(day));
		System.out.println(sdf2.format(day));
		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));
	}
}
