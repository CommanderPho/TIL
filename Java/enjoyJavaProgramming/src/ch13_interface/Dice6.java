package ch13_interface;

public class Dice6 implements Dice
{
	// get�޼ҵ带 ����
	@Override
	public int get()
	{	
		return (int)(Math.random()*6)+1;
	}
}
