package ch11_Collection_Framework;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
	public static void main(String[] args) {
		// ���̸� ���� �����ϴ� ���� ����. �����ϸ� ���...
		ArrayList list1 = new ArrayList(10);
		
		// list1�� 5,4,2,0,1,3������ �߰�
		list1.add(5); // list.add(new Integer(5));
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		// list2�� list1�� 1~3������ ����
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);  //list1:[5, 4, 2, 0, 1, 3]
							 //list2:[4, 2, 0]
		
		// list1�� list2�� ����
		Collections.sort(list1);  // list1:[0, 1, 2, 3, 4, 5]
		Collections.sort(list2);  // list2:[0, 2, 4]
		print(list1, list2);
		
		// list1�� list2�� ��� ������ ������ ���� �� true
		//
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1,list2);  // list1:[0, 1, 2, 3, 4, 5]
							 // list2:[0, 2, 4, A, B, C]
		
		
		list2.set(3, "AA");
		System.out.println(list2);  // list2:[0, 2, 4, AA, B, C]
		
		//list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�.
		System.out.println("list1.retainAll(list2):"+list1.retainAll(list2));
		print(list1,list2);
		
		// list2���� list1�� ���Ե� ��ü���� ����
		for(int i=list2.size()-1; i>=0; i--){
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1,list2);  // list1:[0, 2, 4]
							 // list2:[AA, B, C]
		
	}
	static void print(ArrayList list1, ArrayList list2){
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
	}
}
