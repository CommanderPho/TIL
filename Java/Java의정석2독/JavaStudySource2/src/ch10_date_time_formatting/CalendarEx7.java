package ch10_date_time_formatting;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int month = 0;
		int year = 0;
		
		while(true){
			System.out.println("�Է����ּ���. ���: �� ��, ��) 2017 4 (����:q)");
			String inputLine = scanner.nextLine();
			String[] inputArr = inputLine.trim().split(" +");
			
			if(inputArr[0].equalsIgnoreCase("q"))
				System.exit(0);
			else if ( inputArr.length != 2){
				System.out.print("����� Ʋ�Ƚ��ϴ�.  ");
				continue;
			}
			
			year = Integer.parseInt(inputArr[0]);
			month = Integer.parseInt(inputArr[1]);
			
			Calendar sDay = Calendar.getInstance();
			Calendar eDay = Calendar.getInstance();
			
			sDay.set(year, month-1, 1);
			eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
			
			sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK)+1);
			eDay.add(Calendar.DATE, 7-eDay.get(Calendar.DAY_OF_WEEK));
			
			System.out.println("     " + year + "�� " + month + "��");
			System.out.println(" SU MO TU WE TH FR SA");
			
			for(int n=1; sDay.before(eDay)|| sDay.equals(eDay); sDay.add(Calendar.DATE, 1)){
				int day = sDay.get(Calendar.DATE);
				System.out.print( day<10 ? "  "+day : " "+day );
				if(n++%7==0) System.out.println();
			}
		}
	}
}
