package ch9_Exercise;

public class Ch9_5 {
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}
	
	public static int count(String src, String target){
		int count = 0; // ã�� Ƚ��
		int pos = 0; // ã�� ������ ��ġ
		
		
		// �ݺ����� ����ؼ� �Ʒ��� ���� �ݺ�
		// 1. src���� target�� pos�� ��ġ���� ã�´�.
		// 2. ã���� count�� ���� 1 ���� ��Ű��, pos�� ���� target.length��ŭ ����
		// indexOf�� ����� -1�̸� �ݺ����� ����������  count�� ��ȯ
		
//		while(true){
//			int idx = src.indexOf(target,pos);
//
//			if(idx == -1){
//				break;
//			}
//			else{
//				count++;
//				pos = idx + target.length();
//			}
//		}
//
//		while(true){
//			
//			if( (pos = src.indexOf(target, pos)) != -1){
//				count++;
//				pos += target.length();
//			} else
//				break;
//		}
		
		while((pos = src.indexOf(target, pos)) != -1){
			count++;
			pos += target.length();
		}
		
		return count;
	}
}
