package ch11_Collection_Framework;

import java.util.*;

public class ArrayListLinkedListTest2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(1_000_000);
		LinkedList ll = new LinkedList();
		add(al);
		add(ll);
		
		System.out.println("���ٽð��׽�Ʈ");
		System.out.println("ArrayList : " + access(al));
		System.out.println("LinkedList : " + access(ll));
	}
	
	public static void add(List list){
		for(int i=0; i<100000; i++) list.add(i+"");
	}
	
	public static long access(List list){
		long start = System.currentTimeMillis();
		for(int i=0; i<10000;i++) list.get(i);
		long end = System.currentTimeMillis();
		return end-start;
	}
	/*
	 * ArrayList al = new ArrayList(1000000);
	 * for(int i=0; i<100000;i++) al.add(i+"");
	 * 
	 * ArrayList, LinkedList�� �÷��� �����ӿ��� ���� ��κ��� �÷��� Ŭ��������
	 * ���� ��ȯ�� �����ؼ� �� Ŭ������ ������ �°� ��ȯ�ؼ� ��� ����
	 * 
	 * LinkedList ll = new LinkedList(al);
	 * for(int i=0; i<1000;i++) ll.add(500,"X");
	 * 
	 */

}
