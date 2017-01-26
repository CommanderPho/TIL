package ch10;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx6 {
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
				sDay.set(year, month-1,1);
				eDay.set(year, month,1);
				
				//�������� ù������ �Ϸ縦 ���� ������� ��������
				// 12�� 1�Ͽ��� �Ϸ縦 ���� 11�� 30��
				eDay.add(Calendar.DATE, -1);
				
				//ù ��° ������ ���� �������� �˾Ƴ���.
				START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
				// eday�� ������ ��¥�� ���´�.
				END_DAY = eDay.get(Calendar.DATE);
				
				System.out.println("     " + year + "�� " + month + "��");
				System.out.println(" SU MO TU WE TH FR SA");
				
				//�ش� ���� 1���� ��� ���������� ���� ������ ���
				//���� 1���� �������̶�� ������ ���� ��´�. (�Ͽ��Ϻ��� ����)
				for(int i=1; i< START_DAY_OF_WEEK; i++){
					System.out.print("   ");
				}
				for(int i=1, n=START_DAY_OF_WEEK; i<=END_DAY; i++, n++){
					System.out.print((i<10) ? "  "+i : " "+i);
					if(n%7==0)System.out.println();
				}
				System.out.println();

			}
				
		}
	}
}
