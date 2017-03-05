package ch15Exercise;

import java.io.*;

public class Ch15_5 {
	public static void main(String[] args) {
		if(args.length != 2){
			System.out.println("USAGE : java Exercise15_5 TAGET_FILE RESULT_FILE");
			System.exit(0);
		}
		
		String inputFile = args[0];
		String outputFile = args[1];
		
		try{
			BufferedReader input = new BufferedReader(new FileReader(inputFile));
			HtmlTagFilterWriter output = new HtmlTagFilterWriter(new FileWriter(outputFile));
			
			int ch = 0;
			
			while((ch=input.read())!=-1){
				output.write(ch);
			}
			
			input.close();
			output.close();
		}catch(Exception e){}
	}
}

class HtmlTagFilterWriter extends FilterWriter{
	StringWriter tmp = new StringWriter();
	boolean inTag = false;
	
	HtmlTagFilterWriter(Writer arg0) {
		super(arg0);
	}
	
	public void write(int c) throws IOException{
		
//		1.����� ����(c)�� '<'�̸� inTag�� ���� true�� �Ѵ�.
		if(c=='<') inTag = true;
//		2.����� ����(c)�� '>'�̸� inag�� ���� false�� �Ѵ�.
//		 ���ο� StringWriter�� �����Ѵ�. (���� StirngWriter�� ������ ������.)
		if(c=='>'){
			inTag = false;
			tmp = new StringWriter(); 
		}
//		3. inTag�� ���� true�̸�, StringWriter�� ����(c)�� ����ϰ�
		if(inTag)
			tmp.write(c);
//		inTag�� ���� false�̸�, out�� ����(c)�� ����Ѵ�.
		else
			out.write(c);

		
	}
	public void close() throws IOException{
		out.write(tmp.toString());
		super.close();
	}
	
}
