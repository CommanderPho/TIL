package ch7_oop2;

import static java.lang.Integer.*; // Integer Ŭ������ ��� static �޼���
import static java.lang.Math.random; // Math.random()�� , ��ȣ �� ����
import static java.lang.System.out; // System.out�� out������ ��������
import static java.lang.Math.PI;


public class StaticImportEx1 {
	public static void main(String[] args) {
//		System.out.println(Math.random());
		out.println(random());
		
//		System.out.println("Math.PI : " + Math.PI);
		out.println("Math.PI : " + PI);
		

	}
}
