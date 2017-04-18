package ch11_Collection_Framework;

import java.util.*;

// �ҽ�¥�� MyVector2Test�� �׽�Ʈ�غ��� p.625

public class MyVector2 extends MyVector implements Iterator{
	// cursor, lastRet ����
	int cursor = 0;
	int lastRet = -1;
	
	public MyVector2(int capacity){
		super(capacity);
	}
	
	public MyVector2(){
		this(10);
	}
	
	public String toString(){
		return "";
	}
	
	public Iterator iterator(){
		// cursor�� lastRet�ʱ�ȭ
		cursor = 0;
		lastRet = -1;
		return this;
	}
	
	@Override
	public boolean hasNext() {
		// ����
		return false;
	}

	@Override
	public Object next() {

		return null;
	}
	
	public void remove(){
		//���̻� ������ ���� ������ IllegalStateException�� �߻�

		// �ֱٿ� �о�� ��Ҹ� �����Ѵ�.
	}
}
