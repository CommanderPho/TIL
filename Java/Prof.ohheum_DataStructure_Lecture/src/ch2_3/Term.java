package ch2_3;

public class Term
{
	private int coef; //���
	private final int expo; // ����
	
	public Term(int c, int e)
	{
		coef = c;
		expo = e;
	}
	
	public int getCoef()
	{
		return coef;
	}

	public void setCoef(int coef)
	{
		this.coef = coef;
	}

	public int getExpo()
	{
		return expo;
	}

	public  void printTerm()
	{	 //2.  +-1x^2   ---> -x^2 �輱
		System.out.print(coef + "x^" + expo);
	}
	
	public int calcTerm(int x)
	{
		return (int)(coef * Math.pow(x , expo));
	}
}
