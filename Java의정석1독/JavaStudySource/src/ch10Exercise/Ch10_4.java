package ch10Exercise;

import java.text.*;
import java.util.*;

public class Ch10_4 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		String pattern2 = "�Է��Ͻ� ��¥�� E�����Դϴ�.";
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		do{
			System.out.println("��¥�� "+pattern+"�� ���·� �Է����ּ���.(�Է¿�:2007/05/11)");
			
			System.out.print(">>");
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch (ParseException e) {}
		}while(true);
		
		System.out.println(df2.format(inDate));
	}

}
