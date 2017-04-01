package ch6;

import java.util.Arrays;

class MyMath32{
	static int add(int a, int b){
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	static long add(int a, long b){
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	static long add(long a, int b){
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}
	static long add(long a, long b){
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	static int add(int[] a){
		System.out.print("int add(int[] a)-");
		/*-----------for��
		int result = 0;
		for(int i=0; i<a.length;i++)
			result += a[i];
		return  result;
		*/
		
		/*-----------���� for��
		int result = 0;
		for(int i : a)
			result += i;
		return  result;
		*/
		
		//��Ʈ�� ���
		return Arrays.stream(a).sum();
	}
}

public class OverloadingTestWithStatic {
	public static void main(String[] args) {

		System.out.println("mm.add(3,3) ���:"+MyMath32.add(3, 3));
		System.out.println("mm.add(3L,3) ���:"+MyMath32.add(3L, 3));
		System.out.println("mm.add(3,3L) ���:"+MyMath32.add(3, 3L));
		System.out.println("mm.add(3L,3L) ���:"+MyMath32.add(3L, 3L));
		
		int[] a = {100,200,300};
		System.out.println("mm.add(a) ���:"+MyMath32.add(a));
	}

}
