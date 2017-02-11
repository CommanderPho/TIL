package ch11Exercise;

import java.util.*;

public class Ch11_10 {

	public static void main(String[] args) {
//		Set set = new HashSet();
		Set set = new LinkedHashSet();   // ���1
		int[][] board =  new int[5][5];
		
		for(int i=0; set.size()<25; i++)
			set.add((int)(Math.random()*50)+1+"");
		/*���2
		 * ArrayList list = new ArrayList(set);
		 * Collections.shuffle(list);
		 * Iterator it = list.iterator();
		 */
		
		Iterator it = set.iterator();
		
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[i].length; j++){
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] <10 ? "  ": " ")+board[i][j]);
			}
			System.out.println();
		}
	}
	
	/*
	 * HashSet�� ����� ������ �������� �ʰ� ��ü���� ���� ��Ŀ� ���� ������ ���� �ȴ�.
	 * ���� ���ڰ� �� ������ �ʴ´�.
	 * �� ��쿡�� ������ �����ϴ� LinkedHashSet�� �� ���� ����̴�
	 */
}
