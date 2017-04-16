package ch10_date_time_formatting;

import java.time.*;
import java.time.format.*;

public class DateFormatterEx1 {
	public static void main(String[] args) {
		ZonedDateTime zdateTime = ZonedDateTime.now();
		
		String[] patternArr = {
				"yyyy-MM-dd HH:mm:ss",
				"''yy�� MMM dd�� E����",
				"yyyy-MM-dd HH:mm:ss.SSS z VV",
				"yyyy-MM-dd hh:mm:ss a",
				"������ �� ���� D��° ���Դϴ�.",
				"������ �� ���� d��° ���Դϴ�.",
				"������ �� ���� w��° ���Դϴ�.",
				"������ �� ���� W��° ���Դϴ�.",
				"������ �� ���� W��° E�����Դϴ�."
			};
		
		for(String p : patternArr){
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(p);
			System.out.println(zdateTime.format(formatter));
		}
		/*
		 * 2017-04-16 18:00:13
			'17�� 4�� 16�� �Ͽ���
			2017-04-16 18:00:13.382 KST Asia/Seoul
			2017-04-16 06:00:13 ����
			������ �� ���� 106��° ���Դϴ�.
			������ �� ���� 16��° ���Դϴ�.
			������ �� ���� 16��° ���Դϴ�.
			������ �� ���� 4��° ���Դϴ�.
			������ �� ���� 4��° �Ͽ����Դϴ�.

		 */
	}
}
