package ch5_Exercise;

public class Ch5_7 {
	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("UUSAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		int money = Integer.parseInt(args[0]);
		
		System.out.println(money);
		
		int[] coinUnit = {500, 100, 50, 10 };
		int[] coin = {5, 5, 5, 5};
		
		for(int i=0; i<coinUnit.length;i++){
			int coinNum = 0;
			// �ݾ��� ���������� ������ �ʿ��� ������ ������ ���Ѵ�.
			coinNum = money / coinUnit[i];
			
			// �迭  coint���� coinNum��ŭ�� ������ ����
			if(coin[i] >= coinNum) coin[i] -= coinNum;
			else {
				coinNum = coin[i];
				coin[i] = 0;
			}
			
			// �ݾ׿��� ������ ����(coninNum)�� ���������� ���� ���� ����.
			money -= coinUnit[i] * coinNum;
		}
		if(money>0){
			System.out.println("�Ž������� �����Ϻ��.");
			System.exit(0);
		}
		System.out.println("���� ������ ����");
		for(int i=0; i<coinUnit.length; i++){
			System.out.println(coinUnit[i] + "��:"+coin[i]);
		}
	}
}
