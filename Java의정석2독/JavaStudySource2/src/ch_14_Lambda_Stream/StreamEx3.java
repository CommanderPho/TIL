package ch_14_Lambda_Stream;

import java.util.*;
import java.util.stream.*;

public class StreamEx3 {
	public static void main(String[] args) {
		Student[] stuArr = { 
				new Student("������",3,300),
				  new Student("���ڹ�",1,200),
				  new Student("���ڹ�",2,100),
				  new Student("���ڹ�",2,150),
				  new Student("���ڹ�",1,200),
				  new Student("���ڹ�",3,290),
				  new Student("���ڹ�",3,180)
			};
		
		Stream<Student> stuStream = Stream.of(stuArr);
		stuStream.sorted(Comparator.comparing(Student::getBan)
								   .thenComparing(Comparator.naturalOrder()))
								   .forEach(System.out::println);
		stuStream = Stream.of(stuArr);
		IntStream stuScoreStream = stuStream.mapToInt(Student::getTotalScore);
		
		IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
		
		System.out.println("count="+stat.getCount());
		System.out.println("sum="+stat.getSum());
		System.out.printf("average=%.2f%n",stat.getAverage());
		System.out.println("max="+stat.getMax());
		System.out.println("min="+stat.getMin());
		
	}
}
