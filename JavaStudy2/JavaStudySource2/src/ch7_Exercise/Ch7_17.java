package ch7_Exercise;
/*
 * �Ʒ� �� ���� Ŭ�����κ��� ����κ��� �̾Ƽ� Unit�̶�� Ŭ������ �����, �� Ŭ������ ��� �޵���
 */
//class Marine{
//	int x, y;
//	void move(int x, int y){}
//	void stop(){}
//	void stimPack(){}
//}
//
//class Tank{
//	int x, y;
//	void move(int x, int y){}
//	void stop(){}
//	void changeMode(){}
//}
//
//class Dropship{
//	int x, y;
//	void move(int x, int y){}
//	void stop(){}
//	void load(){}
//	void unload(){}
//}
// ����Ȱ� int x, y; void move(int x, int y){} void stop(){}
abstract class Unit{  // �߻�Ŭ����
	int x, y;
	abstract void move(int x, int y);  // �߻�޼���, Ŭ�������� �̵������ �ٸ��Ƿ� move�޼���� �߻�޼����
	void stop(){}
}

class Marine extends Unit{
	void stimPack(){}
	@Override
	void move(int x, int y) {}
}

class Tank extends Unit{
	void changeMode(){}
	@Override
	void move(int x, int y) {}
}

class Dropship extends Unit{
	void load(){}
	void unload(){}
	@Override
	void move(int x, int y) {}
}
public class Ch7_17 {

}
