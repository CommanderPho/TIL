package ch13_interface;

public class Dice9 implements Dice
{
	// get�޼ҵ带 ����
	@Override
	public int get()
	{
		return (int)(Math.random()*9)+1;
	}
}
