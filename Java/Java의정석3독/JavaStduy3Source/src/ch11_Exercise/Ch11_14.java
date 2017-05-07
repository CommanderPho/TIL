package ch11_Exercise;

import java.io.*;
import java.util.*;

public class Ch11_14
{
	static ArrayList<Student> record = new ArrayList<>();
	static Scanner s = new Scanner(System.in);

	public static void main(String [] args)
	{
		while ( true )
		{
			switch ( displayMenu() )
			{
				case 1 :
					inputRecord();
					break;
				case 2 :
					displayRecord();
					break;
				case 3 :
					System.out.println("���α׷� ����");
					System.exit(0);
			}
		}
	}

	static int displayMenu()
	{
		System.out.println("*****************************************");
		System.out.println(" *            ���� ���� ���α׷�                             *");
		System.out.println("*****************************************");
		System.out.println();
		System.out.println("1.�л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2.�л����� ����");
		System.out.println();
		System.out.println("3.���α׷� ����");
		System.out.println();

		int menu = 0;
		while ( true )
		{
			System.out.print("���ϴ� �޴��� �����ϼ���.(1~3) : ");
			menu = s.nextInt();
			if ( !(1 <= menu && menu <= 3) )
			{
				System.out.println("�߸��� ���Դϴ�.");
				continue;
			}
			else
				break;

		}
		
		return menu;
	}
	static void inputRecord()
	{
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println("�̸�, ��, ��ȣ, �����, �����, ���м����� ������ ������� �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
		
		while(true)
		{
			System.out.print(">>");
			
			try
			{
				String input = s.nextLine().trim();
				
				if(!input.equalsIgnoreCase("q"))
				{
					Scanner s2 = new Scanner(input).useDelimiter(",");
					record.add(new Student(s2.next() , s2.nextInt() , s2.nextInt() 
							, s2.nextInt() , s2.nextInt() , s2.nextInt()));
					System.out.println("�� �Է�. �Է� ��ġ���� q�Է�");
				}
				else
				{
					return;
				}
			}
			catch ( Exception e )
			{
				System.out.println("�Է¿���. �̸�, ��, ��ȣ, �����, ����, ���м����� �Է�");
			}
		}
	}
	static void displayRecord()
	{
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		
		int length = record.size();
		
		if(length > 0)
		{
			System.out.println();
			System.out.println("�̸� �� ��ȣ ���� ���� ���� ���� ��� ������� �ݵ��");
			System.out.println("========================");
			for(int i=0; i<length; i++)
			{
				Student student = (Student)record.get(i);
				System.out.println(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.total;
			}
			
			System.out.println("============================");
			System.out.println("���� : " + koreanTotal + " " + englishTotal
					+ " " + mathTotal + " " + total);
			System.out.println();
		}
		else
		{
			System.out.println("==================");
			System.out.println("�����Ͱ� �����ϴ�.");
			System.out.println("==================");
		}
	}
}
