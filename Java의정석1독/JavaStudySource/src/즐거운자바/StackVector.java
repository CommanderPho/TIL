package ��ſ��ڹ�;

import java.util.*;

//Stack�� Vector�� ��ӹ޴µ�...
//���� �����ؼ�....
//Vector�� ����Ʈ�� ��ӹ޴µ� List�� ������ ���ݾ�
//�ڹ�������å���� ����� ����� ���� ����µ�
//����� ����̶���  1��° ���� ����� ���� ���� ó���Ǵ�  FIFO�����ε� ťó��
//Stack�� FILO ���ݾ�
// �׷��ϱ�  �ᱹ Stack extends Vector�ε�
//Vector�� FIFO  Stack�� LIFO �ε� ��Ӱ����... ����? ����?
// Stack�� ���� �� �� �߰��� �ִ°� ��ȸ�� �����ѵ�, 
// �߰��� �ִ� ���� ������ �޼���� �����ϱ� �´°ǰ�?
// get�� elementAt�� ��ȸ�� �ǰ� ������ �ȵǴµ�...

public class StackVector {
	public static void main(String[] args) {
		Stack a = new Stack();
		
		a.push("1");
		a.push("2");
		a.push("3");
		a.push("4");
		a.push("5");
//		System.out.println(a.get(3));
//		
//		System.out.println(a.pop());
//		System.out.println();
//		while(!a.isEmpty())
//		{
//			System.out.println(a.pop());
//		}
	
		
		Vector v = new Vector(5);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		System.out.println(v.elementAt(3));
		
		System.out.println(v);
		
		ArrayDeque sdf = new ArrayDeque();
		sdf.offerFirst("df");
	}
}
