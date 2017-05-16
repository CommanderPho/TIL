package etc;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarCalss {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = 0;
		int month = 0;
		
		while(true){
			System.out.print("(�� ��)�� �Է����ּ���. ����(q)");
			String input = scanner.nextLine().trim();
			String[] content = input.split(" +");
			
			if(content[0].trim().equalsIgnoreCase("q"))
				System.exit(0);
			else if(content.length!=2){	
				System.out.println("�߸����Է��Դϴ�. �Է����� : �⵵ ��, ��) 2017 4");
				continue;
			}
			year = Integer.parseInt(content[0]);
			month = Integer.parseInt(content[1]);
			Calendar sday = Calendar.getInstance();
			Calendar eday = Calendar.getInstance();
			sday.set(year, month-1, 1);
			eday.set(year,month-1,sday.getActualMaximum(Calendar.DATE));
			
			sday.add(Calendar.DATE, -sday.get(Calendar.DAY_OF_WEEK)+1);
			eday.add(Calendar.DATE, 7-eday.get(Calendar.DAY_OF_WEEK));
			

			
			System.out.printf("     %d��         %d��%n",year,month);
			System.out.println("   ��    ��    ȭ   ��   ��   ��   ��   ");
			

			for(int n=1;sday.before(eday) || sday.equals(eday);n++,sday.add(Calendar.DATE, 1)){
				int day = sday.get(Calendar.DATE);
				System.out.print((day<10) ? "  "+day : " "+day);
				if(n%7==0) System.out.println();
			}
			System.out.println();
		}
	}
}
