package ch10_date_time_formatting;

import java.text.*;
import java.util.*;

public class SimpleDateFormatEx4 {
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
		long day = Math.abs(cal.getTimeInMillis()-today.getTimeInMillis()) / (60*60*1000);
		System.out.println("�Է��Ͻ� ��¥�� ����� " + day + "�ð� ���̰� �ֽ��ϴ�.");
		System.out.println(day/24 + "��" + day%24 + "�ð�");
	}
}
