package ch4_Exercise;

import java.util.Scanner;

public class Ch4_14 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		
		do{
			count++;
			System.out.print("1���� 100������ ���� �Է�");
			input = s.nextInt();
			
			if(input == answer){
				System.out.println("����");
				break;
			} else if(input < answer){
				System.out.println(" ū �� �Է�");
			} else {
				System.out.println(" ���� �� �Է�");
			}
				
			
		}while(true);
	}
}
