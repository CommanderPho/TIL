package ch6;

class Tv6_3{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

public class Ch6_3 {
	public static void main(String[] args) {
		Tv6_3 t1 = new Tv6_3();
		Tv6_3 t2 = new Tv6_3();
		System.out.println("t1�� ä�ΰ��� "+t1.channel+"�Դϴ�.");
		System.out.println("t2�� ä�ΰ��� "+t2.channel+"�Դϴ�.");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1�� ä�ΰ��� "+t1.channel+"�� ����");
		
		System.out.println("t1�� ä�ΰ��� "+t1.channel+"�Դϴ�.");
		System.out.println("t2�� ä�ΰ��� "+t2.channel+"�Դϴ�.");
	}
}
