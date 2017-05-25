package ch2_3;

import java.util.Scanner;

/*
 * main�� ������ ��� static���(����,�޼���)�� non-static���� ����
 */
public class Code11
{
	 Polynomial[] polynomial = new Polynomial[100];
	 int n;
	
	public static void main(String [] args)
	{
		Code11 app = new Code11();
		app.processCommand();
	}
	
	public void processCommand()
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
					polynomial[n] = new Polynomial(name);
					n++;
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
					polynomial[index].addTerm(c , e);
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
					int result = polynomial[index].calcPolynomial(x);
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
					polynomial[index].printPolynomial();
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
	
	private int findPolynomialName(char name)
	{
		for(int i=0; i<n; i++)
		{
			if(polynomial[i].getName() == name)
				return i;
		}
		return -1;
	}
}
