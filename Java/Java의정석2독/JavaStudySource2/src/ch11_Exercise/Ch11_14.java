package ch11_Exercise;

import java.io.*;
import java.util.*;


public class Ch11_14 {
	
	static ArrayList record = new ArrayList(); // ���������� ���� ����
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true){
			switch(displayMenu()){
			case 1:
				inputRecord();
				break;
			case 2:
				displayRecord();
				break;
			case 3:
				System.out.println("����");
				System.exit(0);
			}
		}
	}
	
	static int displayMenu(){
		System.out.println("************************************");
		System.out.println("***** ���� ���� ���α׷� ***********");
		System.out.println("************************************");
		System.out.println();
		System.out.println(" 1. �л����� �Է��ϱ�");
		System.out.println();
		System.out.println(" 2. �л����� ����");
		System.out.println();
		System.out.println(" 3. ���α׷� ����");
		System.out.println();
		
		System.out.print("���ϴ� �޴� ���� 1~3 : ");
		int menu = 0;
		
		while(true){
			try {
				menu = Integer.parseInt(s.nextLine().trim());
				if( 1<= menu && menu <=3) break;
				else throw new Exception();
			} catch (Exception e) {
				System.out.println("�ٽ� �Է����ּ��� ���� 1~3");
			}
		}
		
		return menu;
	}
	
	static void inputRecord(){
		System.out.println("1.�л������Է��ϱ�");
		System.out.println("�̸�,��,��ȣ,�����,�����,���м����� ������ ������� �Է��ϼ���.");
		System.out.println("�Է�����ġ����q���Է��ϼ��� ����ȭ������ ���ư��Ϥ�.");
		
		while(true){
			System.out.print(">>");
		try{	
			String input = s.nextLine().trim();
			
			if(!input.equalsIgnoreCase("q")){
				Scanner s2 = new Scanner(input).useDelimiter(",");
				record.add(new Student14(s2.next(),s2.nextInt(),s2.nextInt(),s2.nextInt(),s2.nextInt(),s2.nextInt()));
				System.out.println("�Է¿Ϸ� ��ġ���� q");
			}else{
				return;
			}
		}catch(Exception e){
			System.out.println("�Է¿���. �̸�, ��, ��ȣ, �����, �����, ���м��������� �Է�");
		}
	}
}
	static void displayRecord(){
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total  = 0;
		
		int length = record.size();
		
		if(length > 0){
			System.out.println();
			System.out.println("�̸� �� ��ȣ ���� ���� ���� ���� ��� ������� �ݵ��");
			
			System.out.println("===================================");
			
			for(int i=0; i<length; i++){
				Student14 student = (Student14)record.get(i);
				System.out.println(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.total;
			}
			System.out.println("=================================");
			System.out.println("���� : "+koreanTotal+" "+englishTotal+" "+mathTotal+" "+total);
			System.out.println();
		}
		else{
			System.out.println("=======================");
			System.out.println("�����Ͱ� �����ϴ�./");
			System.out.println("=======================");
		}
	}
}

class Student14 implements Comparable{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	int schoolRank;
	int classRank;
	
	
	
	public Student14(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+ eng + math;
	}
	
	int getTotal(){
		return total;
	}
	
	float getAverage(){
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Student14){
			Student14 tmp = (Student14)o;
			return tmp.total - this.total;
		}else{
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Student14 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + ", total=" + total + ", schoolRank=" + schoolRank + ", classRank=" + classRank + "]";
	}
	
	
}
