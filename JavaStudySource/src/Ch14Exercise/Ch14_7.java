package Ch14Exercise;
import java.util.*;
import java.util.stream.*;
public class Ch14_7 {
	public static void main(String[] args) {
		IntStream intStream = new Random().ints(6,1,46);    // 6�� 1~45����
		intStream.distinct().sorted().forEach(System.out::println);  // �ߺ�����   / ���� / ���
		
		
	}
}
