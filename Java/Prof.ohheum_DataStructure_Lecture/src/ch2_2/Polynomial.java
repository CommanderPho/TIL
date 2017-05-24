package ch2_2;

public class Polynomial
{
	public char name;
	public int nTerms;
	public Term[] terms;
	
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
			while(i>=0 && terms[i].expo < e)
			{
				terms[i+1] = terms[i];
				i--;
			}
			terms[i+1] = new Term();
			terms[i+1].coef = c;
			terms[i+1].expo = e;
			nTerms++;
		}
		else  // ���� �Ѵٸ� ��� ã�Ƽ� �ֱ�
		{
			 // 3. ����� 0�� �� �� ó��
			terms[index].coef += c;
		}
	}
	public int findExpo(int e)
	{
		for(int i=0; i<nTerms && terms[i].expo>=e ; i++)
		{
			if(terms[i].expo == e)
				return i;
		}
		return -1;
	}
}
