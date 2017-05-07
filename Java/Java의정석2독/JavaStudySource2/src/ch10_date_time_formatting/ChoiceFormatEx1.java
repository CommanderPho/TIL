package ch10_date_time_formatting;

import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {
	public static void main(String[] args) {
		double[] limits = { 60, 70, 80, 90 }; // �ݵ�� ��������(->)
		// limits, grades���� ������ ������ ����� �Ѵ�.
		String[] grades = {"D","C","B","A"};
		int[] scores = {100,95,88,70,52,60,70};
		
		// 60~69 : D
		// 70~79 : C
		// 80~89 : B
		// 90~100 : A
		// Ư�� ������ ���ϴ� ���� ���ڿ��� ��ȯ.
		ChoiceFormat form = new ChoiceFormat(limits,grades);
		
		for(int i=0; i<scores.length; i++){
			System.out.println(scores[i]+":"+form.format(scores[i]));
		}
		/*
		 * 100:A
			95:A
			88:B
			70:C
			52:D
			60:D
			70:C
		 */
	}
}
