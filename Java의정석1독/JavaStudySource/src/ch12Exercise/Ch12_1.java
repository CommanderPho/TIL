package ch12Exercise;

class Box<T>{
	T item;
	
	void setItem(T item){this.item = item;}
	T getItem() { return item;}
	
}

public class Ch12_1 {

	public static void main(String[] args) {
//		Box<Object> b = new Box<Stirng>();   // ����. ���Ե� Ÿ�� ��ġ�ؾ���
//		Box<Object> b = (Object)new Box<String>();   //����. OBjectŸ�԰� Box<Object>Ÿ���Ǻ���ġ
//		new Box<String>().setItem(new Object()); // ����. String�̿��� Ÿ���� �����Ұ�
		new Box<String>().setItem("ABC");  // StringŸ�������� ����
	}

}
