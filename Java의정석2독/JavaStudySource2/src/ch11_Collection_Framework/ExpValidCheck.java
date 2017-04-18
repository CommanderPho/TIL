package ch11_Collection_Framework;

import java.util.Scanner;
import java.util.Stack;

// ��ȣ�� �ùٸ��� üũ!!!
public class ExpValidCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack st = new Stack();
		String expression = scanner.nextLine();
		
		System.out.println("expression : " + expression);
		
		try {
			for(int i=0; i<expression.length(); i++){
				char ch = expression.charAt(i);
				if(ch=='(') st.push(ch+"");
				else if(ch==')') st.pop();
			}
			
			if(st.isEmpty())
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			else
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		} catch (Exception e) {
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
	}
}
