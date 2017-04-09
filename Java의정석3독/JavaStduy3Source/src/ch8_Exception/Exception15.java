package ch8_Exception;

import java.io.*;

public class Exception15 {
	public static void main(String[] args) {
		File f;
		try {
			f = createFile(args[0]);
		} catch (Exception e) {
			f = createFile("test");
		}
		System.out.println(f.getName() + " ������ ���������� �����ƽ��ϴ�.");
		
	}
	
	@SuppressWarnings("finally")
	static File createFile(String fileName){
		try {
			if( fileName == null || fileName.equals(""))
				throw new Exception(" ���� �̸��� ��ȿ���� �ʽ��ϴ�.");
		} catch (Exception e) {
			fileName = "�������";
		} finally{
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f){
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
