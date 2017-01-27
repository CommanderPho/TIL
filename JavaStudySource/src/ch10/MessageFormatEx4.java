package ch10;

import java.io.*;
import java.util.*;
import java.text.*;
import static java.text.MessageFormat.*;

public class MessageFormatEx4  {
	public static void main(String[] args) throws Exception {
		String tableName = "CUST_INFO";
		String fileName = "data4.txt";
		String msg = "INSERT INTO CUST_INFO VALUES({0},{1},{2},{3});";
		Scanner s = new Scanner(new File(fileName));
		
		String pattern = "{0}, {1}, {2}, {3}";
		MessageFormat mf = new MessageFormat(pattern);
		
		while(s.hasNextLine()){
			String line = s.nextLine();
			Object[] objs = mf.parse(line);
			System.out.println(format(msg, objs));
		}
		s.close(); // �۾��� �������� Scanner���� ����� ������ �ݾ� �ش�.
	}
}
