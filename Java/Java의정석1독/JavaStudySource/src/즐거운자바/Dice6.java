package ��ſ��ڹ�;

public class Dice6 implements Dice {

	@Override
	public int get() {
		int value = (int)(Math.random()*6)+1;
		return value;
	}

}
