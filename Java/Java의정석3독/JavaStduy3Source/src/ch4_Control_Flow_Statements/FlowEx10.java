package ch4_Control_Flow_Statements;

import java.util.Scanner;

public class FlowEx10 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		System.out.println("����� ������ �Է��ϼ���.(1~100)>");
		
		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine().trim();
//		score = Integer.parseInt(tmp);
		
		try {
			score = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("�����Է�");
			System.exit(0);
		}
		
		switch(score/10){
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default :
			grade = 'F';
		}
		System.out.println("����� ������ " + grade + "�Դϴ�.");
	}
}
