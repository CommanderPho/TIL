package tryHelloWorld;

// ��� ���� Ȧ�϶� ����� ¦�϶� ��� �� ����


public class StringExercise{
    String getMiddle(String word){
    	
    	String result = "";
    	int middleIndex=word.length()/2;
    	
    	// Ȧ���̸�
    	if(word.length()%2 != 0 ) {
    		result = word.substring(middleIndex,middleIndex+1);
    	} else {  // ¦����
    		result = word.substring(middleIndex-1, middleIndex+1);
    	}
    	return result;    
    	
//    	return word.substring(len/2 - (len+1)%2, len/2 + 1);
    }
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
        System.out.println(se.getMiddle("test"));
    }
}