package ch6Exercise;

public class Ch6_8 {
	int kind;
	int num;
	
	static int widht;
	static int height;
	
	Ch6_8(int k, int n){
		kind = k;
		num = n;
	}
	public static void main(String[] args) {
		Ch6_8 test = new Ch6_8(1,1);
	}

}
// �� �ڵ忡 ���ǵ��� �������� �������� �����ؼ� �����ÿ�
// Ŭ�������� (static ����) : widht, height
// �ν��Ͻ����� kind , num
// �������� args, test, k , n