package ch12_Generics_Enum_Annotation;

enum Transportation
{	
	// �߻� �޼��� fare()�� �Ȱ��� �������� ����������, �ٸ���
	// ������ ���� �ְ� �Ϸ��� �߻� �޼���� ������ ��
	BUS(100) { int fare(int distance){return distance * BASIC_FARE; }},
	TRAIN(150) { int fare(int distance){return distance * BASIC_FARE; }},
	SHIP(100) { int fare(int distance){return distance * BASIC_FARE; }},
	AIRPLANE(300) { int fare(int distance){return distance * BASIC_FARE; }};
	
	protected final int BASIC_FARE;

	private Transportation(int bASIC_FARE)
	{
		BASIC_FARE = bASIC_FARE;
	}
	
	public int getBaicFare() { return BASIC_FARE; }
	
	abstract int fare(int distance);
	
}

public class EnumEx3
{
	public static void main(String [] args)
	{
		System.out.println("bus fare = " + Transportation.BUS.fare(100));
		System.out.println("train fare = " + Transportation.TRAIN.fare(100));
		System.out.println("ship fare = " + Transportation.SHIP.fare(100));
		System.out.println("airplane fare = " + Transportation.AIRPLANE.fare(100));
	}
}
