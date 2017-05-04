package ch11_Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class BanNoAsceding implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		
		return o1.ban==o2.ban ? o1.no-o2.no : o1.ban - o2.ban;
	}

}

public class Ch11_7
{

	public static void main(String [] args)
	{
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("������",2,1,70,90,70));
		list.add(new Student("������",2,2,60,100,80));
		list.add(new Student("ȫ�浿",1,3,100,100,100));
		list.add(new Student("���ü�",1,1,90,70,80));
		list.add(new Student("���ڹ�",1,2,80,80,90));
		
		Collections.sort(list, new BanNoAsceding());
		
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
