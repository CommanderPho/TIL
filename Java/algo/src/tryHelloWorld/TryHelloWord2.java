package tryHelloWorld;

import java.util.Arrays;

public class TryHelloWord2 {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
		int m = a, n = b;
        int r;
        while(true){
        	r = a % b;
        	if(r==0) {
        		answer[0] = b;
        		break;
        	}
        	else{
        		a = b;
        		b = r;
        	}
        }
        
        answer[1] = m * n / answer[0];
        
        return answer;
    }
  
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        TryHelloWord2 c = new TryHelloWord2();
        System.out.println(Arrays.toString(c.gcdlcm(87, 61)));
    }
}