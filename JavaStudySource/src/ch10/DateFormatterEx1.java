package ch10;

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
	}
	/*
	 * 2017-01-27 22:36:46
		'17�� 1�� 27�� �ݿ���
		2017-01-27 22:36:46.915 KST Asia/Seoul
		2017-01-27 10:36:46 ����
		������ �� ���� 27��° ���Դϴ�.
		������ �� ���� 27��° ���Դϴ�.
		������ �� ���� 4��° ���Դϴ�.
		������ �� ���� 4��° ���Դϴ�.
		������ �� ���� 4��° �ݿ����Դϴ�.

	 */
}
