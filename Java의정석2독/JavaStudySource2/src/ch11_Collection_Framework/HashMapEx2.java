package ch11_Collection_Framework;

import java.util.*;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("������", new Integer(90));
		map.put("������", new Integer(100));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(80));
		map.put("������", new Integer(90));
		
		System.out.println(map);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : " + e.getKey() + ", ����" + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("�����ڸ�� : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()){
			total += (Integer)it.next();
		}
		System.out.println("����  : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
	}
}
