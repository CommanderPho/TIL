package ch4_Control_Flow_Statements;

public class FlowEx31 {
	public static void main(String[] args) {
		for(int i=0; i <= 10; i++){
			if(i%3==0)
				continue;
			/*
			 * continue���� �ݺ��� �������� ���� �� ������, �ݺ��� ����Ǵ� ���濡
			 * continue���� ������ �ݺ����� ������ �̵��Ͽ� ���� �ݺ����� �Ѿ��.
			 * for���� ��� ���������� �̵��ϸ�, while���� do~while���� ��� ���ǽ����� �̵�
			 * continue���� �ݺ��� ��ü�� ����� �ʴ´�.
			 */
			System.out.println(i);
		}
	}
}
