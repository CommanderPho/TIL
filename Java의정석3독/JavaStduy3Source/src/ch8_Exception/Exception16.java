package ch8_Exception;

import java.io.*;

public class Exception16 {
	public static void main(String[] args) {

		try {
			File f = createFile("test");
			System.out.println(f.getName() + " ������ ���������� ���� ��");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static File createFile(String fileName) throws Exception{
		if(fileName == null || fileName.equals(""))
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}
}
