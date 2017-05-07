package ch4_if_switch_for_while;

import java.util.Scanner;

public class FlowEx7 {
	public static void main(String[] args) {
		int userInt, comInt;
		String user, com;
		
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		
		userInt = Integer.parseInt(tmp);
		comInt = (int)(Math.random()*3) + 1;
		
		user = RockPaperSissors(userInt);
		com = RockPaperSissors(comInt);
		
		System.out.println("����� "+ user + "�Դϴ�.");
		System.out.println("���� " + com+ "�Դϴ�.");
		
		switch(userInt-comInt){
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�.");
		case 0:
			System.out.println("�����ϴ�.");
//			break; // ������ �����̹Ƿ� break�� ����� �ʿ䰡 ����.
		}
	}
	static String RockPaperSissors(int input){
		String tmp;
		switch(input){
		case 1:
			tmp = "����";
			break;
		case 2:
			tmp = "����";
			break;
		default:
			tmp ="��";
		}
		return tmp;
	}
}
