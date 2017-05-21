package ch1_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code22
{
	static String[] words = new String[100_000];
	static int[] count = new int[100_000];
	static int idx = 0;
	static String prompt = "$ ";
	
	public static void main(String [] args)
	{	
		Scanner s = new Scanner(System.in);

		while(true)
		{
			System.out.print(prompt);
			String command = s.next();
			if(command.equalsIgnoreCase("read"))
			{
				String fileName = s.next();
				makeIndex(fileName);
			}
			else if(command.equalsIgnoreCase("find"))
			{
				String word = s.next();
				int index = findWord(word);
				if(index > -1)
					System.out.println("The word \"" + word + "\" appears " + count[index] + " times.");
				else
					System.out.println("The word \"" + word + "\" doesn't appears ");
			}
			else if(command.equalsIgnoreCase("saveas"))
			{
				String fileName = s.next();
				saveasFile(fileName);
			}
			else if(command.equalsIgnoreCase("exit"))
				break;
			else 					
				System.out.println("��ȿ���� ���� ��ɾ��Դϴ�. �ٽ� �Է����ּ���.");
		}
	}
	public static void makeIndex(String fileName)
	{
		try(Scanner s = new Scanner(new File("sample.txt")))
		{
			while(s.hasNext())
			{	String str = s.next();
				String strTrimmed = trimming(str);
				if(strTrimmed!=null)
					addWord(strTrimmed.toLowerCase());
			}
		}
		catch ( FileNotFoundException e )
		{
			System.out.println("������ ã�� ���߽��ϴ�.");
		}
	}
	
	private static String trimming(String str)
	{
		int i = 0, j = str.length()-1;
		
		while(i<str.length() && !Character.isLetter(str.charAt(i)))
			i++;
		while(j>=0&& !Character.isLetter(str.charAt(j)))
			j--;
		
		if(i>j)
			return null;
		else
			return str.substring(i , j+1);
	}
	public static void addWord(String word)
	{
		int index = findWord(word);
		if(index > -1)
		{
			count[index]++;
		}
		else
		{
			int i = idx-1;
			while( i>=0 && words[i].compareTo(word) > 0)
			{
				words[i+1] = words[i];
				count[i+1] = count[i];
				i--;
			}
			
			words[i+1] = word;
			count[i+1] = 1;
			idx++;
		}
	}
	
	public static int findWord(String word)
	{
		for(int i=0; i<idx; i++)
		{
			if(word.equalsIgnoreCase(words[i]))
			{
				return i;
			}
		}
		return -1;
	}
	public static void saveasFile(String fileName)
	{
		try(PrintWriter out = new PrintWriter(new FileWriter(fileName)))
		{
			for(int i=0; i<idx; i++)
			{
				out.println(words[i] + " " + count[i]);
			}
		}
		catch ( IOException e )
		{
			System.out.println("���� ����");
		}
	}
	
}
