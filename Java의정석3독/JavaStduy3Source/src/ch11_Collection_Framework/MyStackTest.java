package ch11_Collection_Framework;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push("1");
		ms.push("2");
		ms.push("3");
		
//		while(!ms.empty())
//			System.out.println(ms.pop());
		
		System.out.println(ms.search("3"));
		
	}
//012 ArrayList �迭�� �ε���
//123 ��
//����						   ������ �� ���� ��ü�� index�� 1������
//3   index 2   size3 -index2 = 1
//2	        1   size3 -index1 = 2
//1         0   size3 -index0 = 3
}
