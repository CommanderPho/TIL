package ch11_Exercise;

import java.util.*;

class ClassTotalComparator implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2)
	{
		return o1.ban == o2.ban ? o1.classRank - o2.classRank : o1.ban - o2.ban;
	}
}

public class Ch11_8
{
	public static void calculateClassRank(List<Student> list)
	{	
		// ���� �ݺ� �������� ������������ �����Ѵ�.
		Collections.sort(list, new ClassTotalComparator());
		
		int prevBan = -1;
		int prevRank = -1; // �����������
		int prevTotal = -1; // ���� ����
		int length = list.size();
		
		for(int i=0,n=0; i<length; i++,n++)
		{
			Student tmp = list.get(i);
			if(tmp.ban != prevBan)
			{
				prevRank  = -1;
				prevTotal = -1;
				n=0;
			}
			if(tmp.total == prevTotal)
			{
				tmp.classRank = prevRank;
			}
			else
			{
				tmp.classRank = n+1;
			}
			
			prevBan = tmp.ban;
			prevTotal = tmp.total;
			prevRank = tmp.classRank;
		}
	}
	public static void CalculateSchoolRank(List<Student> list)
	{
		Collections.sort(list); // ������������ �������� ũ�� ���� ���� ��
		
		int prevRank = -1; // �����������
		int prevTotal = -1; // ���� ����
		int length = list.size();

		for ( int i = 0; i < length; i++ )
		{
			Student tmp = list.get(i);
			if ( tmp.total == prevTotal )
				tmp.schoolRank = prevRank;
			else
				tmp.schoolRank = i + 1;

			prevTotal = tmp.total;
			prevRank = tmp.schoolRank;
		}
	}

	public static void main(String [] args)
	{
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("������" , 2 , 1 , 70 , 90 , 70));
		list.add(new Student("������" , 2 , 2 , 60 , 100 , 80));
		list.add(new Student("ȫ�浿" , 1 , 3 , 100 , 100 , 100));
		list.add(new Student("���ü�" , 1 , 1 , 90 , 70 , 80));
		list.add(new Student("���ڹ�" , 1 , 2 , 80 , 80 , 90));

		CalculateSchoolRank(list);
		calculateClassRank(list);

		Iterator<Student> it = list.iterator();

		while ( it.hasNext() )
		{
			System.out.println(it.next());
		}
	}
}
