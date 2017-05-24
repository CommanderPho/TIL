package ch2_1;

import java.util.Scanner;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
/* ������ �� 3��
 * 1 .arrayList�� linkedlist ����ؼ� ����
 * taskset���ϰ�
 */

public class Code6
{
	static Polynomial[] polynomial = new Polynomial[100];
	static int n;
	
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		while ( true )
		{
			System.out.print("$ ");
			String command = s.next();
			if ( command.equalsIgnoreCase("create") )
			{
				char name = s.next().charAt(0);
				int index = findPolynomialName(name);
				if(index==-1) // ������ ������ ����
				{
					polynomial[n] = new Polynomial();
					polynomial[n].name = name;
					polynomial[n].nTerms = 0;
					polynomial[n++].terms = new Term[100];
					System.out.println("���׽� " + name + "�� �� ������");
				}
				else // ������ ������
				{
					System.out.println("���׽� f�� ������ �ֽ��ϴ�.");
				}

			}
			else if ( command.equalsIgnoreCase("add") )
			{
				char name = s.next().charAt(0);
				int index = findPolynomialName(name);
				if(index==-1) // ���� �߰��Ϸ��� ���׽��� ������
				{
					System.out.println("�߰��Ϸ��� ���׽��� �����ϴ�.");
				}
				else // ������ ������ ���� �߰�
				{
					int c = s.nextInt(); // ���
					int e = s.nextInt(); // ����
					addTerm(polynomial[index], c, e);
				}
				
			}
			else if ( command.equalsIgnoreCase("calc") )
			{
				char name = s.next().charAt(0);
				int index = findPolynomialName(name);
				if(index == -1)
					System.out.println("ã�� ���׽��� �����ϴ�.");
				else
				{
					int x = s.nextInt();
					int result = calcPolynomial(polynomial[index] ,x);
					System.out.println("result : " + result);
				}
			}
			else if ( command.equalsIgnoreCase("print") )
			{
				char name = s.next().charAt(0);
				int index = findPolynomialName(name);
				if(index==-1)
					System.out.println("ã�� ���׽��� �����ϴ�.");
				else
				{
					printPolynomial(polynomial[index]);
				}
			}
			else if ( command.equalsIgnoreCase("exit") )
			{
				System.out.println("���α׷� ����");
				break;
			}
		}
		s.close();
	}
	private static int calcPolynomial(Polynomial p, int x)
	{
		int result = 0;
		for(int i=0; i<p.nTerms; i++)
		{
			result += calcTerm(p.terms[i],x);
		}
		return result;
	}
	private static int calcTerm(Term term, int x)
	{
		return (int)(term.coef * Math.pow(x , term.expo));
	}
	private static void printPolynomial(Polynomial p)
	{
		for(int i=0; i<p.nTerms; i++)
		{
			printTerm(p.terms[i]);
			System.out.print("+");
		}
		System.out.println();
	}
	private static void printTerm(Term term)
	{	 //2.  +-1x^2   ---> -x^2 �輱
		System.out.print(term.coef + "x^" + term.expo);
	}
	private static void addTerm(Polynomial p, int c, int e)
	{
		int index = findExpo(p, e);
		if(index==-1)  // �ش����� �������� �ʴ´ٸ�, ��ġ ã�Ƽ� �ֱ�
		{
			int i = p.nTerms-1;
			while(i>=0 && p.terms[i].expo < e)
			{
				p.terms[i+1] = p.terms[i];
				i--;
			}
			p.terms[i+1] = new Term();
			p.terms[i+1].coef = c;
			p.terms[i+1].expo = e;
			p.nTerms++;
		}
		else  // ���� �Ѵٸ� ��� ã�Ƽ� �ֱ�
		{
			 // 3. ����� 0�� �� �� ó��
			p.terms[index].coef += c;
		}
	}
	private static int findExpo(Polynomial p, int e)
	{
		for(int i=0; i<p.nTerms && p.terms[i].expo>=e ; i++)
		{
			if(p.terms[i].expo == e)
				return i;
		}
		return -1;
	}
	private static int findPolynomialName(char name)
	{
		for(int i=0; i<n; i++)
		{
			if(polynomial[i].name == name)
				return i;
		}
		return -1;
	}
}
