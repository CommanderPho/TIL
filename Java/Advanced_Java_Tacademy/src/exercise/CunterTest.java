package exercise;

public class CunterTest
{
	public static void main(String [] args)
	{
		Counter counter = new Counter();
		CounterListener listener = new CounterListener()
		{
			@Override
			public void onNotifyCount(int count)
			{
				System.out.println("10������ ��� : " + count);
			}
		};
		
		counter.setCouterListener(listener);
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			counter.inc();
		}
	}
}
