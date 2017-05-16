package basic;

public class NumToHangul {
	public static void main(String[] args) {
		
		System.out.print(numToHangul(3000));
	}
	public static String numToHangul(long money){
		
		final String[] NUMBER = { "", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		final String[] UNIT = { "", "��", "��", "õ" };
		final String[] UNITM = {"", "��", "��", "��", "��"};
		
		String moneyString = String.valueOf(money);
		
		int len = moneyString.length();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = len-1; i>=0; i--){
			int num = moneyString.charAt(len-1-i) - 48;
			sb.append(NUMBER[num]);
			
			if( num > 0 )
				sb.append(UNIT[i%4]);
			if( i % 4 == 0)
				sb.append(UNITM[i/4]);
		}
		
		return sb.toString();
	}
}
