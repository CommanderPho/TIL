package ch8_Exception;

public class NewExceptionTest {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		} catch (MemoryException e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
			System.gc();
			System.out.println("�ٽ� ��ġ�� �õ����ּ���");
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		if(!enoughSpace()){
			throw new MemoryException("�޸𸮰� �����մϴ�.");
		}
	}
	
	static void copyFiles(){}
	static void deleteTmpFiles(){}
	
	static boolean enoughSpace() { return false; }
	static boolean enoughMemory() { return true; }
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