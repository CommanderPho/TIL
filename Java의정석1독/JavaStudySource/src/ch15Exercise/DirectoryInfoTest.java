package ch15Exercise;

import java.io.*;

public class DirectoryInfoTest {
	static int totalFiles = 0;
	static int totalDirs = 0;
	static int totalSize = 0;
	
	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("USAGE : java DirectoryInfoTest DiRECTORY");
			System.exit(0);
		}
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()){
			System.out.println("��ȣ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}
		
		countFiles(dir);
		
		System.out.println();
		System.out.println("�� " + totalFiles + "���� ����");
		System.out.println("�� " + totalDirs + "���� ���丮");
		System.out.println("ũ�� " + totalSize + "bytes");
	}
	public static void countFiles(File dir){
//		1. dir�� ���ϸ��(File [])�� ���´�.
		File[] files = dir.listFiles();
//		2. ���� ���ϸ���� �����߿���
		for(int i=0; i<files.length; i++){
			// ���丮�̸� totalDirs�� ���� ������Ű�� countFiles()�� ���ȣ��
			if(files[i].isDirectory()){
				totalDirs++;
				countFiles(files[i]);
			}
			//�����̸� totallFiles�� ������Ű�� ������ ũ�⸦ totalSize�� ���Ѵ�.
			if(files[i].isFile()){
				totalFiles++;
				totalSize+=files[i].length();
			}
	
		}
		
	}
}
