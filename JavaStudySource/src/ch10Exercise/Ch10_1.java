package ch10Exercise;

import java.text.SimpleDateFormat;
import java.util.*;

public class Ch10_1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2010,Calendar.JANUARY,1);
		
		for(int i=0; i<12; i++){
			int weekday = cal.get(Calendar.DAY_OF_WEEK); // 1���� ���Ϥ��� ���Ѵ�.
			
			// �� ��° �Ͽ����� 1���� ���Ͽ� ���� �޶�����.
			// 1���� �Ͽ����� ��쿡�� �� ��° �Ͽ����� 8�̰�,
			// 1���� �ٸ� ������ ���� 16���� 1���� ������ ���� �� �� �ִ�.
			int secondSunday = (weekday==1) ? 8 : 16 - weekday;
			
			//�� ��° �Ͽ���(secondSnday)�� cal�� ��¥(DAY_OF_MONTH)�� �ٲ۴�.
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			
			 Date d  = cal.getTime();
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.");
			 System.out.println(sdf.format(d));
			 
			 cal.add(Calendar.MONTH,1);
			 cal.set(Calendar.DAY_OF_MONTH,1);
			
			
		}
	}

}
