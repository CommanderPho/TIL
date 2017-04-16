package ch10;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx7 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] argArr =null;
		int year, month;
		
		while(true){
			System.out.print("�⵵�� ���� �Է����ּ��� : (����:q)");
			
			String input = scanner.nextLine();
			input = input.trim();
			argArr = input.split(" +");
			
			String content = argArr[0].trim();
			
			if(content.equalsIgnoreCase("q"))
				System.exit(0);
			else{
				year = Integer.parseInt(argArr[0]);
				month = Integer.parseInt(argArr[1]);
				
				int START_DAY_OF_WEEK = 0;
				int END_DAY = 0;
				
				Calendar sDay = Calendar.getInstance(); //������
				Calendar eDay = Calendar.getInstance(); //����
				
				//���� ��� 0���� 11������ ���� �����Ƿ� 1�� ���־�� �Ѵ�.
				// ���� ���, 2004�� 11�� 1���� sDay.set(2004,10,1);�� ���� �ؾ� �Ѵ�.
				sDay.set(year, month-1,1); //�Է¿��� 1���� ����
				
				//getActualMaximum(Calendar.DATE) �ش���� ��������
				eDay.set(year, month-1,sDay.getActualMaximum(Calendar.DATE)); // �Է¿��� ���Ϸ� ����
				
				//1���� ���� ���� �Ͽ��Ϸ� ��¥����.
				sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK)+1);

				//������ ���� ���� ����Ϸ� ��¥����
				eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));
				
				System.out.println("     " + year + "�� " + month + "��");
				System.out.println(" SU MO TU WE TH FR SA");

				//���� �Ϻ��� ������ �ϱ���(sDay<=eDay) 1������ ������Ű�鼭 ��(Calendar.Date)�� ���
				for(int n=1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE,1)){
					int day = sDay.get(Calendar.DATE);
					System.out.print((day<10)?"  "+day: " "+day);
					if(n++%7==0)System.out.println();
				}
			}
				
		}
	}
}
