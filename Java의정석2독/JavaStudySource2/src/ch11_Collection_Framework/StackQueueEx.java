package ch11_Collection_Framework;

import java.util.*;

public class StackQueueEx {
	public static void main(String[] args) {
		// StackŬ���� �̿�
		Stack st = new Stack();
		
		// Queue�� �������̽��� ����ü�� LinkedList�� ���
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
//		q.remove(); ���� ó���� �Էµ� �� ����
		
//		ListIterator it = ((LinkedList)q).listIterator();
//		while(it.hasNext())
//			System.out.println("."+it.next());
		
		System.out.println("index"+st.lastIndexOf("0"));
		
		System.out.println(" = Stack = ");
		while(!st.empty()){
			System.out.println(st.pop());
		}
		
		
		System.out.println(" = Queue = ");
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}
	}
}
