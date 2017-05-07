package ch10_data_time_formatting;

import java.util.*;
import java.text.*;

public class DateFormatEx4 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���.(�Է¿�:2015/12/31)");
		while(s.hasNextLine()){
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch (ParseException e) {
				System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���.(�Է¿�:2015/12/31)");
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long diff = (today.getTimeInMillis() - cal.getTimeInMillis()) / (1000*60*60);
		System.out.println("�Է��Ͻ� ��¥�� ����� " + diff + "�ð� ���̰� �ֽ����.");
	}
}
