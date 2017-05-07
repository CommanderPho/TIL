package ch11_Collection_Framework;

import java.util.*;

public class StackEx1 {
	
	static Stack<String> back = new Stack<>();
	static Stack<String> forward = new Stack<>();
	
	public static void main(String[] args) {
		goURL("1.����Ʈ");
		goURL("2.����");
		goURL("3.���̹�");
		goURL("4.����");
		
		printStatus();
		
		goBack();
		System.out.println("�ڷΰ��� ��ư�� ���� �� ");
		printStatus();
		
		goBack();
		System.out.println("�ڷΰ��� ��ư�� ���� ��");
		printStatus();
		
		goForward();
		System.out.println("�����ΰ��� ��ư�� ���� ��");
		printStatus();
		
		goURL("codechobo.com");
		System.out.println("���ο� �ּҷ� �̵� ��");
		printStatus();
	}
	
	static void printStatus(){
		System.out.println("back : "+back);
		System.out.println("forward : "+forward);
		System.out.println("����ȭ���� : " + back.peek());
	}
	
	static void goURL(String url){
		back.push(url);
		if(!forward.isEmpty())
			forward.clear();
	}
	
	static void goBack(){
		if(!back.empty())
			forward.push(back.pop());
	}
	
	static void goForward(){
		if(!forward.empty())
			back.push(forward.pop());
	}

}
