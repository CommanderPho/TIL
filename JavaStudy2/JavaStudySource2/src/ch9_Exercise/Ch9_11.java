package ch9_Exercise;

import java.util.Scanner;

public class Ch9_11 {
	public static void main(String[] args) {
		int from = 0;
		int to = 0 ;
		
		try{
			if(args.length != 2){
				throw new Exception("���� �ܰ� �� ��, �� ���� ������ �Է����ּ���");
			}
			from = Integer.parseInt(args[0]);
			to = Integer.parseInt(args[1]);
			
			if(!(2 <= from && from <= 9 && 2  <= to && to <= 9 ))
				throw new Exception("���� ������ 2�� 9������ ���̾�� �մϴ�.");
		} catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
		
		// ���� ��(from)�� �� ��(to) ���� �۾ƾ� �ϴϱ�
		if ( from > to){
			int tmp = from;
			from = to;
			to = from;
		}
		
		for(int i=from; i<=to; i++){
			for(int j=1; j<10; j++){
				System.out.printf("%d * %d = %d",i,j,i*j);
			}
			System.out.println();
		}

	}
}
