package ch6_oop1_Exercise;

public class ch6_9 {
/*
 * ���� Ŭ������ static�� �ٿ��� �ϴ� ���� ���� ������?
 * ��, ��� ������ ���ݷ°� ������ ���ƾ� �Ѵ�.
 * 
 * static ��� �ν��Ͻ��� �����ϴ� ����
 * ���� weapon, armor�� static�� �ٿ��� ��
 * ��� ������ ���ݷ°� ������ ���� ����
 * 
 * ���� static������ ����ϴ� �޼��忡�� static�� �ٿ��� �Ѵ�.
 * ���� weaponUp�� armorUp�޼��忡�� static�� �ٿ��� �Ѵ�.
 * 
 */

}

class Marine{
	int x=0, y=0; // Marine�� ��ġ��ǥ(x,y);
	int hp = 60;
	int weapon = 6; // ���ݷ�
	int armor = 0; // ����
	
	void weaponUp(){
		weapon++;
	}
	
	void armorUp(){
		armor++;
	}
	
	void move(int x, int y){
		this.x = x;
		this.y = y;
	}
}
