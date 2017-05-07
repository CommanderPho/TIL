package ch11_Collection_Framework;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List{
	//��ü�� ��� ���� ��ü�迭�� ����
	Object[] data = null;
	// �뷮
	int capacity;
	// ũ��
	int size;
	
	//MyVector(int capacity) �ۼ�
	public MyVector(int capacity){
		if(capacity < 0)
			throw new IllegalArgumentException("��ȿ���� ���� ���Դϴ�."+capacity);
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	//MyVector() �ۼ�, �⺻ ũ�� 10
	public MyVector(){
		this(10);
	}
	
	//�ּ����� ����(capacity)�� Ȯ���ϴ� �޼���
	public void ensureCapacity(int minCapacity){
		if(minCapacity > capacity)
			setCapacity(minCapacity);
	}
	
	// size ��ȯ
	@Override
	public int size() {
		return size;
	}
	
	// capacity ��ȯ
	public int capacity(){
		return capacity;
	}
	
	// ����ִ��� Ȯ��
	@Override
	public boolean isEmpty() {
		return size==0;
	}
	
	// ��ü o�� �ִ��� Ȯ��
	@Override
	public boolean contains(Object o) {
		for(int i=0; i<size; i++){
			if(o.equals(data[i]))
				return true;
		}
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// ��ü���� ��ü�迭�� ��ȯ
	@Override
	public Object[] toArray() {
		Object result[] = null;
		System.arraycopy(data, 0, result, 0, size);
		return result;
	}
	
	
	// ��ü �迭 a�� ��Ƽ� ��ȯ
	@Override
	public Object[] toArray(Object[] a) {
		System.arraycopy(data, 0, a, 0, size);
		return a;
	}
	
	// �ۼ�
	@Override
	public boolean add(Object obj) {
		// ���ο� ��ü�� �����ϱ� ���� ������ ������ Ȯ���Ѵ�.
		ensureCapacity(size+1);
		data[size++] = obj;
		return true;
	}

	// �ۼ�
	@Override
	public boolean remove(Object obj) {
		for(int i=0; i<size; i++){
			if(obj.equals(data[i])){
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	// �ۼ�
	public void trimToSize(){
		setCapacity(size);
	}
	
	// �ۼ�
	public void setCapacity(int capacity){
		//ũ�Ⱑ ������ �������� �ʴ´�.
		if(this.capacity == capacity) return;

		this.capacity = capacity;
		Object tmp[] = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
	}
	
	// �ۼ�
	@Override
	public Object remove(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		
		Object tmp = data[index];
		//�����ϰ��� �ϴ� ��ü�� ������ ��ü�� �ƴ϶��, �迭���縦 ���� ���ڸ��� ä����� �Ѵ�.
		if(index!=size-1){
			System.arraycopy(data, index+1, data, index, size-1-index);
		}
		
		//������ �����͸� null�� ����
		//�迭�� 0���� �����ϹǷ� ������ ��Ҵ� index�� size-1�̴�.
		// size�� �ϳ� ���δ�.
		data[--size] = null;

		//������ ��ü ��ȯ
		return tmp;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	// �ۼ�
	@Override
	public void clear() {
		for(int i=0; i<size; i--){
			data[i] = null;
		}
		size = 0;
	}

	//�ۼ�
	@Override
	public Object get(int index) {
		if( index < 0 || index >= size)
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		return data[index];
	}

	// �ۼ�
	@Override
	public Object set(int index, Object element) {
		if( index < 0 || index >= size)
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		
		data[index] = element;
		
		return null;
	}
	
	// �ۼ�
	@Override
	public void add(int index, Object element) {
		if ( index < 0 || index >= size )
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		ensureCapacity(size+1);
		System.arraycopy(data, index, data, index+1, size-index);
		data[index] = element;
		size++;
	}


	// �ۼ�
	@Override
	public int indexOf(Object o) {
		for(int i=0; i<size; i++){
			if(o.equals(data[i]))
				return i;
		}
		return -1;
	}

	// �ۼ�
	@Override
	public int lastIndexOf(Object o) {
		for(int i=size-1; i >=0; i--){
			if(o.equals(data[i]))
				return i;
		}
		return -1;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean equals(Object o){
		return super.equals(o);
	}
	
	public String toString() {
		return super.toString();
	}
}
