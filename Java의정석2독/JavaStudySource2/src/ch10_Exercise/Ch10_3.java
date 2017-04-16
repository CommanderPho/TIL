package ch10_Exercise;

import java.text.DecimalFormat;

public class Ch10_3 {
	public static void main(String[] args) throws Exception{
		String data = "123,456,789.5";
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#,####");
		
		Number num = df.parse(data);
		
		double d = num.doubleValue();
		System.out.println("data:"+data);
		System.out.println("�ݿø� : "+ Math.round(d));
		System.out.println("������: " + df2.format(d));
	}
}
