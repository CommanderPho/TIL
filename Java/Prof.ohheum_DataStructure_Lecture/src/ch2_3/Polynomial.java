package ch2_3;

public class Polynomial
{
	private char name;
	private int nTerms;
	private Term[] terms;
	
	public Polynomial(char name)
	{
//		nTerms = 0;
		this.name = name;
		terms = new Term[100];
	}
	
	
	
	public char getName()
	{
		return name;
	}



	public int calcPolynomial(int x)
	{
		int result = 0;
		for(int i=0; i<nTerms; i++)
		{
			result += terms[i].calcTerm(x);
		}
		return result;
	}

	public void printPolynomial()
	{
		for(int i=0; i<nTerms; i++)
		{
			terms[i].printTerm();
			System.out.print("+");
		}
		System.out.println();
	}
	
	public void addTerm(int c, int e)
	{
		int index = findExpo( e);
		if(index==-1)  // �ش����� �������� �ʴ´ٸ�, ��ġ ã�Ƽ� �ֱ�
		{
			int i = nTerms-1;
			while(i>=0 && terms[i].getExpo() < e)
			{
				terms[i+1] = terms[i];
				i--;
			}
			terms[i+1] = new Term(c,e);
			nTerms++;
		}
		else  // ���� �Ѵٸ� ��� ã�Ƽ� �ֱ�
		{
			 // 3. ����� 0�� �� �� ó��
			terms[index].setCoef(terms[index].getCoef()+c);
		}
	}
	
	private int findExpo(int e)
	{
		for(int i=0; i<nTerms && terms[i].getExpo()>=e ; i++)
		{
			if(terms[i].getExpo() == e)
				return i;
		}
		return -1;
	}
}
