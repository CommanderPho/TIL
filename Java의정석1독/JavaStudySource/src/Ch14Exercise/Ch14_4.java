package Ch14Exercise;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;


public class Ch14_4 {
	public static void main(String[] args) {
		// �� ���� �ֻ����� ������ ���� ���� ���� 6�� ��츦 ��� ����Ͻÿ�.
		// Hint �迭�� ����Ͻÿ�.
		// [1,5]
		// [2.4]
		// [3.3]
		// [4,2]
		// [5,1]
		
		// �ֻ��� �غ�?
		// ���� 6�ΰ��
		// ��������? for 1~5   �ϸ� �ֻ��� �����°� �ƴ�...
		// �迭�� ������ΰ�?
		
//		int[] diceSet = new int[10];
//		int index = 0;
//		
//		while(true)
//		{
//			int dice1 = (int)(Math.random()*5)+1; // �ֻ���1 �غ�
//			int dice2 = (int)(Math.random()*5)+1; // �ֻ���2 �غ�
//			int diceSum = dice1+dice2;
//			
//			if(diceSum ==6){
//				diceSet[index] = dice1;
//				diceSet[index+1] = dice2;
//				index += 2;
//				if(index==10)
//					break;
//			}
//		}
//		System.out.println(Arrays.toString(diceSet));
		
//		[1, 5, 4, 2, 4, 2, 4, 2, 2, 4]  �ߺ��� �� �����ؾ� �ǳ�...
// �ߺ� �Ȱ� �����ϰ� �迭�� �� ���̸� ���׸� �Ǵµ�... ���ٳ� ��Ʈ���� �����ϴ°ǰ�? �ٵ� ��� �������...����
// ����� ���� �̹� �˰������ϱ�... �� �� ����? ��...
		
//		for(int dice1=1; dice1<6; dice1++){
//			for(int dice2=1; dice2<6; dice2++)
//			{
//				int diceSum = dice1+dice2;
//				if(diceSum == 6){
//					System.out.println("["+dice1+","+dice2+"]");
//				}
//			}
//		}
		
//		���� ��... ���� ��Ʈ�� �迭...
//      int�迭�� ������ ��Ʈ�� �����ϰ� ���ٰ����� üũ?
//		IntStream intStream = IntStream.rangeClosed(1, 5);   // 1,2,3,4,5  / �ֻ��� �����µ� ���ʴ�� ������ �� ���� �ȵǰ�...
//		IntStream diceStream = IntStream.
		
//		IntStream intStream = new Random().ints(5);
//		intStream.forEach(System.out::Println);
		
//		IntStream diceStream = new Random().ints(1,6).distinct().limit(5); // 1~5���� ���� �߻�, �ߺ� ����... �� �����ϱ� ���� �ʱ�.
//		diceStream.forEach(System.out::print);
		
		//�ֻ��� �غ�
//		IntStream dice1Stream = new Random().ints(1,6).distinct().limit(5);
//		IntStream dice2Stream = new Random().ints(1,6).distinct().limit(5); 
		//   new Random().ints(1,6).distinct().limit(5); �ߺ��� ���� �ȵ��...  ���ٿ� �迭�� �� ��� ����...?
		// ���� 6�ΰ� ��� ã��...? dice1�� dice2�� ��� 6���� ¦���� 36���� int �迭�� ����� ��ġ��?  36��... map? flatMap? g
		
		
//		dice1Stream.map(i-> new int[]{i,i});
		
		
		//		Stream<Integer[]> diceSumStream;
		/*
		 * ���� ����... Stream<String[]> strArrStrm = Stream.of( new String[]{"abc","dfe","ghi"});
		 * �̰Ÿ� Stream<String>�ٲٷ��� �� �� flatMap...
		 */
		
		//�ֻ��� �ٽ� �غ�...�� ������
		
//		Stream<Integer> dice1Stream = diceReady();  
//		Stream<Integer> dice2Stream = diceReady();
////		int[] adf = dice2Stream.toArray();
////		System.out.println(Arrays.toString(adf));
//		
//		//  ������ ��°ġ��... 1�� 2�ǿ�Ҹ� ¦����� �ϴµ�... �𸣰ھ ��Ʈ���� �迭�� �ߴٰ� �ٽ� ��Ʈ������...��...
////		IntStream<int[]> diceSum; ��...IntStream�� ���׸��� �ȵǴ±��� �� �翬�ϳ�... ��... �׷� IntStream ��ſ� Stream<Integer>
//		
////		Stream<int[]> diceSetStream; 
//		// �� ��� ¦��� ������?
////		Integer[] dice2Array = dice2Stream.toArray(Integer[]::new);
//		Integer[] dice2Array = dice2Stream.toArray(size->new Integer[size]);
//		
////		Stream<int[]> diceSetStream = dice1Stream.flatMap(i1-> dice2Stream.map(i2-> new int[]{i1,i2}));
//		Stream<int[]> diceSetStream = dice1Stream.flatMap(i1-> Stream.of(dice2Array).map(i2-> new int[]{i1,i2}));
//		
//		
////		diceSetStream.forEach(System.out::println); �迭�ּҰ� ������...
//		diceSetStream.forEach(i->System.out.println(Arrays.toString(i))); 
		//���� �� �̷����� �� ������  ����ϴٰ� ù ��° 6���� �ϰ� ��Ʈ�������°� ������...
		//dice1Stream.flatMap(i1-> dice2Stream.map(i2-> new int[]{i1,i2})).forEach(...) �ε� ù ��° ���� dice2Stream�� �Ҹ��ϴϱ�  �������±� ��...
		// �׷� �޹� ��������ߴµ�... ����... ������ Stream.of(��Ʈ�迭) �׷� dice2Stream�� ��Ʈ�迭�� ����� �����ϸ� �ǰڱ���?
		// IntStream�� toArray()�ϸ� �Ǵµ�
		// Straem<T>�� toArray(IntFunction<A[]> generator) �̰ǹ���...
		// �׳�
//		Integer[] dice2Array = dice2Stream.toArray(Integer[]::new);
		
//		dice1Stream.flatMap(i1-> Stream.of(dice2Array).map(i2->new int[]{i1,i2})).filter(iArry->iArry[0]+iArry[1] == 6).forEach(iArry->System.out.println(Arrays.toString(iArry)));
	
//		Stream<int[]> diceSumStream = dice1Stream.flatMap(i->Stream.of(1,2,3,4,5,6).map(i2->new int[]{i,i2}));
		
//		Stream<String> str1 = Stream.of(new String[]{"123","456","789"});
//		Stream<String> str2 = Stream.of(new String[]{"abc","def","ghi"});
//		Stream<String> str3 = Stream.concat(str1, str2);
//		str3.forEach(System.out::println);
		
//		�ֻ��� �غ�
		Stream<Integer> dice1Stream = diceReady();  
		Stream<Integer> dice2Stream = diceReady();
		
//		�ֻ��� ¦�� ����� ���� dice2Stream�� Integer[]�� ��ȯ ��Ʈ���� ��� �Ҹ��ϱ� ������ ��� �����ؾ� �Ѵ�.
//		Integer[] dice2Array = dice2Stream.toArray(Integer[]::new);
		Integer[] dice2Array = dice2Stream.toArray(size->new Integer[size]);
		
		dice1Stream.flatMap( // �Ʒ�  map�� �ϸ� ->  Stream<int[]>  �ű⿡ �� map�� �ϸ� Stream<Stream<int[]>> �Ǵϱ�
							 // map ���� flatMap�ؼ� Stream<int[]>�� ���ְ�
							 // Stream.of(dice2Array)�ؼ� ��� �������ְ�
				i1-> Stream.of(dice2Array).map(i2->new int[]{i1,i2}))
		.filter(i->i[0]+i[1] == 6)		//[2, 4] �䷱���½��̽�Ʈ���� �����Ƿ� �� ���� ���� 6�ΰ� �ɷ�����(ã�Ƴ��� ����)
		.forEach(i->System.out.println(Arrays.toString(i)));  // ���ͷ� �ɷ��� ��(����6�ΰ�)��� 'int[]'�̹Ƿ� ����Ҷ� Arrays.toString()���
		// �迭 ��Ʈ�� ���� �پ�
		
/*
 *    	Stream<Integer> dice1Stream = diceReady();  
		Stream<Integer> dice2Stream = diceReady();
		
		Integer[] dice2Array = dice2Stream.toArray(Integer[]::new);
		
		dice1Stream.flatMap(i1-> Stream.of(dice2Array).map(i2->new int[]{i1,i2}))
				   .filter(i->i[0]+i[1] == 6)	
				   .forEach(i->System.out.println(Arrays.toString(i)));
 */
		
		
	}
	static Stream<Integer> diceReady(){
		return new Random().ints(1,7).distinct().limit(6).boxed();   // 1~6 ��������
	}
}
