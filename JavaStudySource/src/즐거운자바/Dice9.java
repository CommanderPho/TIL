package ��ſ��ڹ�;

public class Dice9 implements Dice {

	@Override
	public int get() {
		int value = (int)(Math.random()*9)+1;
		return value;
	}

}
