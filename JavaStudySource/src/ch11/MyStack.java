package ch11;

import java.util.*;

public class MyStack extends Vector {
	public Object push(Object item){
		addElement(item);
		return item;
		
	}
	public Object pop()
	{
		Object obj = peek(); //Stack�� ����� ������ ��Ҹ� �о�´�.
		// ���� Stack�� ��������� peek()�޼��尡 EmptyStackException�� �߻�
		// ������ ��Ҹ� �����Ѵ�. �迭�� index�� 0���� �����ϹǷ� 1�� ���ش�.
		removeElementAt(size()-1);
		return obj;
	}
	
	public Object peek(){
		int len = size();
		
		if(len ==0) throw new EmptyStackException();
		//������ ��Ҹ� ��ȯ�Ѵ�. �迭�� indext�� 0���� �����ϹǷ� 1�� ���ش�.
		return elementAt(len-1);
	}
	public boolean emty(){
		return size() == 0;
	}
	
	public int search(Object o){
		int i = lastIndexOf(o); // ���������� ��ü�� ã�´�.
		//��ȯ���� ����� ��ġ(�迭�� index)�̴�.
		if( i >= 0) { //��ü�� ã�� ���
			return size()-i; // Stack�� �� ���� ����� ��ü�� index�� 1�� �����ϱ� ������
		}                    // ���ɤ� ���ؼ� ���Ѵ�.
		return -1;
	}
	
	public static void main(String[] args) {
		
	}
}