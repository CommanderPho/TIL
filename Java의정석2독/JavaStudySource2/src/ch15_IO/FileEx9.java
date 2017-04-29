package ch15_IO;

import java.io.*;

public class FileEx9 {
	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("USAGE : java FileEx9 DIRECTORY");
			System.exit(0);
		}
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()){
			System.out.println("��ȿ���� �ʴ� �����丮�Դϴ�.");
			System.exit(0);
		}
		
		File[] files = dir.listFiles();
		
		for(int i=0; i<files.length; i++){
			String fileName = files[i].getName();
			// ���ϸ�
			String newFileName = "0000" + fileName;
			newFileName = newFileName.substring(newFileName.length()-7);
			files[i].renameTo(new File(dir,newFileName));
		}
	}
}
