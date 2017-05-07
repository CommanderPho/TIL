package ch8;

public class UserDefindeException {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("���� �޽��� : "+e.getMessage());
			e.printStackTrace();
			System.out.println("������ �к��� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		} catch (MemoryException e2){
			System.out.println("���� �޽��� : "+e2.getMessage());
			e2.printStackTrace();
			System.gc(); // Garbage Collection�� �����Ͽ� �޸𸮸� �÷��ش�.
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
		}finally{
			deleteTemppFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		if(!enoughMemory())
			throw new MemoryException("�޸𸮰� �����մϴ�.");
		
	}
	static void copyFiles(){}
	static void deleteTemppFiles(){}
	
	static boolean enoughSpace(){
		return false;
	}
	static boolean enoughMemory(){
		return false;
	}
}

class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}
class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}