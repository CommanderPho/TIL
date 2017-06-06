package ch11;

public class CalBean
{
	//����
	
	// �̱������� 1,2,3
	
	// 2) private ������ static�� �ʵ带 ����(�ڱ� �ڽ��� �����ϴ�)
	// �ڱ� �ڽ��� �����ڸ� ȣ���Ͽ� �ʱ�ȭ �Ѵ�.
	// static�� �ν��Ͻ��� ��������� ���� ȣ��Ǵ� �ڵ�. �� �� ��.
	private static CalBean instance = new CalBean();
	
	// 3) 2������ instacne�� ��ȯ�ϴ� public static�޼ҵ带 �����.
	public static CalBean getInstance()
	{
		// �ܺο��� �ν��Ͻ��� �� ����� ��.
		System.out.println("getInstance!");
		return instance;
	}
	
	// 1) private �� �����ڸ� ����.
	private CalBean()
	{
		System.out.println("CalBean() : ������");
	}
	
	public int plus(int i, int m)
	{
		return i+m;
	}
}
