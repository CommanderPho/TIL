package ch11_Collection_Framework;

import java.util.*;

public class ListIteratorEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()){
			//���������� �����ϸ鼭 �о�´�.
			System.out.println(it.next());
		}
		System.out.println();
		
		while(it.hasPrevious()){
			// ���������� �����ϸ鼭 �о�´�.
			System.out.println(it.previous());
		}
		System.out.println();
	}
}
