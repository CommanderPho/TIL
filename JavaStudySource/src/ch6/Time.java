package ch6;

public class Time {
	private int hour;
	private int minute;
	private float second;
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour<0 || hour> 23)
			return;
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0  || minute>59)
			return;
		this.minute = minute;
	}
	public float getSecond() {
		return second;
	}
	public void setSecond(float second) {
		if(second<0.0f || second>59.9f)
			return;
		this.second = second;
	}
	/*
	 *  �ð��� ���� ���ϴ� �޼���� ���� �ð��� ���õ� �޼��带 �߰���
	 * �����Ͽ� timeŬ������ ������ ����
	 */
	
}