package ch11Exercise;

import java.util.*;

public class Ch11_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list);  // 2 6 3 7 ���� x �ߺ���� ����
		System.out.println(set);
		TreeSet tset = new TreeSet(set); //  2 3 6 7   ����
		System.out.println(tset);
		Stack stack = new Stack();
		stack.addAll(tset); // ����
		System.out.println(stack);
		
		while(!stack.empty()){
			System.out.println(stack.pop());  //  7 6 3 2 ������ ���
		}
		
	}
/*
 * [2, 3, 6, 7]
	[2, 3, 6, 7]
	[2, 3, 6, 7]
	7
	6
	3
	2
 */
}
