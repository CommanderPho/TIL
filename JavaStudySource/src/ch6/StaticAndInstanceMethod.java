package ch6;

class MyMath
{
		long a,b; 
		
		//�ν��Ͻ� ���� a, b���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����
		long add(){return a+b;}  // �ν��Ͻ� ���� a,b
		
		//�ν��Ͻ������� ������� �Ű����������� �۾��� ����
		static long add(long a, long b){return a+b;} //�������� a,b
}

public class StaticAndInstanceMethod {
	public static void main(String[] args) {
		//Ŭ���� �޼��� ȣ��, �ν��Ͻ� �������� ȣ�Ⱑ��
		System.out.println(MyMath.add(200L, 100L));
		
		MyMath myMath = new MyMath(); // �ν��Ͻ� ����
        myMath.a=200L;
        myMath.b=100L;
        //�ν��Ͻ��޼���� ��ü���� �Ŀ��� ȣ���� ������.
        System.out.println(myMath.add());
	}
}
