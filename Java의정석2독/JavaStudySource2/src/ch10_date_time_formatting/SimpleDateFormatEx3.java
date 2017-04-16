package ch10_date_time_formatting;

import java.text.*;
import java.util.Date;

public class SimpleDateFormatEx3 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2015�� 11�� 23��");
			System.out.println(df2.format(d));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
