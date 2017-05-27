package ch3_4;

public class MyDate
{
	int year;
	int month;
	int day;

	public MyDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString()
	{
		return year + "/" + month + "/" + day;
	}
	
	public int compareTo(MyDate d)
	{
		if(year < d.year || year==d.year && month<d.month ||   // �񱳴�󺸴� ������ -1
				year==d.year && month==d.month && day<d.day)
			return -1;
		else if(year > d.year || year==d.year && month>d.month ||  // �񱳴�󺸴� ũ�� 1
				year==d.year && month==d.month && day>d.day)
			return 1;
		else                                             // ������ 0
			return 0;
	}
}
