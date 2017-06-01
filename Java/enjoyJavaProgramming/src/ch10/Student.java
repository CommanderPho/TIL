package ch10;

public class Student
{
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	// getter : �ܺο��� �ʵ带 ���� �� �ֵ��� �����ִ� �޼���
	// setter : �ܺο��� �ʵ��� ���� �����ϵ��� �����ִ� �޼���
	
	
	
	public Student(String name, int kor, int math, int eng)
	{
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	public Student(String name)
	{
		// �ߺ�����
		this(name,0,0,0); // 15��°������ȣ�� (���� �Ķ���Ͱ� ���� �ʿ��� ������ ȣ��)
//		this.name = name;
//		this.kor = 0;
//		this.math = 0;
//		this.eng = 0;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public int getKor()
	{
		return kor;
	}
	public void setKor(int kor)
	{
		this.kor = kor;
	}
	public int getMath()
	{
		return math;
	}
	public void setMath(int math)
	{
		this.math = math;
	}
	public int getEng()
	{
		return eng;
	}
	public void setEng(int eng)
	{
		this.eng = eng;
	}
}
