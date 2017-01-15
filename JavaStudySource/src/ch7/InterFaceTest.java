package ch7;

class Unit{
	int currentHP;
	int x;
	int y;
}

interface Attackable { void attact(Unit u);}
interface Movable {void move(int x, int y);}
interface Fightable extends Attackable, Movable{}

class Fighter extends Unit implements Fightable{
	@Override
	public void attact(Unit u) {
	}

	@Override
	public void move(int x, int y) {
	}
}


public class InterFaceTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f�� Unit Ŭ������ �ڼ��Դϴ�.");
		if(f instanceof Fightable)
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�.");
		if(f instanceof Movable)
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�.");
		if(f instanceof Attackable)
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		if(f instanceof Object)
			System.out.println("f�� Object�������̽��� �����߽��ϴ�.");
	}
}
