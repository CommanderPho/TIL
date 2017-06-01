package ch10;

public class Dice
{
	// �Ӽ����� ���� ���� ������ �ʹ�.
	private int faceCount;
	
	public Dice()
	{
		this.faceCount = 6;
	}
	
	// ������ �����ε�
	public Dice(int faceCount) throws IllegalArgumentException
	{
		// ���� 1�� �����̸� �ǹ̰� ����
		if(faceCount <=1)
		{
			throw new IllegalArgumentException("���� ���� 2�̻��̾�� �մϴ�.");
		}
		this.faceCount = faceCount;
	}

	public int getFaceCount()
	{
		return faceCount;
	}
	
	
}
