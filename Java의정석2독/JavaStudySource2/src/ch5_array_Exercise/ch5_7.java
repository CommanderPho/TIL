package ch5_array_Exercise;
/*
 * �ݾװ�� �Ŀ� ���Ǳ����α׷�����...
 */
public class ch5_7 {
	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		// ���ڿ��� ���ڷ� ��ȯ. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻�
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money="+money);
		
		int[] coinUnit = { 500, 100, 50, 10}; // ������ ����
		int[] coin = { 5, 5, 5, 5}; // ������ ������ ����
		
		for(int i=0; i<coinUnit.length; i++){
			int coinNum = 0;
			//1.money�� ���������� ������ �ʿ��� ������ ������ ���Ѵ�.
			coinNum = money/coinUnit[i];
			
			//2.�迭 coin���� coinNum��ŭ�� ������ ����(���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.)
			if(coin[i] >= coinNum) coin[i] -= coinNum;
			else {
				coinNum = coin[i];
				coin[i] = 0;
			};
			
			//3. �ݾ׿��� ������ ����(coinNum)�� ���������� ���� ���� ����.
			money -= coinUnit[i] * coinNum;
			
			System.out.println(coinUnit[i]+"��: "+coinNum);
		}
		if(money>0){
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0);
		}
		System.out.println("=���� ������ ����=");
		
		for(int i=0; i<coinUnit.length; i++)
			System.out.println(coinUnit[i]+"��: "+coin[i]);
	}
}
