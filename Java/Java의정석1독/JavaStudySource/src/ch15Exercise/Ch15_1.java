package ch15Exercise;

import java.io.*;

public class Ch15_1 {
	public static void main(String[] args) {
		
		try{
			int lineNum = Integer.parseInt(args[0]);
			String fileName = args[1];
			
			File f = new File(fileName);
			
			if(f.exists()&&!f.isDirectory()){
				BufferedReader br = new BufferedReader(new FileReader(fileName));
				String line = "";
				int i=1;
				
				while((line = br.readLine())!=null && i <= lineNum){
					System.out.println(i+":"+line);
					i++;
				}
			}else{
				throw new FileNotFoundException(fileName+"��/�� ���丮�̰ų�, �������� �ʴ� �����Դϴ�.");
			}
		}catch(FileNotFoundException e){
			
		}
		catch(Exception e){
			
		}
//		if(args.length != 2){
//			System.out.println("USAGE : java FileEx2 DIRECTORY");
//			System.exit(0);
//		}
//		
//		int lineNum = Integer.parseInt(args[0]);
//		String fileName = args[1];
//		
//		File f = new File(fileName);
//		
//		if(!f.exists() || f.isDirectory()){
//			System.out.println(fileName+"��/�� ���丮�̰ų�, �������� �ʴ� �����Դϴ�.");
//			System.exit(0);
//		}
//		
//		try {
//			FileReader fr = new FileReader(fileName);
//			BufferedReader br = new BufferedReader(fr);
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		String line;
//		while((line=br.readLine())!null && i <= lineNum){
//			
//		}
	}
}
