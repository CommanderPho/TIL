package ch7_oop2;
public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time(12,35,30);
		System.out.println(t);
//		t.hour = 13 ;  // error, ���� hour�� ���� �����ڰ� private�̹Ƿ� ���� �Ұ�
		t.setHour(t.getHour()+1);
		System.out.println(t);
	}
}
