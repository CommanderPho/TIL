package ch12;

// �߻� Ŭ���� : ���� �̷��� ���ø� �޼ҵ� ���Ͽ��� ���� ���
// �߻� Ŭ������ �ν��Ͻ��� �Ǹ� �ȵǴ� ��
public abstract class AbstractFactory
{	
	// final �޼ҵ� - �������̵� ����
	// ���ø��޼ҵ����� : �޼ҵ��� ������ ���
	// abstract�� �ƴ� �޼ҵ嵵 ���� �� ����
	public final void exex()
	{
		init();
		make();
		clear();
	}
	// �޼ҵ尡 �������̵� �� ������ �ڽ� �޼ҵ尡 ����
	protected abstract void init();
	protected abstract void make();
	protected abstract void clear();
}
