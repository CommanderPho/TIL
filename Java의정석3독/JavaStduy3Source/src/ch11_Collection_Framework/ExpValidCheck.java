package ch11_Collection_Framework;

import java.util.*;

public class ExpValidCheck {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�Է� : ");
		String expresion = s.nextLine();
		Stack<Character> st = new Stack<>();
		
		int length = expresion.length();
		try {
			for(int i=0; i<length; i++){
				char ch = expresion.charAt(i);
				
				if(ch=='(')
					st.push(ch);
				else if(ch==')')
					st.pop();
			}
			if(st.isEmpty())
				System.out.println("��ȣ ��ġ");
			else
				System.out.println("��ȣ ����ġ");
		} catch (EmptyStackException e) {
			System.out.println("��ȣ ����ġ");
		}
	}
}
