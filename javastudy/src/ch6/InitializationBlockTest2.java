package ch6;

class Document{
	static int count = 0;
	String DocuName;
	
	Document(){
		this("�������"+ ++count);
	}
	Document(String DocuName){
		this.DocuName = DocuName;
		System.out.println("���� "+this.DocuName + "�� �����ƽ��ϴ�.");
	}
}

public class InitializationBlockTest2 {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document();
		Document d3 = new Document("�ڹ�.txt");
		Document d4 = new Document();
	}
}
