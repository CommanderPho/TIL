package ch3_operator_Excercise;

// ���� ������ ����� �����ÿ�

public class ch3_1 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'�� �����ڵ� 65
		
		System.out.println(1 + x << 33);
		// �켱���� '+' > '<<'
		// 1. 1+x -> 3
		// 2. 3 << 33 -> 3 << 1      // 32�� �׷����̹Ƿ� ��������� <<1�� ���...
		// 3. 0....11
		// 4. 0...110
		// 5. 6
		
		System.out.println(y >= 5 || x < 0 && x >2);
		// �켱����  '&&'�� '||'���� ����
		// 1. (x<0 && x>2)  -> 'x<0'���� false�̴ϱ� 'x>2'�� �ǳʶ� -> false
		// 2. x >= 5 || false
		// 3. true 
		
		System.out.println( y+= 10 - x++);
		// �켱���� ���� x++ �ε� �����ϱ� 10 -x �����ϰ� x�� 3�̵�
		// y+= 8  -> y = y + 8;
		// 13
		
		System.out.println(x+=2);
		// x�� 3�� �� ���¿��� x = x + 2 �̹Ƿ� 
		// 5
		
		System.out.println(!('A' <= c && c <= 'Z'));
		// ���� �Ⱥ��� c�� A �̹Ƿ� true
		// !true
		// false
		
		System.out.println('C'-c);
		// 'C' - 'A'  char���� �����̹Ƿ� int - int �� ��ȯ��
		// �ƽ�Ű�ڵ尡 ��� �ȳ����� ��������̹Ƿ�, ����° - ù��°�̹Ƿ� 2
		// A 65, B 66 C 67
		
		System.out.println('5'-'0');
		// char�� ���� ���� int������
		// 5 (int)
		// System.out.printf("%d",(int)'5'); // 53
		
		System.out.println(c+1);
		// char + int -> int + int
		// 65 + 1
		// 66(int)
		
		System.out.println(++c);
		// ����(��)�����ڴ� ����ȯ ����
		// c �� 'A' �̹Ƿ� 1�����ϸ� 'B'
		
		System.out.println(c++);
		// System.out.println(c);
		// c++;
		// �̹Ƿ�
		// B����µǰ� c�� 'C'�� ��
		System.out.println(c); //B
	}
}
