package ch10_Exercise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ch10_1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2010, Calendar.JANUARY, 1);
		
		for(int i=0; i<12; i++){
			int weekDay = cal.get(Calendar.DAY_OF_WEEK); // 1���� ������ ���Ѵ�.
			
			// �� ��° �Ͽ����� 1���� ���Ͽ� ���� �޶�����.
			// 1���� �Ͽ����� ��쿡�� �� ��° ������ 8�� �̰�,
			// 1���� �ٸ� ������ ���� 16���� 1���� ������ ���� �� �� �ִ�.
			int secondSunday = (weekDay==1) ? 8 : 16 - weekDay;
			
			// �� ��° �Ͽ��Ϸ� cal�� ��¥�� �ٲ۴�.
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.").format(d));
			
			// ��¥�� ������ 1�Ϸ� ����
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH,1);
		}
		
		
	}
}
