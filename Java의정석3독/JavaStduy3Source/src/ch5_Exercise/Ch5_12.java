package ch5_Exercise;

import java.util.Scanner;

public class Ch5_12 {
	public static void main(String[] args) {
		String[][] words = {
				{"chair","����"},
				{"computer","��ǻ��"},
				{"integer", "����"}
		};
		
		Scanner scanner = new Scanner(System.in);
		int answerCount = 0;
		
		for(int i=0; i<words.length; i++){
			System.out.printf("Q%d. %s�� ���� ",i+1, words[i][0]);
			
			String tmp = scanner.nextLine().trim();
			
			if(tmp.equals(words[i][1])){
				System.out.println("�����Դϴ�\n");
				answerCount++;
			} else{
				System.out.println("Ʋ�ƽ��ϴ�. ������ " + words[i][1]+"�Դϴ�.");
			}
		}
		System.out.printf("��ü %d���� �� %d���� ���߼̽��ϴ�.",words.length,answerCount);
	}
}
