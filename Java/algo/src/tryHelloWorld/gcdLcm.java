package tryHelloWorld;

import java.util.Arrays;

class gcdLcm {

//	�ִ����� 
//  �ִ������� �� ���� ���� ������ �۰ų� ���� ������, 
//  ���� ���� 1�� ���ҽ�Ű�鼭 �� ���� ������ �������� ���� ���ϸ� �ȴ�.
    static int gcd(int a, int b){
    	int result = 0;
    	int smaller = b < a ? b : a;
    	for(int i = smaller; i>0; i--){
    		if( (a % i == 0) && (b % i == 0) ){
    			result = i;
    			break;
    		}
    	}
    	return result;
    }
//  �ּҰ����
//  �ּҰ������ �� ���� ū ������ ũ�ų� ���� ������,
//  ū ���� 1�� �����ϸ鼭 �� ���� ������ �������� ���� ���ϸ� �ȴ�.
    static int lcm(int a, int b){
    	int result = 0;
    	int bigger = a > b ? a : b;
    	
    	while(true){
    		if( (bigger % a == 0) && (bigger % b == 0)){
    			result = bigger;
    			break;
    		}
    		bigger++;
    	}
    	return result;
    }

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
    	System.out.println(gcdLcm.gcd(87, 61));
    	System.out.println(gcdLcm.lcm(87, 61));
    }
}