package ch8_Exception;

public class ChainedExceptionEx {
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
	// SpaceException�� MemoryException��  InstallException�� �ϳ��� ����(����� ����)
	// ������ε� �� �� ������ SpaceException, MemoryException ��Ӱ��踦 ����ؾ� �ؼ� ����.
	static void Install() throws InstallException{
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			InstallException ie = new InstallException("��ġ �� ���� �߻�");
			ie.initCause(e);
			throw ie;
		} catch (MemoryException e) {
			InstallException ie = new InstallException("��ġ �� ���� �߻�");
			ie.initCause(e);
			throw ie;
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		if(!enoughSpace()){
			throw new MemoryException("�޸𸮰� �����մϴ�.");
//			throw new RuntimeException(new MemoryException("�޸𸮰� �����մϴ�."));
//		 	checked���ܸ� unchecked���ܷ� �ٲ�
		}
	}
	
	static void copyFiles(){}
	static void deleteTmpFiles(){}
	
	static boolean enoughSpace() { return false; }
	static boolean enoughMemory() { return true; }
}

class InstallException extends Exception{
	InstallException(String msg){
		super(msg);
	}
}
