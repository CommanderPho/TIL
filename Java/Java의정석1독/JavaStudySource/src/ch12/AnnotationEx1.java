package ch12;

public class AnnotationEx1 {
}

class Parent{
	void parentMethod(){}
}
class Child extends Parent{
	@Override
//	void parentmethod(){}   ���� �߻� ���� �޼����� �Ϲ��� �߸� ����
	void parentMethod(){}
}